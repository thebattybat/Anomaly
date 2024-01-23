
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomaly.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.anomaly.entity.SmilerEntity;
import net.mcreator.anomaly.entity.BackroomsEntityEntity;
import net.mcreator.anomaly.AnomalyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnomalyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AnomalyMod.MODID);
	public static final RegistryObject<EntityType<BackroomsEntityEntity>> MOLD_CREATURE = register("mold_creature", EntityType.Builder.<BackroomsEntityEntity>of(BackroomsEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BackroomsEntityEntity::new).fireImmune().sized(0.6f, 3f));
	public static final RegistryObject<EntityType<SmilerEntity>> SMILER = register("smiler",
			EntityType.Builder.<SmilerEntity>of(SmilerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmilerEntity::new).fireImmune().sized(0.6f, 3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BackroomsEntityEntity.init();
			SmilerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOLD_CREATURE.get(), BackroomsEntityEntity.createAttributes().build());
		event.put(SMILER.get(), SmilerEntity.createAttributes().build());
	}
}
