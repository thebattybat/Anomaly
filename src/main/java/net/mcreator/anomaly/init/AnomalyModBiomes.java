
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.anomaly.world.biome.Level1BiomeBiome;
import net.mcreator.anomaly.world.biome.BackroomsBiomeBiome;
import net.mcreator.anomaly.AnomalyMod;

public class AnomalyModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AnomalyMod.MODID);
	public static final RegistryObject<Biome> LEVEL_0_BIOME = REGISTRY.register("level_0_biome", () -> BackroomsBiomeBiome.createBiome());
	public static final RegistryObject<Biome> LEVEL_1_BIOME = REGISTRY.register("level_1_biome", () -> Level1BiomeBiome.createBiome());
}
