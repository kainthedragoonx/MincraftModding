
package net.mcreator.familymodtime.block;

import net.minecraft.block.material.Material;

@FamilymodtimeModElements.ModElement.Tag
public class DaddysBlockBlock extends FamilymodtimeModElements.ModElement {

	@ObjectHolder("familymodtime:daddys_block")
	public static final Block block = null;

	public DaddysBlockBlock(FamilymodtimeModElements instance) {
		super(instance, 1);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(1.25f, 10f).lightValue(1));

			setRegistryName("daddys_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
