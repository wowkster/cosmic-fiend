package com.wowkster.cosmic_fiend.client;


import com.mojang.blaze3d.matrix.MatrixStack;
import java.util.ArrayList;
import java.util.List;

import com.wowkster.cosmic_fiend.util.MathUtils;
import com.wowkster.cosmic_fiend.util.Vector3;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.astemir.forestcraft.client.render.layer.LayerCosmicFiend;

@OnlyIn(value=Dist.CLIENT)
public abstract class GhostRenderer<T extends MobEntity, M extends EntityModel<T>>
        extends MobRenderer<T, M> {
    private List<GhostLayer> ghostLayers = new ArrayList<GhostLayer>();
    private int lastRenderedId = -1;
    private T lastRendered;

    public GhostRenderer(EntityRendererManager renderManagerIn, M entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    public void addGhostLayer(float offset) {
        this.ghostLayers.add(new GhostLayer(offset));
    }

    public void setGhostLayers(float offset, int count) {
        for (int i = 0; i < count; ++i) {
            this.addGhostLayer(offset);
        }
    }

    public boolean func_225626_a_(T livingEntityIn, ClippingHelper camera, double camX, double camY, double camZ) {
        boolean rendered = super.func_225626_a_(livingEntityIn, camera, camX, camY, camZ);
        if (rendered) {
            if (this.lastRenderedId == -1) {
                this.lastRenderedId = livingEntityIn.func_145782_y();
                this.lastRendered = livingEntityIn;
            }
        } else if (livingEntityIn.func_145782_y() == this.lastRenderedId) {
            this.lastRenderedId = -1;
            this.lastRendered = null;
        }
        return rendered;
    }

    public void renderGhost(T entityIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, float partialTicks, int packedLightIn, float entityYaw, float offset) {
        if (this.lastRendered == null) {
            this.lastRenderedId = -1;
        } else if (((MobEntity)this.lastRendered).field_70128_L) {
            this.lastRenderedId = -1;
            this.lastRendered = null;
        } else if (((MobEntity)this.lastRendered).field_70170_p.func_234923_W_() != ((MobEntity)entityIn).field_70170_p.func_234923_W_()) {
            this.lastRenderedId = -1;
            this.lastRendered = null;
        }
        for (GhostLayer layer : this.ghostLayers) {
            if (entityIn.func_145782_y() == this.lastRenderedId) {
                layer.update();
                layer.setOffset(offset);
            }
            matrixStackIn.func_227860_a_();
            this.func_225621_a_((LivingEntity)entityIn, matrixStackIn, ((MobEntity)entityIn).field_70173_aa, ((MobEntity)entityIn).field_70177_z, partialTicks);
            matrixStackIn.func_227861_a_((double)layer.getPos().func_195899_a(), (double)layer.getPos().func_195900_b(), (double)layer.getPos().func_195902_c());
            matrixStackIn.func_227860_a_();
            this.func_225620_a_((LivingEntity)entityIn, matrixStackIn, partialTicks);
            matrixStackIn.func_227863_a_(Vector3f.field_229181_d_.func_229187_a_(180.0f));
            matrixStackIn.func_227863_a_(Vector3f.field_229179_b_.func_229187_a_(-180.0f));
            matrixStackIn.func_227861_a_(0.0, (double)-1.501f, 0.0);
            this.field_77045_g.func_225598_a_(matrixStackIn, bufferIn.getBuffer(this.getGhostRenderType(this.func_110775_a((Entity)entityIn))), packedLightIn, FCGhostRenderer.func_229117_c_(entityIn, (float)this.func_225625_b_((LivingEntity)entityIn, 0.0f)), 1.0f, 1.0f, 1.0f, layer.getAlpha());
            for (LayerRenderer layerrenderer : this.field_177097_h) {
                if (!(layerrenderer instanceof LayerCosmicFiend)) continue;
                ((LayerCosmicFiend)layerrenderer).render(matrixStackIn, bufferIn, packedLightIn, (Entity)entityIn, ((MobEntity)entityIn).field_184619_aG, ((MobEntity)entityIn).field_70721_aZ, partialTicks, ((MobEntity)entityIn).field_70173_aa, entityYaw, ((MobEntity)entityIn).field_70125_A, layer.getAlpha());
            }
            matrixStackIn.func_227865_b_();
            matrixStackIn.func_227865_b_();
        }
    }

    public RenderType getGhostRenderType(ResourceLocation loc) {
        return RenderType.func_228644_e_((ResourceLocation)loc);
    }

    public class GhostLayer {
        private float alpha = 1.0f;
        private Vector3f pos = new Vector3f(0.0f, 0.0f, 0.0f);
        private Vector3f newPos = new Vector3f(0.0f, 0.0f, 0.0f);
        private float offset = 0.5f;

        public GhostLayer(float offset) {
            this.offset = offset;
            this.newPos = new Vector3f(this.pos.func_195899_a() + RandomUtils.randomFloat(-offset, offset), this.pos.func_195900_b() + RandomUtils.randomFloat(-offset, offset), this.pos.func_195902_c() + RandomUtils.randomFloat(-offset, offset));
        }

        public void update() {
            if (Math.abs(this.alpha) > 0.01f) {
                Vector3 p = MathUtils.interpolate(new Vector3(this.pos.func_195899_a(), this.pos.func_195900_b(), this.pos.func_195902_c()), new Vector3(this.newPos.func_195899_a(), this.newPos.func_195900_b(), this.newPos.func_195902_c()), 0.1f);
                this.alpha = MathUtils.interpolate(this.alpha, 0.0f, 0.1f);
                this.pos = new Vector3f(p.x, p.y, p.z);
            } else {
                this.alpha = 1.0f;
                this.pos = new Vector3f(0.0f, 0.0f, 0.0f);
                this.newPos = new Vector3f(this.pos.func_195899_a() + RandomUtils.randomFloat(-this.offset, this.offset), this.pos.func_195900_b() + RandomUtils.randomFloat(-this.offset, this.offset), this.pos.func_195902_c() + RandomUtils.randomFloat(-this.offset, this.offset));
            }
        }

        public void setOffset(float offset) {
            this.offset = offset;
        }

        public float getAlpha() {
            return this.alpha;
        }

        public Vector3f getPos() {
            return this.pos;
        }
    }
}
