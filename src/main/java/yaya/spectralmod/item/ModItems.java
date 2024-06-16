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
    public  static final Item Silver_bar = registerItem("silver_bar", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(Silver_bar);
    }
    private static Item registerItem(String name ,Item item){
        return Registry.register(Registries.ITEM, new Identifier(SpectralMod.MOD_ID,name),item);
    }


    public static void registerModItems(){
        SpectralMod.LOGGER.info("Registering Mod Items for "+ SpectralMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
