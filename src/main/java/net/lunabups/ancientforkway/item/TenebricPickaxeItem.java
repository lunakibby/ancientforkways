
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.lunabups.ancientforkway.init.AncientForkwayModItems;

public class TenebricPickaxeItem extends PickaxeItem {
	public TenebricPickaxeItem() {
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
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
