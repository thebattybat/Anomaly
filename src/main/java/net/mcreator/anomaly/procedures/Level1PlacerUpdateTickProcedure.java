package net.mcreator.anomaly.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
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

public class Level1PlacerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("anomaly:level_1")));
			if (world != null) {
				if (Mth.nextDouble(new Random(), 0, 150) <= 1) {
					if (Mth.nextDouble(new Random(), 0, 4) <= 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("anomaly", "level1smiler"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("anomaly", "level1room2dark"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (Mth.nextDouble(new Random(), 0, 60) <= 1) {
						world.setBlock(new BlockPos(x, y, z), AnomalyModBlocks.PARKING_PLACER.get().defaultBlockState(), 3);
					} else {
						AnomalyModVariables.MapVariables.get(world).randlevel1 = Mth.nextDouble(new Random(), 0, 2);
						AnomalyModVariables.MapVariables.get(world).syncData(world);
						if (AnomalyModVariables.MapVariables.get(world).randlevel1 <= 1) {
							if (Mth.nextDouble(new Random(), 0, 8) <= 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "level1room1crate"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "level1room1"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						} else {
							if (Mth.nextDouble(new Random(), 0, 8) <= 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "level1room2crate"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "level1room2"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						}
					}
					if ((world.getBlockState(new BlockPos(x + 10, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x + 10, y, z), AnomalyModBlocks.LEVEL_1_PLACER.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x - 10, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x - 10, y, z), AnomalyModBlocks.LEVEL_1_PLACER.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x, y, z + 10))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z + 10), AnomalyModBlocks.LEVEL_1_PLACER.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x, y, z - 10))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z - 10), AnomalyModBlocks.LEVEL_1_PLACER.get().defaultBlockState(), 3);
					}
				}
			}
			world = _worldorig;
		}
	}
}
