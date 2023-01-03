
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.anomaly.client.renderer.SmilerRenderer;
import net.mcreator.anomaly.client.renderer.BackroomsEntityRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnomalyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AnomalyModEntities.MOLD_CREATURE.get(), BackroomsEntityRenderer::new);
		event.registerEntityRenderer(AnomalyModEntities.SMILER.get(), SmilerRenderer::new);
	}
}
