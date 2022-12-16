package com.wowkster.cosmic_fiend.client;

public class CosmicFiendLayer<T extends Entity, M extends ModelCosmicFiend>
        extends AbstractEyesLayer {
    public static final RenderType RENDER_TYPE = FCRenderTypes.getEyesTransculent(new ResourceLocation("forestcraft", "textures/entity/cosmic_fiend/cosmic_fiend_overlay.png"));

    public CosmicFiendLayer(IEntityRenderer p_i226039_1_) {
        super(p_i226039_1_);
    }

    public void func_225628_a_(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, Entity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (WorldUtils.isNight(entitylivingbaseIn.field_70170_p)) {
            super.func_225628_a_(matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
        }
    }

    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, Entity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float alpha) {
        if (WorldUtils.isNight(entitylivingbaseIn.field_70170_p)) {
            IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.func_225636_a_());
            this.func_215332_c().func_225598_a_(matrixStackIn, ivertexbuilder, 0xF00000, OverlayTexture.field_229196_a_, 1.0f, 1.0f, 1.0f, alpha);
        }
    }

    public RenderType func_225636_a_() {
        return RENDER_TYPE;
    }
}
