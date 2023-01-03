
package net.mcreator.anomaly.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Collections;

public class CarpetStairsBlock extends StairBlock {
	public CarpetStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.WOOL)
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("anomaly:carpetbreakplace")),
								() -> new SoundEvent(new ResourceLocation("anomaly:carpetfootsteps")),
								() -> new SoundEvent(new ResourceLocation("anomaly:carpetbreakplace")),
								() -> new SoundEvent(new ResourceLocation("anomaly:carpetfootsteps")),
								() -> new SoundEvent(new ResourceLocation("anomaly:carpetbreakplace"))))
						.strength(-1, 3600000).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState p_56947_) {
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
