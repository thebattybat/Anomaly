
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnomalyModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> FLICKERSPEED = GameRules.register("flickerSpeed", GameRules.Category.UPDATES,
			GameRules.IntegerValue.create(5000));
}
