package de.hyjax.hyjaxmod.util;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.bases.items.BloodDiamondItem;
import de.hyjax.hyjaxmod.bases.items.RubyItem;
import de.hyjax.hyjaxmod.bases.items.SaphireItem;
import de.hyjax.hyjaxmod.bases.items.TopazItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyjaxMod.MOD_ID);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//Gems
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", RubyItem::new);
	public static final RegistryObject<Item> SAPHIRE = ITEMS.register("saphire", SaphireItem::new);
	public static final RegistryObject<Item> BLOODDIAMOND = ITEMS.register("blooddiamond", BloodDiamondItem::new);
	public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", TopazItem::new);
}
