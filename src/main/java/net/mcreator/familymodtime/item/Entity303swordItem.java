
package net.mcreator.familymodtime.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.familymodtime.FamilymodtimeModElements;

@FamilymodtimeModElements.ModElement.Tag
public class Entity303swordItem extends FamilymodtimeModElements.ModElement {
	@ObjectHolder("familymodtime:entity_3_0_3sword")
	public static final Item block = null;
	public Entity303swordItem(FamilymodtimeModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 101;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 0f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("entity_3_0_3sword"));
	}
}
