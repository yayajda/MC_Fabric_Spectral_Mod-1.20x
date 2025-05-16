package yaya.spectralmod.world;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import yaya.spectralmod.SpectralMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import yaya.spectralmod.block.ModBlocks;


import java.util.List;


public class ModConfiguredFeatures {
    // 主世界矿石
    public static final RegistryKey<ConfiguredFeature<?,?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> ADAMANT_ORE_KEY = registerKey("adamant_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> EDELMAN_ORE_KEY = registerKey("edelman_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> MITHRIL_ORE_KEY = registerKey("mithril_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> FLAME_GOLD_ORE_KEY = registerKey("flame_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DEEP_SEE_SILVER_ORE_KEY = registerKey("deep_see_silver_ore");
    
    // 下界矿石
    public static final RegistryKey<ConfiguredFeature<?,?>> NETHER_FLAME_GOLD_ORE_KEY = registerKey("nether_flame_gold_ore");
    
    // 末地矿石
    public static final RegistryKey<ConfiguredFeature<?,?>> END_MITHRIL_ORE_KEY = registerKey("end_mithril_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context) {
        // 规则定义
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherStoneReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        // 主世界矿石配置
        List<OreFeatureConfig.Target> silverOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SILVER_ORE.getDefaultState()));
                
        List<OreFeatureConfig.Target> adamantOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ADAMANT_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ADAMANT_ORE.getDefaultState()));
                
        List<OreFeatureConfig.Target> edelmanOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.EDELMAN_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.EDELMAN_ORE.getDefaultState()));
                
        List<OreFeatureConfig.Target> mithrilOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MITHRIL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.MITHRIL_ORE.getDefaultState()));
                
        List<OreFeatureConfig.Target> titaniumOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()));
                
        List<OreFeatureConfig.Target> flameGoldOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.FLAME_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.FLAME_GOLD_ORE.getDefaultState()));
                
        List<OreFeatureConfig.Target> deepSeeSilverOres =
        List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.DEEP_SEE_SILVER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEP_SEE_SILVER_ORE.getDefaultState()));

        // 下界矿石配置
        List<OreFeatureConfig.Target> netherFlameGoldOres =
        List.of(OreFeatureConfig.createTarget(netherStoneReplaceables, ModBlocks.FLAME_GOLD_ORE.getDefaultState()));

        // 末地矿石配置
        List<OreFeatureConfig.Target> endMithrilOres =
        List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.MITHRIL_ORE.getDefaultState()));

        // 注册矿石生成
        // 矿脉大小：由ModConfiguredFeatures类中的参数决定，它控制着每个矿脉所包含的矿石方块数量。
        // 主世界矿石
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(silverOres, 9)); // 较常见
        register(context, ADAMANT_ORE_KEY, Feature.ORE, new OreFeatureConfig(adamantOres, 6)); // 较稀有
        register(context, EDELMAN_ORE_KEY, Feature.ORE, new OreFeatureConfig(edelmanOres, 4)); // 稀有
        register(context, MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(mithrilOres, 5)); // 中等稀有度
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(titaniumOres, 7)); // 中等常见度
        register(context, FLAME_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(flameGoldOres, 6)); // 中等稀有度
        register(context, DEEP_SEE_SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepSeeSilverOres, 8)); // 较常见
        
        // 下界矿石
        register(context, NETHER_FLAME_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherFlameGoldOres, 5)); // 在下界中生成
        
        // 末地矿石
        register(context, END_MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMithrilOres, 4)); // 在末地中生成
    }

    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(SpectralMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context, RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}




