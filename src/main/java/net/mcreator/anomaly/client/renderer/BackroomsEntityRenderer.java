
package net.mcreator.anomaly.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.anomaly.entity.BackroomsEntityEntity;
import net.mcreator.anomaly.client.model.Modelcustom_model;

public class BackroomsEntityRenderer extends MobRenderer<BackroomsEntityEntity, Modelcustom_model<BackroomsEntityEntity>> {
	public BackroomsEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BackroomsEntityEntity entity) {
		return new ResourceLocation("anomaly:textures/entities/texture_6.png");
	}
}
