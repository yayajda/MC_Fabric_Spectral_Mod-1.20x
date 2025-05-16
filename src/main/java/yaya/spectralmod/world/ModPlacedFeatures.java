package yaya.spectralmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import yaya.spectralmod.SpectralMod;

import java.util.List;


public class ModPlacedFeatures {
    // 主世界矿石
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> ADAMANT_ORE_PLACED_KEY = registerKey("adamant_ore_placed");
    public static final RegistryKey<PlacedFeature> EDELMAN_ORE_PLACED_KEY = registerKey("edelman_ore_placed");
    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_PLACED_KEY = registerKey("mithril_ore_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> FLAME_GOLD_ORE_PLACED_KEY = registerKey("flame_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEP_SEE_SILVER_ORE_PLACED_KEY = registerKey("deep_see_silver_ore_placed");
    
    // 下界矿石
     public static final RegistryKey<PlacedFeature> NETHER_FLAME_GOLD_ORE_PLACED_KEY = registerKey("nether_flame_gold_ore_placed");
    
    // 末地矿石
     public static final RegistryKey<PlacedFeature> END_MITHRIL_ORE_PLACED_KEY = registerKey("end_mithril_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

//        矿脉大小：由ModConfiguredFeatures类中的参数决定，它控制着每个矿脉所包含的矿石方块数量。
//        每区块矿脉数量：由ModPlacedFeatures类中的参数决定，它控制着每个区块中生成矿脉的数量。
        // 主世界矿石生成配置
        register(context, SILVER_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // 每区块矿脉数量
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(60))));
        
        register(context, ADAMANT_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ADAMANT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // 较稀有
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));
        
        register(context, EDELMAN_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.EDELMAN_ORE_KEY),
                ModOrePlacement.modifiersWithRarity(6, // 非常稀有
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-90), YOffset.fixed(-20))));
        
        register(context, MITHRIL_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3, // 较稀有
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-70), YOffset.fixed(0))));
        
        register(context, TITANIUM_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // 中等稀有度
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(20))));

        register(context, FLAME_GOLD_ORE_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FLAME_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // 较稀有
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(0))));
        register(context, DEEP_SEE_SILVER_ORE_PLACED_KEY, 
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEP_SEE_SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, // 中等常见
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(40))));
        
        // 下界矿石生成配置
        register(context, NETHER_FLAME_GOLD_ORE_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_FLAME_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // 较稀有
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(90))));

        // 末地矿石生成配置
        register(context, END_MITHRIL_ORE_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithRarity(8, // 非常稀有
                        HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(80))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(SpectralMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?,?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}