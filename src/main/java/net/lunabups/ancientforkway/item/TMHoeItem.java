
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TMHoeItem extends Item {
	public TMHoeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
