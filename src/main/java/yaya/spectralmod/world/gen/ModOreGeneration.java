package yaya.spectralmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import yaya.spectralmod.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        // 注册主世界矿石生成
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ADAMANT_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.EDELMAN_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TITANIUM_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FLAME_GOLD_ORE_PLACED_KEY);
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEP_SEE_SILVER_ORE_PLACED_KEY);
        
        // 注册下界矿石生成 - 暂时注释掉
        /*
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_FLAME_GOLD_ORE_PLACED_KEY);
        */

        // 注册末地矿石生成 - 暂时注释掉
        /*
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_MITHRIL_ORE_PLACED_KEY);
        */
    }
} 