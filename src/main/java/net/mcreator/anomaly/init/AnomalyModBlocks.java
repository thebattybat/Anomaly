
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.anomaly.block.WhiteCementBlock;
import net.mcreator.anomaly.block.WhiteBricksBlock;
import net.mcreator.anomaly.block.WallpaperBlock;
import net.mcreator.anomaly.block.TubeLightBlock;
import net.mcreator.anomaly.block.TileBlock;
import net.mcreator.anomaly.block.PlacerBlock;
import net.mcreator.anomaly.block.ParkingPlacerBlock;
import net.mcreator.anomaly.block.PaintedCementBlock;
import net.mcreator.anomaly.block.NullBlockBlock;
import net.mcreator.anomaly.block.MoldBlock;
import net.mcreator.anomaly.block.MetalDoorBlock;
import net.mcreator.anomaly.block.Level1PlacerBlock;
import net.mcreator.anomaly.block.Level0ExitToLevel1Block;
import net.mcreator.anomaly.block.InfectedWallpaperBlock;
import net.mcreator.anomaly.block.InfectedTileBlock;
import net.mcreator.anomaly.block.InfectedCarpetBlock;
import net.mcreator.anomaly.block.ImmediateParkingPlacerBlock;
import net.mcreator.anomaly.block.FluorescentLightPanelFlickeringBlock;
import net.mcreator.anomaly.block.FluorescentLightPanelBlock;
import net.mcreator.anomaly.block.FSignBlock;
import net.mcreator.anomaly.block.ExitSignBlock;
import net.mcreator.anomaly.block.ESignBlock;
import net.mcreator.anomaly.block.DrawerBlock;
import net.mcreator.anomaly.block.DesktopBlock;
import net.mcreator.anomaly.block.CrateBlock;
import net.mcreator.anomaly.block.ChairBlock;
import net.mcreator.anomaly.block.CementBlock;
import net.mcreator.anomaly.block.CarpetStairsBlock;
import net.mcreator.anomaly.block.CarpetBlock;
import net.mcreator.anomaly.block.ASignBlock;
import net.mcreator.anomaly.AnomalyMod;

public class AnomalyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnomalyMod.MODID);
	public static final RegistryObject<Block> FLUORESCENT_LIGHT_PANEL = REGISTRY.register("fluorescent_light_panel",
			() -> new FluorescentLightPanelBlock());
	public static final RegistryObject<Block> FLUORESCENT_LIGHT_PANEL_FLICKERING = REGISTRY.register("fluorescent_light_panel_flickering",
			() -> new FluorescentLightPanelFlickeringBlock());
	public static final RegistryObject<Block> WALLPAPER = REGISTRY.register("wallpaper", () -> new WallpaperBlock());
	public static final RegistryObject<Block> TILE = REGISTRY.register("tile", () -> new TileBlock());
	public static final RegistryObject<Block> CARPET = REGISTRY.register("carpet", () -> new CarpetBlock());
	public static final RegistryObject<Block> PLACER = REGISTRY.register("placer", () -> new PlacerBlock());
	public static final RegistryObject<Block> INFECTED_WALLPAPER = REGISTRY.register("infected_wallpaper", () -> new InfectedWallpaperBlock());
	public static final RegistryObject<Block> INFECTED_CARPET = REGISTRY.register("infected_carpet", () -> new InfectedCarpetBlock());
	public static final RegistryObject<Block> INFECTED_TILE = REGISTRY.register("infected_tile", () -> new InfectedTileBlock());
	public static final RegistryObject<Block> MOLD = REGISTRY.register("mold", () -> new MoldBlock());
	public static final RegistryObject<Block> LEVEL_0_EXIT_TO_LEVEL_1 = REGISTRY.register("level_0_exit_to_level_1",
			() -> new Level0ExitToLevel1Block());
	public static final RegistryObject<Block> EXIT_SIGN = REGISTRY.register("exit_sign", () -> new ExitSignBlock());
	public static final RegistryObject<Block> TUBE_LIGHT = REGISTRY.register("tube_light", () -> new TubeLightBlock());
	public static final RegistryObject<Block> WHITE_BRICKS = REGISTRY.register("white_bricks", () -> new WhiteBricksBlock());
	public static final RegistryObject<Block> CEMENT = REGISTRY.register("cement", () -> new CementBlock());
	public static final RegistryObject<Block> PAINTED_CEMENT = REGISTRY.register("painted_cement", () -> new PaintedCementBlock());
	public static final RegistryObject<Block> F_SIGN = REGISTRY.register("f_sign", () -> new FSignBlock());
	public static final RegistryObject<Block> A_SIGN = REGISTRY.register("a_sign", () -> new ASignBlock());
	public static final RegistryObject<Block> E_SIGN = REGISTRY.register("e_sign", () -> new ESignBlock());
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> METAL_DOOR = REGISTRY.register("metal_door", () -> new MetalDoorBlock());
	public static final RegistryObject<Block> WHITE_CEMENT = REGISTRY.register("white_cement", () -> new WhiteCementBlock());
	public static final RegistryObject<Block> LEVEL_1_PLACER = REGISTRY.register("level_1_placer", () -> new Level1PlacerBlock());
	public static final RegistryObject<Block> PARKING_PLACER = REGISTRY.register("parking_placer", () -> new ParkingPlacerBlock());
	public static final RegistryObject<Block> IMMEDIATE_PARKING_PLACER = REGISTRY.register("immediate_parking_placer",
			() -> new ImmediateParkingPlacerBlock());
	public static final RegistryObject<Block> CARPET_STAIRS = REGISTRY.register("carpet_stairs", () -> new CarpetStairsBlock());
	public static final RegistryObject<Block> DRAWER = REGISTRY.register("drawer", () -> new DrawerBlock());
	public static final RegistryObject<Block> DESKTOP = REGISTRY.register("desktop", () -> new DesktopBlock());
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
	public static final RegistryObject<Block> NULL_BLOCK = REGISTRY.register("null_block", () -> new NullBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ExitSignBlock.registerRenderLayer();
			TubeLightBlock.registerRenderLayer();
			MetalDoorBlock.registerRenderLayer();
			ChairBlock.registerRenderLayer();
		}
	}
}
