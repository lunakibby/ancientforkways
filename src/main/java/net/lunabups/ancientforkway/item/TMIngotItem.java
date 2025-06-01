
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TMIngotItem extends Item {
	public TMIngotItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
