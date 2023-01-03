
package net.mcreator.anomaly.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.anomaly.entity.SmilerEntity;
import net.mcreator.anomaly.client.model.Modelsmiler;

public class SmilerRenderer extends MobRenderer<SmilerEntity, Modelsmiler<SmilerEntity>> {
	public SmilerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsmiler(context.bakeLayer(Modelsmiler.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SmilerEntity, Modelsmiler<SmilerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("anomaly:textures/entities/texture_18.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SmilerEntity entity) {
		return new ResourceLocation("anomaly:textures/entities/texture_18.png");
	}
}
