
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.anomaly.AnomalyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnomalyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AnomalyMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAZES_N_ANOMALIES = REGISTRY.register("mazes_n_anomalies",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.anomaly.mazes_n_anomalies")).icon(() -> new ItemStack(AnomalyModBlocks.WALLPAPER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AnomalyModBlocks.FLUORESCENT_LIGHT_PANEL.get().asItem());
				tabData.accept(AnomalyModBlocks.FLUORESCENT_LIGHT_PANEL_FLICKERING.get().asItem());
				tabData.accept(AnomalyModBlocks.WALLPAPER.get().asItem());
				tabData.accept(AnomalyModBlocks.INFECTED_WALLPAPER.get().asItem());
				tabData.accept(AnomalyModBlocks.INFECTED_CARPET.get().asItem());
				tabData.accept(AnomalyModBlocks.INFECTED_TILE.get().asItem());
				tabData.accept(AnomalyModBlocks.MOLD.get().asItem());
				tabData.accept(AnomalyModBlocks.EXIT_SIGN.get().asItem());
				tabData.accept(AnomalyModBlocks.TUBE_LIGHT.get().asItem());
				tabData.accept(AnomalyModBlocks.WHITE_BRICKS.get().asItem());
				tabData.accept(AnomalyModBlocks.CEMENT.get().asItem());
				tabData.accept(AnomalyModBlocks.PAINTED_CEMENT.get().asItem());
				tabData.accept(AnomalyModBlocks.F_SIGN.get().asItem());
				tabData.accept(AnomalyModBlocks.A_SIGN.get().asItem());
				tabData.accept(AnomalyModBlocks.E_SIGN.get().asItem());
				tabData.accept(AnomalyModBlocks.CRATE.get().asItem());
				tabData.accept(AnomalyModBlocks.METAL_DOOR.get().asItem());
				tabData.accept(AnomalyModBlocks.WHITE_CEMENT.get().asItem());
				tabData.accept(AnomalyModBlocks.CARPET_STAIRS.get().asItem());
				tabData.accept(AnomalyModBlocks.DRAWER.get().asItem());
				tabData.accept(AnomalyModBlocks.DESKTOP.get().asItem());
				tabData.accept(AnomalyModBlocks.CHAIR.get().asItem());
				tabData.accept(AnomalyModBlocks.CARPET.get().asItem());
				tabData.accept(AnomalyModBlocks.TILE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ANOMALY_ITEMS = REGISTRY.register("anomaly_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.anomaly.anomaly_items")).icon(() -> new ItemStack(AnomalyModItems.ALMOND_WATER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AnomalyModItems.ALMOND_WATER.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AnomalyModItems.MOLD_CREATURE_SPAWN_EGG.get());
			tabData.accept(AnomalyModItems.SMILER_SPAWN_EGG.get());
		}
	}
}
