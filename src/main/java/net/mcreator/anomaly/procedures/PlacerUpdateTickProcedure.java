package net.mcreator.anomaly.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.anomaly.network.AnomalyModVariables;
import net.mcreator.anomaly.init.AnomalyModBlocks;

import java.util.Random;

public class PlacerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("anomaly:level_0")));
			if (world != null) {
				AnomalyModVariables.MapVariables.get(world).rand = Mth.nextDouble(new Random(), 0, 2);
				AnomalyModVariables.MapVariables.get(world).syncData(world);
				if (AnomalyModVariables.MapVariables.get(world).rand <= 1.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("anomaly", "levelzeroroom3x3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (AnomalyModVariables.MapVariables.get(world).rand <= 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("anomaly", "levelzerowall3x3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if ((world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == AnomalyModBlocks.WALLPAPER.get()) {
					world.setBlock(new BlockPos(x + 3, y, z), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 3, y, z))).getBlock() == AnomalyModBlocks.WALLPAPER.get()) {
					world.setBlock(new BlockPos(x - 3, y, z), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == AnomalyModBlocks.WALLPAPER.get()) {
					world.setBlock(new BlockPos(x, y, z + 3), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == AnomalyModBlocks.WALLPAPER.get()) {
					world.setBlock(new BlockPos(x, y, z - 3), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
				}
			}
			world = _worldorig;
		}
	}
}
