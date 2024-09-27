package yaya.spectralmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BannerItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yaya.spectralmod.SpectralMod;

public class ModBlocks {

    public static final Block SILVER_BLOCK = registerBlock("silver_block" ,
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block" ,
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SILVER_ORE = registerBlock("silver_ore" ,
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));

    public static final Block ADAMANT_ORE = registerBlock("adamant_ore" ,//精金矿
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().strength(25f,100f)));
    public static final Block EDELMAN_ORE = registerBlock("edelman_ore" ,//爱德曼
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().strength(30f,100f)));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore" ,//秘银矿
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().strength(15f,200f)));

    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block" ,//秘银矿
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().strength(15f,200f)));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore" ,//钛金矿
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().strength(25f,100f)));
    public static final Block FLAME_GOLD_ORE = registerBlock("flame_gold_ore" ,//炎金矿
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().strength(25f,100f)));
    public static final Block DEEP_SEE_SILVER_ORE = registerBlock("deep_see_silver_ore" ,//深海沉银矿
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().strength(5f,100f)));




    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(SpectralMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(SpectralMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        SpectralMod.LOGGER.info("Register modblocks for " + SpectralMod.MOD_ID);
    }
}
