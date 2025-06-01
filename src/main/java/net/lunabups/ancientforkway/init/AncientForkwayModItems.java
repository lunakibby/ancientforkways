
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lunabups.ancientforkway.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.lunabups.ancientforkway.item.TenebricUpgradeSmithingTemplateItem;
import net.lunabups.ancientforkway.item.TenebricSwordItem;
import net.lunabups.ancientforkway.item.TenebricShovelItem;
import net.lunabups.ancientforkway.item.TenebricScrapItem;
import net.lunabups.ancientforkway.item.TenebricPickaxeItem;
import net.lunabups.ancientforkway.item.TenebricIngotItem;
import net.lunabups.ancientforkway.item.TenebricHoeItem;
import net.lunabups.ancientforkway.item.TenebricAxeItem;
import net.lunabups.ancientforkway.item.TMIngotItem;
import net.lunabups.ancientforkway.item.TMHoeItem;
import net.lunabups.ancientforkway.item.MeteoricUpgradeSmithingTemplateItem;
import net.lunabups.ancientforkway.item.MeteoricSwordItem;
import net.lunabups.ancientforkway.item.MeteoricShovelItem;
import net.lunabups.ancientforkway.item.MeteoricScrapItem;
import net.lunabups.ancientforkway.item.MeteoricPickaxeItem;
import net.lunabups.ancientforkway.item.MeteoricIngotItem;
import net.lunabups.ancientforkway.item.MeteoricHoeItem;
import net.lunabups.ancientforkway.item.MeteoricAxeItem;
import net.lunabups.ancientforkway.item.ArmourTenebricItem;
import net.lunabups.ancientforkway.item.ArmourMeteoricItem;
import net.lunabups.ancientforkway.AncientForkwayMod;

public class AncientForkwayModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AncientForkwayMod.MODID);
	public static final RegistryObject<Item> METEORIC_BLOCK = block(AncientForkwayModBlocks.METEORIC_BLOCK);
	public static final RegistryObject<Item> METEORIC_DEBRIS = block(AncientForkwayModBlocks.METEORIC_DEBRIS);
	public static final RegistryObject<Item> TENEBRIC_BLOCK = block(AncientForkwayModBlocks.TENEBRIC_BLOCK);
	public static final RegistryObject<Item> TENEBRIC_DEBRIS = block(AncientForkwayModBlocks.TENEBRIC_DEBRIS);
	public static final RegistryObject<Item> METEORIC_SCRAP = REGISTRY.register("meteoric_scrap", () -> new MeteoricScrapItem());
	public static final RegistryObject<Item> METEORIC_INGOT = REGISTRY.register("meteoric_ingot", () -> new MeteoricIngotItem());
	public static final RegistryObject<Item> TENEBRIC_SCRAP = REGISTRY.register("tenebric_scrap", () -> new TenebricScrapItem());
	public static final RegistryObject<Item> TENEBRIC_INGOT = REGISTRY.register("tenebric_ingot", () -> new TenebricIngotItem());
	public static final RegistryObject<Item> METEORIC_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("meteoric_upgrade_smithing_template", () -> new MeteoricUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> TENEBRIC_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("tenebric_upgrade_smithing_template", () -> new TenebricUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> ARMOUR_METEORIC_HELMET = REGISTRY.register("armour_meteoric_helmet", () -> new ArmourMeteoricItem.Helmet());
	public static final RegistryObject<Item> ARMOUR_METEORIC_CHESTPLATE = REGISTRY.register("armour_meteoric_chestplate", () -> new ArmourMeteoricItem.Chestplate());
	public static final RegistryObject<Item> ARMOUR_METEORIC_LEGGINGS = REGISTRY.register("armour_meteoric_leggings", () -> new ArmourMeteoricItem.Leggings());
	public static final RegistryObject<Item> ARMOUR_METEORIC_BOOTS = REGISTRY.register("armour_meteoric_boots", () -> new ArmourMeteoricItem.Boots());
	public static final RegistryObject<Item> ARMOUR_TENEBRIC_HELMET = REGISTRY.register("armour_tenebric_helmet", () -> new ArmourTenebricItem.Helmet());
	public static final RegistryObject<Item> ARMOUR_TENEBRIC_CHESTPLATE = REGISTRY.register("armour_tenebric_chestplate", () -> new ArmourTenebricItem.Chestplate());
	public static final RegistryObject<Item> ARMOUR_TENEBRIC_LEGGINGS = REGISTRY.register("armour_tenebric_leggings", () -> new ArmourTenebricItem.Leggings());
	public static final RegistryObject<Item> ARMOUR_TENEBRIC_BOOTS = REGISTRY.register("armour_tenebric_boots", () -> new ArmourTenebricItem.Boots());
	public static final RegistryObject<Item> METEORIC_SWORD = REGISTRY.register("meteoric_sword", () -> new MeteoricSwordItem());
	public static final RegistryObject<Item> TENEBRIC_SWORD = REGISTRY.register("tenebric_sword", () -> new TenebricSwordItem());
	public static final RegistryObject<Item> METEORIC_AXE = REGISTRY.register("meteoric_axe", () -> new MeteoricAxeItem());
	public static final RegistryObject<Item> TENEBRIC_AXE = REGISTRY.register("tenebric_axe", () -> new TenebricAxeItem());
	public static final RegistryObject<Item> METEORIC_PICKAXE = REGISTRY.register("meteoric_pickaxe", () -> new MeteoricPickaxeItem());
	public static final RegistryObject<Item> TENEBRIC_PICKAXE = REGISTRY.register("tenebric_pickaxe", () -> new TenebricPickaxeItem());
	public static final RegistryObject<Item> METEORIC_SHOVEL = REGISTRY.register("meteoric_shovel", () -> new MeteoricShovelItem());
	public static final RegistryObject<Item> TENEBRIC_SHOVEL = REGISTRY.register("tenebric_shovel", () -> new TenebricShovelItem());
	public static final RegistryObject<Item> METEORIC_HOE = REGISTRY.register("meteoric_hoe", () -> new MeteoricHoeItem());
	public static final RegistryObject<Item> TENEBRIC_HOE = REGISTRY.register("tenebric_hoe", () -> new TenebricHoeItem());
	public static final RegistryObject<Item> TM_INGOT = REGISTRY.register("tm_ingot", () -> new TMIngotItem());
	public static final RegistryObject<Item> TM_HOE = REGISTRY.register("tm_hoe", () -> new TMHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
