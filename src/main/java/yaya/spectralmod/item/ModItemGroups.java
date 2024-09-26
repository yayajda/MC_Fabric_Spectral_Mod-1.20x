package yaya.spectralmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import yaya.spectralmod.SpectralMod;
import yaya.spectralmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup Spectral_Material_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(SpectralMod.MOD_ID,
            "spectral_material_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spectral_material_group"))
                .icon(() -> new ItemStack(ModItems.SILVER_INGOT)).entries((displayContext, entries) -> {

                    entries.add(ModItems.SILVER_INGOT); //add items here to the group



                }).build());


    public static final ItemGroup Spectral_Block_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(SpectralMod.MOD_ID,
                    "spectral_block_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spectral_block_group"))
                    .icon(() -> new ItemStack(ModBlocks.SILVER_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.SILVER_BLOCK); //add items here to the group



                    }).build());

    public static void registerItemGroups(){
        SpectralMod.LOGGER.info("Register Item Groups for " + SpectralMod.MOD_ID);
    }
}
