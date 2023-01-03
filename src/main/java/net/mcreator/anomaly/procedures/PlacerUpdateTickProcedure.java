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

public class PlacerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("anomaly:level_0")));
			if (world != null) {
				AnomalyModVariables.MapVariables.get(world).rand = Mth.nextDouble(new Random(), 0, 6);
				AnomalyModVariables.MapVariables.get(world).syncData(world);
				if (Mth.nextDouble(new Random(), 0, 250) <= 1) {
					if (Mth.nextDouble(new Random(), 0, 2) <= 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("anomaly", "level0exit"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (Mth.nextDouble(new Random(), 0, 300) <= 1) {
						if (Mth.nextDouble(new Random(), 0, 2) <= 0.5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("anomaly", "level0exit"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else {
						if (Mth.nextDouble(new Random(), 0, 250) <= 1) {
							if (Mth.nextDouble(new Random(), 0, 2) <= 0.5) {
								if (Mth.nextDouble(new Random(), 0, 3) <= 1) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager()
												.getOrCreate(new ResourceLocation("anomaly", "moldentity"));
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
												.getOrCreate(new ResourceLocation("anomaly", "mold"));
										if (template != null) {
											template.placeInWorld(
													_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
															.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
								}
							}
						} else {
							if (AnomalyModVariables.MapVariables.get(world).rand <= 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "hall1"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else if (AnomalyModVariables.MapVariables.get(world).rand <= 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "hall2"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else if (AnomalyModVariables.MapVariables.get(world).rand <= 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "hall3"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else if (AnomalyModVariables.MapVariables.get(world).rand <= 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "hall4"));
									if (template != null) {
										template.placeInWorld(
												_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else if (AnomalyModVariables.MapVariables.get(world).rand <= 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("anomaly", "hall5"));
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
											.getOrCreate(new ResourceLocation("anomaly", "hall6"));
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
						world.setBlock(new BlockPos(x + 10, y, z), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x - 10, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x - 10, y, z), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x, y, z + 10))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z + 10), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
					}
					if ((world.getBlockState(new BlockPos(x, y, z - 10))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z - 10), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
					}
				}
			}
			world = _worldorig;
		}
	}
}
