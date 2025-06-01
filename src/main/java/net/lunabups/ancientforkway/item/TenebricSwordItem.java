
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.lunabups.ancientforkway.init.AncientForkwayModItems;

public class TenebricSwordItem extends SwordItem {
	public TenebricSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1444;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AncientForkwayModItems.TENEBRIC_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().fireResistant());
	}
}
