
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lunabups.ancientforkway.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.lunabups.ancientforkway.block.TenebricDebrisBlock;
import net.lunabups.ancientforkway.block.TenebricBlockBlock;
import net.lunabups.ancientforkway.block.MeteoricDebrisBlock;
import net.lunabups.ancientforkway.block.MeteoricBlockBlock;
import net.lunabups.ancientforkway.AncientForkwayMod;

public class AncientForkwayModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientForkwayMod.MODID);
	public static final RegistryObject<Block> METEORIC_BLOCK = REGISTRY.register("meteoric_block", () -> new MeteoricBlockBlock());
	public static final RegistryObject<Block> METEORIC_DEBRIS = REGISTRY.register("meteoric_debris", () -> new MeteoricDebrisBlock());
	public static final RegistryObject<Block> TENEBRIC_BLOCK = REGISTRY.register("tenebric_block", () -> new TenebricBlockBlock());
	public static final RegistryObject<Block> TENEBRIC_DEBRIS = REGISTRY.register("tenebric_debris", () -> new TenebricDebrisBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
