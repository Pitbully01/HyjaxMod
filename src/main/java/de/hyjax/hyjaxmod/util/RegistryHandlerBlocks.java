package de.hyjax.hyjaxmod.util;

import com.sun.jdi.Location;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.bases.blocks.BloodDiamondBlock;
import de.hyjax.hyjaxmod.bases.blocks.BloodDiamondOre;
import de.hyjax.hyjaxmod.bases.blocks.ButtonBlock;
import de.hyjax.hyjaxmod.bases.blocks.PressurePlateBlockWOOD;
import de.hyjax.hyjaxmod.bases.blocks.RubyBlock;
import de.hyjax.hyjaxmod.bases.blocks.RubyOre;
import de.hyjax.hyjaxmod.bases.blocks.StairsBlock;
import de.hyjax.hyjaxmod.bases.blocks.SaphireOre;
import de.hyjax.hyjaxmod.bases.blocks.TopazBlock;
import de.hyjax.hyjaxmod.bases.blocks.TopazOre;
import de.hyjax.hyjaxmod.bases.items.MultiBlockItem;
import de.hyjax.hyjaxmod.bases.items.OreItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerBlocks {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyjaxMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HyjaxMod.MOD_ID);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//Ruby Ore
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new OreItem(RUBY_ORE.get())); 
	//Saphire Ore
    public static final RegistryObject<Block> SAPHIRE_ORE = BLOCKS.register("saphire_ore", SaphireOre::new);
    public static final RegistryObject<Item> SAPHIRE_ORE_ITEM = ITEMS.register("saphire_ore", () -> new OreItem(SAPHIRE_ORE.get())); 
	//Ruby Block
    public static final RegistryObject<RubyBlock> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new MultiBlockItem(RUBY_BLOCK.get()));
	//saphire Block
    public static final RegistryObject<Block> SAPHIRE_BLOCK = BLOCKS.register("saphire_block", RubyBlock::new);
    public static final RegistryObject<Item> SAPHIRE_BLOCK_ITEM = ITEMS.register("saphire_block", () -> new MultiBlockItem(SAPHIRE_BLOCK.get()));
	//Blood Diamond Block
    public static final RegistryObject<Block> BLOODDIAMOND_BLOCK = BLOCKS.register("blooddiamond_block", BloodDiamondBlock::new);
    public static final RegistryObject<Item> BLOODDIAMOND_BLOCK_ITEM = ITEMS.register("blooddiamond_block", () -> new MultiBlockItem(BLOODDIAMOND_BLOCK.get()));
	// BloodDiamond Ore
    public static final RegistryObject<Block> BLOODDIAMOND_ORE = BLOCKS.register("blooddiamond_ore", BloodDiamondOre::new);
    public static final RegistryObject<Item> BLOODIAMOND_ORE_ITEMS = ITEMS.register("blooddiamond_ore", () -> new OreItem(BLOODDIAMOND_ORE.get()));
    //Topaz Block
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", TopazBlock::new);
    public static final RegistryObject<Item> TOPAZ_BLOCK_ITEM = ITEMS.register("topaz_block", () -> new MultiBlockItem(TOPAZ_BLOCK.get()));
    // Topaz Ore
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", TopazOre::new);
    public static final RegistryObject<Item> TOPAZ_ORE_ITEM = ITEMS.register("topaz_ore", () -> new OreItem(TOPAZ_ORE.get()));
    
    // Stairs
   // public static final RegistryObject<Block> RUBY_STAIRS = BLOCKS.register("ruby_stairs", StairsBlock::new);
   // public static final RegistryObject<Item> RUBY_STAIRS_ITEM = ITEMS.register("ruby_stairs", () -> new OreItem(RUBY_STAIRS.get()));
    // Fence 
   // public static final RegistryObject<Block> RUBY_FENCE = BLOCKS.register("ruby_fence", () -> new  FenceBlock());
   // public static final RegistryObject<Item> RUBY_FENCE_ITEM = ITEMS.register("ruby_fence", () -> new OreItem(RUBY_FENCE.get()));
    //Buttons
    public static final RegistryObject<Block> RUBY_BUTTON = BLOCKS.register("ruby_button", () -> new ButtonBlock(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_BUTTON_ITEM = ITEMS.register("ruby_button", () -> new OreItem(RUBY_BUTTON.get()));
    //PressurePlates
    public static final RegistryObject<Block> RUBY_WOOD_PRESSURE_PLATE = BLOCKS.register("ruby_woodlike_pressure_plate", () -> 
    		new PressurePlateBlockWOOD(Sensitivity.EVERYTHING, Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f,6.0f).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Item> RUBY_WOOD_PRESSURE_PLATE_ITEM = ITEMS.register("ruby_woodlike_pressure_plate", () -> new OreItem(RUBY_WOOD_PRESSURE_PLATE.get()));
    
}


