
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lunabups.ancientforkway.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.lunabups.ancientforkway.AncientForkwayMod;

public class AncientForkwayModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientForkwayMod.MODID);
	public static final RegistryObject<CreativeModeTab> ANCIENT_FORKWAY = REGISTRY.register("ancient_forkway",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ancient_forkway.ancient_forkway")).icon(() -> new ItemStack(AncientForkwayModItems.TM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AncientForkwayModBlocks.METEORIC_BLOCK.get().asItem());
				tabData.accept(AncientForkwayModBlocks.METEORIC_DEBRIS.get().asItem());
				tabData.accept(AncientForkwayModBlocks.TENEBRIC_BLOCK.get().asItem());
				tabData.accept(AncientForkwayModBlocks.TENEBRIC_DEBRIS.get().asItem());
				tabData.accept(AncientForkwayModItems.METEORIC_SCRAP.get());
				tabData.accept(AncientForkwayModItems.METEORIC_INGOT.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_SCRAP.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_INGOT.get());
				tabData.accept(AncientForkwayModItems.METEORIC_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_METEORIC_HELMET.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_METEORIC_CHESTPLATE.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_METEORIC_LEGGINGS.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_METEORIC_BOOTS.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_TENEBRIC_HELMET.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_TENEBRIC_CHESTPLATE.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_TENEBRIC_LEGGINGS.get());
				tabData.accept(AncientForkwayModItems.ARMOUR_TENEBRIC_BOOTS.get());
				tabData.accept(AncientForkwayModItems.METEORIC_SWORD.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_SWORD.get());
				tabData.accept(AncientForkwayModItems.METEORIC_AXE.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_AXE.get());
				tabData.accept(AncientForkwayModItems.METEORIC_PICKAXE.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_PICKAXE.get());
				tabData.accept(AncientForkwayModItems.METEORIC_SHOVEL.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_SHOVEL.get());
				tabData.accept(AncientForkwayModItems.METEORIC_HOE.get());
				tabData.accept(AncientForkwayModItems.TENEBRIC_HOE.get());
			}).build());
}
