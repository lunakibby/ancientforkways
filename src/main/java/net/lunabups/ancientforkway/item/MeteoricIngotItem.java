
package net.lunabups.ancientforkway.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MeteoricIngotItem extends Item {
	public MeteoricIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
