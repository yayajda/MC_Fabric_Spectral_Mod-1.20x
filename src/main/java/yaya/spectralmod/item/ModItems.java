package yaya.spectralmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import yaya.spectralmod.SpectralMod;

public class ModItems {

    //物品注册
    public static final Item SILVER_INGOT = registerItem("silver_ingot" , new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot" , new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RAW_STEEL = registerItem("raw_steel" , new Item(new FabricItemSettings()));
    public static final Item ADAMANT_INGOT = registerItem("adamant_ingot" , new Item(new FabricItemSettings()));
    public static final Item EDELMAN_INGOT = registerItem("edelman_ingot" , new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot" , new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item FLAME_GOLD_INGOT = registerItem("flame_gold_ingot" , new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot" , new Item(new FabricItemSettings()));
    public static final Item DEEP_SEA_SILVER_INGOT = registerItem("deep_sea_silver_ingot" , new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(SpectralMod.MOD_ID,name), item);
    }

    public static void registerModItems(){
        SpectralMod.LOGGER.info("Register Mod Items for " + SpectralMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS);
    }
}
