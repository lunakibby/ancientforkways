
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.lunabups.ancientforkway.init.AncientForkwayModItems;

public class MeteoricHoeItem extends HoeItem {
	public MeteoricHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3192;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 0, 1f, new Item.Properties().fireResistant());
	}
}
