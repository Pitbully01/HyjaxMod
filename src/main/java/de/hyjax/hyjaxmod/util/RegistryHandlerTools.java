package de.hyjax.hyjaxmod.util;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.bases.tools.tier.GemsTiers;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerTools {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyjaxMod.MOD_ID);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	//Pickaxe
	public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> (new PickaxeItem(GemsTiers.RUBY , 1, -2.4F , new Item.Properties().group(HyjaxMod.TAB))));
	public static final RegistryObject<PickaxeItem> SAPHIRE_PICKAXE = ITEMS.register("saphire_pickaxe", () -> new PickaxeItem(GemsTiers.SAPHIRE , 1, -2.4F , new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<PickaxeItem> BLOODDIAMOND_PICKACE = ITEMS.register("blooddiamond_pickaxe", () -> new PickaxeItem(GemsTiers.BLOODDIAMOND , 1, -2.4F , new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(GemsTiers.TOPAZ, 1, -2.4F , new Item.Properties().group(HyjaxMod.TAB)));
	
	//Sword
	public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(GemsTiers.RUBY, 2, 0.0F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<SwordItem> SAPHIRE_SWORD = ITEMS.register("saphire_sword", () ->	new SwordItem(GemsTiers.SAPHIRE, 2, 0.0F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<SwordItem> BLOODDIAMOND_SWORD = ITEMS.register("blooddiamond_sword", () -> new SwordItem(GemsTiers.BLOODDIAMOND, 2, 0.0F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(GemsTiers.TOPAZ, 2, 0.0F, new Item.Properties().group(HyjaxMod.TAB)));
	
	//Shovel
	public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(GemsTiers.RUBY, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ShovelItem> SAPHIRE_SHOVEL = ITEMS.register("saphire_shovel", () ->	new ShovelItem(GemsTiers.SAPHIRE, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ShovelItem> BLOODDIAMOND_SHOVEL = ITEMS.register("blooddiamond_shovel", () -> new ShovelItem(GemsTiers.BLOODDIAMOND, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(GemsTiers.TOPAZ, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	
	//Hoe
	public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->	new HoeItem(GemsTiers.RUBY, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<HoeItem> SAPHIRE_HOE = ITEMS.register("saphire_hoe", () -> new HoeItem(GemsTiers.SAPHIRE, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<HoeItem> BLOODDIAMOND_HOE = ITEMS.register("blooddiamond_hoe", () -> new HoeItem(GemsTiers.BLOODDIAMOND, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () ->	new HoeItem(GemsTiers.TOPAZ, 1, -2.4F, new Item.Properties().group(HyjaxMod.TAB)));
	 
	//Axe
	public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->	new AxeItem(GemsTiers.RUBY, 3, -3.0F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<AxeItem> SAPHIRE_AXE = ITEMS.register("saphire_axe", () -> new AxeItem(GemsTiers.SAPHIRE, 3, -3.0F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<AxeItem> BLOODDIAMOND_AXE = ITEMS.register("blooddiamond_axe", () -> new AxeItem(GemsTiers.BLOODDIAMOND, 3, -3.0F, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () ->	new AxeItem(GemsTiers.TOPAZ, 3, -3.0F, new Item.Properties().group(HyjaxMod.TAB)));
}
