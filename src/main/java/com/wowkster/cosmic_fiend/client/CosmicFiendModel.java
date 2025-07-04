package com.wowkster.cosmic_fiend.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.wowkster.cosmic_fiend.entity.CosmicFiendEntity;
import com.wowkster.cosmic_fiend.util.Vector3;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CosmicFiendModel extends EntityModel<CosmicFiendEntity> {
    private final ModelRenderer space_fiend;
    private final ModelRenderer head;
    private final ModelRenderer bottom;
    private final ModelRenderer cube_r1;
    private final ModelRenderer legs;
    private final ModelRenderer leg;
    private final ModelRenderer a;
    private final ModelRenderer cube_r2;
    private final ModelRenderer b;
    private final ModelRenderer cube_r3;
    private final ModelRenderer c;
    private final ModelRenderer cube_r4;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leg2;
    private final ModelRenderer a2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer b2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer c2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leg3;
    private final ModelRenderer a3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer b3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer c3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer leg4;
    private final ModelRenderer a4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer b4;
    private final ModelRenderer cube_r15;
    private final ModelRenderer c4;
    private final ModelRenderer cube_r16;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r17;
    private final ModelRenderer leg5;
    private final ModelRenderer a5;
    private final ModelRenderer cube_r18;
    private final ModelRenderer b5;
    private final ModelRenderer cube_r19;
    private final ModelRenderer c5;
    private final ModelRenderer cube_r20;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r21;
    private final ModelRenderer top;
    private final ModelRenderer cube_r22;
    private final ModelRenderer eye;
    public CosmicFiendModel() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.space_fiend = new ModelRenderer((Model)this);
        this.space_fiend.setRotationPoint(3.0f, 6.0f, 16.0f);
        this.head = new ModelRenderer((Model)this);
        this.head.setRotationPoint(-4.0f, -24.0f, -16.0f);
        this.space_fiend.addChild(this.head);
        this.head.setTextureOffset(0, 115).addBox(-20.0f, -32.0f, 4.0f, 40.0f, 23.0f, 12.0f, 0.0f, false);
        this.head.setTextureOffset(104, 125).addBox(-14.0f, -32.0f, 16.0f, 29.0f, 23.0f, 12.0f, 0.0f, false);
        this.bottom = new ModelRenderer((Model)this);
        this.bottom.setRotationPoint(0.0f, -10.0f, 5.0f);
        this.head.addChild(this.bottom);
        this.bottom.setTextureOffset(0, 42).addBox(-20.0f, 1.0f, -22.0f, 40.0f, 9.0f, 33.0f, 0.0f, false);
        this.cube_r1 = new ModelRenderer((Model)this);
        this.cube_r1.setRotationPoint(4.0f, 34.0f, 11.0f);
        this.bottom.addChild(this.cube_r1);
        this.setRotationAngle(this.cube_r1, -0.3054f, 0.0f, 0.0f);
        this.cube_r1.setTextureOffset(112, 97).addBox(-25.0f, -27.0f, -43.0f, 42.0f, 10.0f, 18.0f, 0.0f, false);
        this.legs = new ModelRenderer((Model)this);
        this.legs.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bottom.addChild(this.legs);
        this.leg = new ModelRenderer((Model)this);
        this.leg.setRotationPoint(-19.0f, 3.0f, 2.0f);
        this.legs.addChild(this.leg);
        this.setRotationAngle(this.leg, 0.0f, -1.5708f, 0.5672f);
        this.a = new ModelRenderer((Model)this);
        this.a.setRotationPoint(0.0f, -1.0f, -1.0f);
        this.leg.addChild(this.a);
        this.setRotationAngle(this.a, -0.3491f, 0.0f, 0.0f);
        this.cube_r2 = new ModelRenderer((Model)this);
        this.cube_r2.setRotationPoint(0.0f, 26.0f, 4.0f);
        this.a.addChild(this.cube_r2);
        this.setRotationAngle(this.cube_r2, 0.3927f, 0.0f, 0.0f);
        this.cube_r2.setTextureOffset(0, 150).addBox(-7.0f, -26.0f, 0.0f, 14.0f, 14.0f, 9.0f, 0.0f, false);
        this.b = new ModelRenderer((Model)this);
        this.b.setRotationPoint(0.0f, 12.0f, 6.0f);
        this.a.addChild(this.b);
        this.cube_r3 = new ModelRenderer((Model)this);
        this.cube_r3.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.b.addChild(this.cube_r3);
        this.setRotationAngle(this.cube_r3, 0.1745f, 0.0f, 0.0f);
        this.cube_r3.setTextureOffset(0, 150).addBox(-6.0f, -14.0f, -1.75f, 12.0f, 14.0f, 7.0f, 0.0f, false);
        this.c = new ModelRenderer((Model)this);
        this.c.setRotationPoint(0.0f, 14.0f, 2.0f);
        this.b.addChild(this.c);
        this.cube_r4 = new ModelRenderer((Model)this);
        this.cube_r4.setRotationPoint(0.0f, 0.0f, -4.0f);
        this.c.addChild(this.cube_r4);
        this.setRotationAngle(this.cube_r4, 0.0436f, 0.0f, 0.0f);
        this.cube_r4.setTextureOffset(0, 0).addBox(-5.0f, -1.0f, -0.75f, 10.0f, 14.0f, 5.0f, 0.0f, false);
        this.bone4 = new ModelRenderer((Model)this);
        this.bone4.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.c.addChild(this.bone4);
        this.cube_r5 = new ModelRenderer((Model)this);
        this.cube_r5.setRotationPoint(0.0f, -14.0f, -2.0f);
        this.bone4.addChild(this.cube_r5);
        this.setRotationAngle(this.cube_r5, -0.0873f, 0.0f, 0.0f);
        this.cube_r5.setTextureOffset(0, 19).addBox(-4.0f, 11.0f, 1.0f, 8.0f, 6.0f, 4.0f, 0.0f, false);
        this.leg2 = new ModelRenderer((Model)this);
        this.leg2.setRotationPoint(21.0f, 3.0f, 2.0f);
        this.legs.addChild(this.leg2);
        this.setRotationAngle(this.leg2, 0.0f, 1.5708f, -0.5672f);
        this.a2 = new ModelRenderer((Model)this);
        this.a2.setRotationPoint(0.0f, -1.0f, -1.0f);
        this.leg2.addChild(this.a2);
        this.setRotationAngle(this.a2, -0.3491f, 0.0f, 0.0f);
        this.cube_r6 = new ModelRenderer((Model)this);
        this.cube_r6.setRotationPoint(0.0f, 26.0f, 4.0f);
        this.a2.addChild(this.cube_r6);
        this.setRotationAngle(this.cube_r6, 0.3927f, 0.0f, 0.0f);
        this.cube_r6.setTextureOffset(0, 150).addBox(-7.0f, -26.0f, 0.0f, 14.0f, 14.0f, 9.0f, 0.0f, true);
        this.b2 = new ModelRenderer((Model)this);
        this.b2.setRotationPoint(0.0f, 12.0f, 6.0f);
        this.a2.addChild(this.b2);
        this.cube_r7 = new ModelRenderer((Model)this);
        this.cube_r7.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.b2.addChild(this.cube_r7);
        this.setRotationAngle(this.cube_r7, 0.1745f, 0.0f, 0.0f);
        this.cube_r7.setTextureOffset(0, 150).addBox(-6.0f, -14.0f, -1.75f, 12.0f, 14.0f, 7.0f, 0.0f, true);
        this.c2 = new ModelRenderer((Model)this);
        this.c2.setRotationPoint(0.0f, 14.0f, 2.0f);
        this.b2.addChild(this.c2);
        this.cube_r8 = new ModelRenderer((Model)this);
        this.cube_r8.setRotationPoint(0.0f, 0.0f, -4.0f);
        this.c2.addChild(this.cube_r8);
        this.setRotationAngle(this.cube_r8, 0.0436f, 0.0f, 0.0f);
        this.cube_r8.setTextureOffset(0, 0).addBox(-5.0f, -1.0f, -0.75f, 10.0f, 14.0f, 5.0f, 0.0f, true);
        this.bone2 = new ModelRenderer((Model)this);
        this.bone2.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.c2.addChild(this.bone2);
        this.cube_r9 = new ModelRenderer((Model)this);
        this.cube_r9.setRotationPoint(0.0f, -14.0f, -2.0f);
        this.bone2.addChild(this.cube_r9);
        this.setRotationAngle(this.cube_r9, -0.0873f, 0.0f, 0.0f);
        this.cube_r9.setTextureOffset(0, 19).addBox(-4.0f, 11.0f, 1.0f, 8.0f, 6.0f, 4.0f, 0.0f, true);
        this.leg3 = new ModelRenderer((Model)this);
        this.leg3.setRotationPoint(2.0f, 9.0f, 8.0f);
        this.legs.addChild(this.leg3);
        this.setRotationAngle(this.leg3, 0.0f, 1.5708f, -0.5672f);
        this.a3 = new ModelRenderer((Model)this);
        this.a3.setRotationPoint(5.0f, 3.2235f, 9.3519f);
        this.leg3.addChild(this.a3);
        this.setRotationAngle(this.a3, -0.3491f, 0.0f, 0.0f);
        this.cube_r10 = new ModelRenderer((Model)this);
        this.cube_r10.setRotationPoint(0.0f, 26.0f, -16.0f);
        this.a3.addChild(this.cube_r10);
        this.setRotationAngle(this.cube_r10, -0.3927f, 0.0f, 0.0f);
        this.cube_r10.setTextureOffset(0, 150).addBox(-7.0f, -26.0f, -9.0f, 14.0f, 14.0f, 9.0f, 0.0f, true);
        this.b3 = new ModelRenderer((Model)this);
        this.b3.setRotationPoint(0.0f, 12.0f, 6.0f);
        this.a3.addChild(this.b3);
        this.cube_r11 = new ModelRenderer((Model)this);
        this.cube_r11.setRotationPoint(0.0f, 14.0f, -22.0f);
        this.b3.addChild(this.cube_r11);
        this.setRotationAngle(this.cube_r11, -0.1745f, 0.0f, 0.0f);
        this.cube_r11.setTextureOffset(0, 150).addBox(-6.0f, -14.0f, -5.25f, 12.0f, 14.0f, 7.0f, 0.0f, true);
        this.c3 = new ModelRenderer((Model)this);
        this.c3.setRotationPoint(0.0f, 14.0f, 2.0f);
        this.b3.addChild(this.c3);
        this.cube_r12 = new ModelRenderer((Model)this);
        this.cube_r12.setRotationPoint(0.0f, 0.0f, -24.0f);
        this.c3.addChild(this.cube_r12);
        this.setRotationAngle(this.cube_r12, -0.0436f, 0.0f, 0.0f);
        this.cube_r12.setTextureOffset(0, 0).addBox(-5.0f, -1.0f, -4.25f, 10.0f, 14.0f, 5.0f, 0.0f, true);
        this.bone3 = new ModelRenderer((Model)this);
        this.bone3.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.c3.addChild(this.bone3);
        this.cube_r13 = new ModelRenderer((Model)this);
        this.cube_r13.setRotationPoint(0.0f, -14.0f, -22.0f);
        this.bone3.addChild(this.cube_r13);
        this.setRotationAngle(this.cube_r13, 0.0873f, 0.0f, 0.0f);
        this.cube_r13.setTextureOffset(0, 19).addBox(-4.0f, 11.0f, -5.0f, 8.0f, 6.0f, 4.0f, 0.0f, true);
        this.leg4 = new ModelRenderer((Model)this);
        this.leg4.setRotationPoint(12.0f, 10.0f, 6.0f);
        this.legs.addChild(this.leg4);
        this.setRotationAngle(this.leg4, 0.0f, -1.5708f, 0.5672f);
        this.a4 = new ModelRenderer((Model)this);
        this.a4.setRotationPoint(-3.0f, -0.1501f, 11.5011f);
        this.leg4.addChild(this.a4);
        this.setRotationAngle(this.a4, -0.3491f, 0.0f, 0.0f);
        this.cube_r14 = new ModelRenderer((Model)this);
        this.cube_r14.setRotationPoint(0.0f, 26.0f, -16.0f);
        this.a4.addChild(this.cube_r14);
        this.setRotationAngle(this.cube_r14, -0.3927f, 0.0f, 0.0f);
        this.cube_r14.setTextureOffset(0, 150).addBox(-7.0f, -26.0f, -9.0f, 14.0f, 14.0f, 9.0f, 0.0f, false);
        this.b4 = new ModelRenderer((Model)this);
        this.b4.setRotationPoint(0.0f, 12.0f, 6.0f);
        this.a4.addChild(this.b4);
        this.cube_r15 = new ModelRenderer((Model)this);
        this.cube_r15.setRotationPoint(0.0f, 14.0f, -22.0f);
        this.b4.addChild(this.cube_r15);
        this.setRotationAngle(this.cube_r15, -0.1745f, 0.0f, 0.0f);
        this.cube_r15.setTextureOffset(0, 150).addBox(-6.0f, -14.0f, -5.25f, 12.0f, 14.0f, 7.0f, 0.0f, false);
        this.c4 = new ModelRenderer((Model)this);
        this.c4.setRotationPoint(0.0f, 14.0f, 2.0f);
        this.b4.addChild(this.c4);
        this.cube_r16 = new ModelRenderer((Model)this);
        this.cube_r16.setRotationPoint(0.0f, 0.0f, -24.0f);
        this.c4.addChild(this.cube_r16);
        this.setRotationAngle(this.cube_r16, -0.0436f, 0.0f, 0.0f);
        this.cube_r16.setTextureOffset(0, 0).addBox(-5.0f, -1.0f, -4.25f, 10.0f, 14.0f, 5.0f, 0.0f, false);
        this.bone5 = new ModelRenderer((Model)this);
        this.bone5.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.c4.addChild(this.bone5);
        this.cube_r17 = new ModelRenderer((Model)this);
        this.cube_r17.setRotationPoint(0.0f, -14.0f, -22.0f);
        this.bone5.addChild(this.cube_r17);
        this.setRotationAngle(this.cube_r17, 0.0873f, 0.0f, 0.0f);
        this.cube_r17.setTextureOffset(0, 19).addBox(-4.0f, 11.0f, -5.0f, 8.0f, 6.0f, 4.0f, 0.0f, false);
        this.leg5 = new ModelRenderer((Model)this);
        this.leg5.setRotationPoint(-13.0f, 9.0f, 8.0f);
        this.legs.addChild(this.leg5);
        this.setRotationAngle(this.leg5, 0.0f, -1.5708f, 0.5672f);
        this.a5 = new ModelRenderer((Model)this);
        this.a5.setRotationPoint(-5.0f, 0.6933f, 10.9638f);
        this.leg5.addChild(this.a5);
        this.setRotationAngle(this.a5, -0.3491f, 0.0f, 0.0f);
        this.cube_r18 = new ModelRenderer((Model)this);
        this.cube_r18.setRotationPoint(0.0f, 26.0f, -16.0f);
        this.a5.addChild(this.cube_r18);
        this.setRotationAngle(this.cube_r18, -0.3927f, 0.0f, 0.0f);
        this.cube_r18.setTextureOffset(0, 150).addBox(-7.0f, -26.0f, -9.0f, 14.0f, 14.0f, 9.0f, 0.0f, false);
        this.b5 = new ModelRenderer((Model)this);
        this.b5.setRotationPoint(0.0f, 12.0f, 6.0f);
        this.a5.addChild(this.b5);
        this.cube_r19 = new ModelRenderer((Model)this);
        this.cube_r19.setRotationPoint(0.0f, 14.0f, -22.0f);
        this.b5.addChild(this.cube_r19);
        this.setRotationAngle(this.cube_r19, -0.1745f, 0.0f, 0.0f);
        this.cube_r19.setTextureOffset(0, 150).addBox(-6.0f, -14.0f, -5.25f, 12.0f, 14.0f, 7.0f, 0.0f, false);
        this.c5 = new ModelRenderer((Model)this);
        this.c5.setRotationPoint(0.0f, 14.0f, 2.0f);
        this.b5.addChild(this.c5);
        this.cube_r20 = new ModelRenderer((Model)this);
        this.cube_r20.setRotationPoint(0.0f, 0.0f, -24.0f);
        this.c5.addChild(this.cube_r20);
        this.setRotationAngle(this.cube_r20, -0.0436f, 0.0f, 0.0f);
        this.cube_r20.setTextureOffset(0, 0).addBox(-5.0f, -1.0f, -4.25f, 10.0f, 14.0f, 5.0f, 0.0f, false);
        this.bone6 = new ModelRenderer((Model)this);
        this.bone6.setRotationPoint(0.0f, 14.0f, -2.0f);
        this.c5.addChild(this.bone6);
        this.cube_r21 = new ModelRenderer((Model)this);
        this.cube_r21.setRotationPoint(0.0f, -14.0f, -22.0f);
        this.bone6.addChild(this.cube_r21);
        this.setRotationAngle(this.cube_r21, 0.0873f, 0.0f, 0.0f);
        this.cube_r21.setTextureOffset(0, 19).addBox(-4.0f, 11.0f, -5.0f, 8.0f, 6.0f, 4.0f, 0.0f, false);
        this.top = new ModelRenderer((Model)this);
        this.top.setRotationPoint(4.0f, -32.0f, 6.0f);
        this.head.addChild(this.top);
        this.top.setTextureOffset(0, 0).addBox(-24.0f, -9.0f, -23.0f, 40.0f, 9.0f, 33.0f, 0.0f, false);
        this.cube_r22 = new ModelRenderer((Model)this);
        this.cube_r22.setRotationPoint(0.0f, 56.0f, 10.0f);
        this.top.addChild(this.cube_r22);
        this.setRotationAngle(this.cube_r22, 0.3054f, 0.0f, 0.0f);
        this.cube_r22.setTextureOffset(0, 84).addBox(-25.0f, -64.0f, -17.0f, 42.0f, 8.0f, 23.0f, 0.0f, false);
        this.eye = new ModelRenderer((Model)this);
        this.eye.setRotationPoint(0.0f, -20.0f, -5.0f);
        this.head.addChild(this.eye);
        this.eye.setTextureOffset(113, 0).addBox(-6.0f, -6.0f, -6.0f, 13.0f, 12.0f, 12.0f, 0.0f, false);
        this.initializeAnimator(COSMIC_FIEND_ANIMATIONS);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.space_fiend.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngles(CosmicFiendEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.eye.setCustomRotation(new Vector3(headPitch * ((float)Math.PI / 180), netHeadYaw * ((float)Math.PI / 180), 0.0f));
    }
}