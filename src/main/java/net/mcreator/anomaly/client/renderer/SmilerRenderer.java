
package net.mcreator.anomaly.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.anomaly.entity.SmilerEntity;
import net.mcreator.anomaly.client.model.Modelsmiler;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SmilerRenderer extends MobRenderer<SmilerEntity, Modelsmiler<SmilerEntity>> {
	public SmilerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsmiler(context.bakeLayer(Modelsmiler.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<SmilerEntity, Modelsmiler<SmilerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("anomaly:textures/entities/texture_18.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SmilerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SmilerEntity entity) {
		return new ResourceLocation("anomaly:textures/entities/texture_18.png");
	}
}
