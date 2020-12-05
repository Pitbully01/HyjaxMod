package de.hyjax.hyjaxmod.util;

import de.hyjax.hyjaxmod.HyjaxMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerContainer {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyjaxMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HyjaxMod.MOD_ID);
	private static final AbstractBlock BlockInit = null;
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<Block> DIRT_CHEST = BLOCKS.register("dirt_chest", () -> new DirtChestBlock(Block.Properties.from(RegistryHandlerBlocks.RUBY_BLOCK)));
}
