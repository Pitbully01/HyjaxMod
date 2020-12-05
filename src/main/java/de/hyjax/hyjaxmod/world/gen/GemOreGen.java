package de.hyjax.hyjaxmod.world.gen;

import java.util.ArrayList;

import de.hyjax.hyjaxmod.HyjaxMod;
import de.hyjax.hyjaxmod.util.RegistryHandlerBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class GemOreGen {

	private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
	private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
	private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();
	
	public static void registerOre() {
		/*
		 *BASE_STONE_OVERWORLD == Stone, Granite, Diorite, und Andesite
		 *NETHERRACK == Netherrack
		 *BASE_STONE_NETHERRACK == Netherrack, basalt und Blackstone
		 *new BlockMatchRuleTest(Blocks.END_STONE) == check if block is block
		*/
		
		
		//Overworld Ore Register
		overworldOres.add(register("ruby_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandlerBlocks.RUBY_ORE.get()
				.getDefaultState(), 6)) // 6 = Ader Größe
				.range(64).square()    // 64 = "Spawn height start"
				.func_242731_b(128))); // 128 = Spawn  // 128 ist sehr hoch normal sowas wie 16 (wie eisen) 128 nur weil leichter zu finden

		overworldOres.add(register("saphire_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandlerBlocks.SAPHIRE_ORE.get()
				.getDefaultState(), 6)) // 6 = Ader Größe
				.range(64).square()    // 64 = "Spawn height start"
				.func_242731_b(128))); // 128 = Spawn  // 128 ist sehr hoch normal sowas wie 16 (wie eisen) 128 nur weil leichter zu finden
		
		overworldOres.add(register("topaz_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandlerBlocks.TOPAZ_ORE.get()
				.getDefaultState(), 6)) // 6 = Ader Größe
				.range(64).square()    // 64 = "Spawn height start"
				.func_242731_b(128))); // 128 = Spawn  // 128 ist sehr hoch normal sowas wie 16 (wie eisen) 128 nur weil leichter zu finden

        //Nether Ore Register
		
		netherOres.add(register("blooddiamond_ore",Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandlerBlocks.BLOODDIAMOND_ORE.get()
				.getDefaultState(), 6))
				.range(120).square()
				.func_242731_b(128)));
		 

        //The End Ore Register
        //endOres.add(register("ruby_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), RegistryHandler.RUBY_ORE.get()
		//		  .getDefaultState(), 4))
        //        .range(128).square() 
        //        .func_242731_b(64))); 
		
	}
	
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.NETHER)){
            for(ConfiguredFeature<?, ?> ore : netherOres){
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        if(event.getCategory().equals(Biome.Category.THEEND)){
            for(ConfiguredFeature<?, ?> ore : endOres){
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        for(ConfiguredFeature<?, ?> ore : overworldOres){
            if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }

	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature){
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, HyjaxMod.MOD_ID + ":" + name, configuredFeature);
	}
}

