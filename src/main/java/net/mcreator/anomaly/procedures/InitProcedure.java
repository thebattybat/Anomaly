package net.mcreator.anomaly.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.anomaly.init.AnomalyModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InitProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("anomaly:level_0")));
			if (world != null) {
				world.setBlock(new BlockPos(0, 30, 0), AnomalyModBlocks.PLACER.get().defaultBlockState(), 3);
			}
			world = _worldorig;
		}
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("anomaly:level_1")));
			if (world != null) {
				world.setBlock(new BlockPos(0, 127, 0), AnomalyModBlocks.LEVEL_1_PLACER.get().defaultBlockState(), 3);
			}
			world = _worldorig;
		}
	}
}
