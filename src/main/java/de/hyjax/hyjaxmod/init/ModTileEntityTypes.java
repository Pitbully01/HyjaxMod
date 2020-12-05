package de.hyjax.hyjaxmod.init;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.util.RegistryHandler;
import de.hyjax.hyjaxmod.util.RegistryHandlerContainer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, HyjaxMod.MOD_ID);
	
	public static void init() {
		TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	public static final RegistryObject<TileEntityType<DirtChestTileEntity>> DIRT_CHEST = TILE_ENTITY_TYPES.register("dirt_chest", () -> TileEntityType.Builder.create(DirtChestTileEntity::new, RegistryHandlerContainer.DIRT_CHEST.get()).build(null));
}
