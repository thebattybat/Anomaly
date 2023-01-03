
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AnomalyModTabs {
	public static CreativeModeTab TAB_MAZES_N_ANOMALIES;
	public static CreativeModeTab TAB_ANOMALY_ITEMS;

	public static void load() {
		TAB_MAZES_N_ANOMALIES = new CreativeModeTab("tabmazes_n_anomalies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnomalyModBlocks.WALLPAPER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ANOMALY_ITEMS = new CreativeModeTab("tabanomaly_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnomalyModItems.ALMOND_WATER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
