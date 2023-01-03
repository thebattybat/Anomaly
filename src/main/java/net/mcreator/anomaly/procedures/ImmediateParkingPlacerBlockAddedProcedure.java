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

import java.util.Random;

public class ImmediateParkingPlacerBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("anomaly:level_1")));
			if (world != null) {
				AnomalyModVariables.MapVariables.get(world).parkingrand = Mth.nextDouble(new Random(), 0, 3);
				AnomalyModVariables.MapVariables.get(world).syncData(world);
				if (Mth.nextDouble(new Random(), 0, 3) <= 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("anomaly", "level1parkingf"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Mth.nextDouble(new Random(), 0, 3) >= 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("anomaly", "level1parkinge"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("anomaly", "level1parkinga"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
			world = _worldorig;
		}
	}
}
