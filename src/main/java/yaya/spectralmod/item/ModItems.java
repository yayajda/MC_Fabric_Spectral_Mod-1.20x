package yaya.spectralmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yaya.spectralmod.SpectralMod;

public class ModItems {

    //物品注册
public static final Item SILVER_INGOT = registerItem("silver_ingot" , new Item(new FabricItemSettings()));

private static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries){
    entries.add(SILVER_INGOT);
}

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(SpectralMod.MOD_ID,name), item);
    }

    public static void registerModItems(){
        SpectralMod.LOGGER.info("Register Mod Items for " + SpectralMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
