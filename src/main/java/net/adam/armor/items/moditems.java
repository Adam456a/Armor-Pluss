package net.adam.armor.items;

import net.adam.armor.armor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class moditems {

    //zink items
    public static final Item ZINK_SWORD = registerItem("zink_sword",
            new Item(new FabricItemSettings()));

    public static final Item ZINK = registerItem("zink",
            new Item(new FabricItemSettings().maxCount(64)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(armor.MOD_ID, name), item);

    }

    public static void registerModItems() {
        armor.LOGGER.debug("registering Mod Items " + armor.MOD_ID);
    }
}
