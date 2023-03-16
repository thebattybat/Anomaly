
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnomalyModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("anomaly", "carpetfootsteps"), new SoundEvent(new ResourceLocation("anomaly", "carpetfootsteps")));
		REGISTRY.put(new ResourceLocation("anomaly", "carpetbreakplace"), new SoundEvent(new ResourceLocation("anomaly", "carpetbreakplace")));
		REGISTRY.put(new ResourceLocation("anomaly", "level0ambient"), new SoundEvent(new ResourceLocation("anomaly", "level0ambient")));
		REGISTRY.put(new ResourceLocation("anomaly", "lightpower"), new SoundEvent(new ResourceLocation("anomaly", "lightpower")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
