package de.hyjax.hyjaxmod.util;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.bases.armor.ArmorTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerArmor {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyjaxMod.MOD_ID);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	//Helmet
	public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ArmorTiers.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> SAPHIRE_HELMET = ITEMS.register("saphire_helmet", () -> new ArmorItem(ArmorTiers.SAPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> BLOODDIAMOND_HELMET = ITEMS.register("blooddiamond_helmet", () -> new ArmorItem(ArmorTiers.BLOODDIAMOND, EquipmentSlotType.HEAD, new Item.Properties().group(HyjaxMod.TAB)));
	//Chestplate
	public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ArmorTiers.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> SAPHIRE_CHESTPLATE = ITEMS.register("saphire_chestplate", () -> new ArmorItem(ArmorTiers.SAPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> BLOODDIAMOND_CHESTPLATE = ITEMS.register("blooddiamond_chestplate", () -> new ArmorItem(ArmorTiers.BLOODDIAMOND, EquipmentSlotType.CHEST, new Item.Properties().group(HyjaxMod.TAB)));
	//Leggings
	public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ArmorTiers.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> SAPHIRE_LEGGINGS = ITEMS.register("saphire_leggings", () -> new ArmorItem(ArmorTiers.SAPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> BLOODDIAMOND_LEGGINGS = ITEMS.register("blooddiamond_leggings", () -> new ArmorItem(ArmorTiers.BLOODDIAMOND, EquipmentSlotType.LEGS, new Item.Properties().group(HyjaxMod.TAB)));
	//Boots
	public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ArmorTiers.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> SAPHIRE_BOOTS = ITEMS.register("saphire_boots", () -> new ArmorItem(ArmorTiers.SAPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(HyjaxMod.TAB)));
	public static final RegistryObject<ArmorItem> BLOODDIAMOND_BOOTS = ITEMS.register("blooddiamond_boots", () -> new ArmorItem(ArmorTiers.BLOODDIAMOND, EquipmentSlotType.FEET, new Item.Properties().group(HyjaxMod.TAB)));
}
