package de.hyjax.hyjaxmod.init;

import de.hyjax.hyjaxmod.HyjaxMod;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
	
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, HyjaxMod.MOD_ID);
	
	public static void init() {
		CONTAINER_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
	} 
	
	public static final RegistryObject<ContainerType<DirtChestContainer>> DIRT_CHEST = CONTAINER_TYPES.register("dirt_chest", () -> IForgeContainerType.create(DirtChestContainer::new));
}
