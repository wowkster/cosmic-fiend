package com.wowkster.cosmic_fiend.client;

public class CosmicFiendRenderer
        extends FCGhostRenderer<EntityCosmicFiend, ModelCosmicFiend> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation("forestcraft", "textures/entity/cosmic_fiend/cosmic_fiend.png");

    public CosmicFiendRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ModelCosmicFiend(), 3.0f);
        this.func_177094_a((LayerRenderer)new LayerCosmicFiend((IEntityRenderer)this));
        this.setGhostLayers(0.5f, 10);
    }

    protected void preRenderCallback(EntityCosmicFiend entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        double i = 8.0;
        float f = 1.0f + 0.15f * (float)i;
        matrixStackIn.func_227862_a_(f, f, f);
    }

    public void render(EntityCosmicFiend entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.func_225623_a_((MobEntity)entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        float offset = Math.min(2.0f, (1.0f - entityIn.func_110143_aJ() / entityIn.func_110138_aP()) * 1.5f + 0.5f);
        this.renderGhost(entityIn, matrixStackIn, bufferIn, partialTicks, packedLightIn, entityYaw, offset);
    }

    public ResourceLocation getEntityTexture(EntityCosmicFiend entity) {
        return TEXTURE;
    }
}
