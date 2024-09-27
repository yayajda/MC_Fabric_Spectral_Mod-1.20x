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
