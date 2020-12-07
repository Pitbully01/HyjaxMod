package de.hyjax.hyjaxmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import de.hyjax.hyjaxmod.init.InitInit;
import de.hyjax.hyjaxmod.util.*;
import de.hyjax.hyjaxmod.world.gen.GemOreGen;

@Mod("hjxmod")
public class HyjaxMod {
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "hjxmod";

	public HyjaxMod() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		RegistryHandler.init();
		InitInit.init();
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		GemOreGen.registerOre();
		// some preinit code like
		LOGGER.info("HELLO FROM PREINIT");
		// LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		// some code that only the client can be done like
		// LOGGER.info("Got game settings {}",
		// event.getMinecraftSupplier().get().gamesettings);
	}

	public static final ItemGroup TAB = new ItemGroup("hyjax_Items") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RegistryHandlerItems.RUBY.get());
		}
	};

}
