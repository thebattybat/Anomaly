
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.anomaly.AnomalyMod;

public class AnomalyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AnomalyMod.MODID);
	public static final RegistryObject<SoundEvent> CARPETFOOTSTEPS = REGISTRY.register("carpetfootsteps", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("anomaly", "carpetfootsteps")));
	public static final RegistryObject<SoundEvent> CARPETBREAKPLACE = REGISTRY.register("carpetbreakplace", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("anomaly", "carpetbreakplace")));
	public static final RegistryObject<SoundEvent> LEVEL0AMBIENT = REGISTRY.register("level0ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("anomaly", "level0ambient")));
	public static final RegistryObject<SoundEvent> LIGHTPOWER = REGISTRY.register("lightpower", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("anomaly", "lightpower")));
}
