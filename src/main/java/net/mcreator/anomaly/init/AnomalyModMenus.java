
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.anomaly.world.inventory.DrawerGuiMenu;
import net.mcreator.anomaly.AnomalyMod;

public class AnomalyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AnomalyMod.MODID);
	public static final RegistryObject<MenuType<DrawerGuiMenu>> DRAWER_GUI = REGISTRY.register("drawer_gui", () -> IForgeMenuType.create(DrawerGuiMenu::new));
}
