package de.hyjax.hyjaxmod.util;

public class RegistryHandler {
	public static void init() {
		RegistryHandlerArmor.init();
		RegistryHandlerBlocks.init();
		RegistryHandlerFood.init();
		RegistryHandlerItems.init();
		RegistryHandlerProcessing.init();
		RegistryHandlerTools.init();
		RegistryHandlerContainer.init();
	}
}
