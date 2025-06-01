
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.lunabups.ancientforkway.init.AncientForkwayModItems;

public class MeteoricShovelItem extends ShovelItem {
	public MeteoricShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 3192;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AncientForkwayModItems.METEORIC_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
