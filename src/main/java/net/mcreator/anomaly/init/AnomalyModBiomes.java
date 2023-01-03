
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.anomaly.world.biome.Level1BiomeBiome;
import net.mcreator.anomaly.world.biome.BackroomsBiomeBiome;
import net.mcreator.anomaly.AnomalyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnomalyModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AnomalyMod.MODID);
	public static final RegistryObject<Biome> LEVEL_0_BIOME = REGISTRY.register("level_0_biome", () -> BackroomsBiomeBiome.createBiome());
	public static final RegistryObject<Biome> LEVEL_1_BIOME = REGISTRY.register("level_1_biome", () -> Level1BiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BackroomsBiomeBiome.init();
			Level1BiomeBiome.init();
		});
	}
}
