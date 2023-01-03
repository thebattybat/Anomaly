
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.anomaly.item.EmptyAlmondWaterItem;
import net.mcreator.anomaly.item.AlmondWaterItem;
import net.mcreator.anomaly.AnomalyMod;

public class AnomalyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnomalyMod.MODID);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_PANEL = block(AnomalyModBlocks.FLUORESCENT_LIGHT_PANEL,
			AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_PANEL_FLICKERING = block(AnomalyModBlocks.FLUORESCENT_LIGHT_PANEL_FLICKERING,
			AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> WALLPAPER = block(AnomalyModBlocks.WALLPAPER, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> TILE = block(AnomalyModBlocks.TILE, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> CARPET = block(AnomalyModBlocks.CARPET, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> MOLD_CREATURE = REGISTRY.register("mold_creature_spawn_egg",
			() -> new ForgeSpawnEggItem(AnomalyModEntities.MOLD_CREATURE, -13421773, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PLACER = block(AnomalyModBlocks.PLACER, null);
	public static final RegistryObject<Item> INFECTED_WALLPAPER = block(AnomalyModBlocks.INFECTED_WALLPAPER, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> INFECTED_CARPET = block(AnomalyModBlocks.INFECTED_CARPET, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> INFECTED_TILE = block(AnomalyModBlocks.INFECTED_TILE, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> MOLD = block(AnomalyModBlocks.MOLD, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> LEVEL_0_EXIT_TO_LEVEL_1 = block(AnomalyModBlocks.LEVEL_0_EXIT_TO_LEVEL_1, null);
	public static final RegistryObject<Item> EXIT_SIGN = block(AnomalyModBlocks.EXIT_SIGN, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> TUBE_LIGHT = block(AnomalyModBlocks.TUBE_LIGHT, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> WHITE_BRICKS = block(AnomalyModBlocks.WHITE_BRICKS, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> CEMENT = block(AnomalyModBlocks.CEMENT, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> PAINTED_CEMENT = block(AnomalyModBlocks.PAINTED_CEMENT, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> F_SIGN = block(AnomalyModBlocks.F_SIGN, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> A_SIGN = block(AnomalyModBlocks.A_SIGN, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> E_SIGN = block(AnomalyModBlocks.E_SIGN, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> ALMOND_WATER = REGISTRY.register("almond_water", () -> new AlmondWaterItem());
	public static final RegistryObject<Item> EMPTY_ALMOND_WATER = REGISTRY.register("empty_almond_water", () -> new EmptyAlmondWaterItem());
	public static final RegistryObject<Item> CRATE = block(AnomalyModBlocks.CRATE, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> METAL_DOOR = doubleBlock(AnomalyModBlocks.METAL_DOOR, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> WHITE_CEMENT = block(AnomalyModBlocks.WHITE_CEMENT, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> LEVEL_1_PLACER = block(AnomalyModBlocks.LEVEL_1_PLACER, null);
	public static final RegistryObject<Item> PARKING_PLACER = block(AnomalyModBlocks.PARKING_PLACER, null);
	public static final RegistryObject<Item> IMMEDIATE_PARKING_PLACER = block(AnomalyModBlocks.IMMEDIATE_PARKING_PLACER, null);
	public static final RegistryObject<Item> CARPET_STAIRS = block(AnomalyModBlocks.CARPET_STAIRS, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> DRAWER = block(AnomalyModBlocks.DRAWER, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> DESKTOP = block(AnomalyModBlocks.DESKTOP, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> CHAIR = block(AnomalyModBlocks.CHAIR, AnomalyModTabs.TAB_MAZES_N_ANOMALIES);
	public static final RegistryObject<Item> SMILER = REGISTRY.register("smiler_spawn_egg",
			() -> new ForgeSpawnEggItem(AnomalyModEntities.SMILER, -16777216, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NULL_BLOCK = block(AnomalyModBlocks.NULL_BLOCK, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
