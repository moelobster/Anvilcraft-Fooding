package dev.anvilcraft.fooding.init.items;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModMushroom {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item GREENMUSHROOM = registerItem("green_mushroom",Item::new,defaultProperties());
    public static final Item BLUEMUSHROOM = registerItem("blue_mushroom",Item::new,defaultProperties());
    public static final Item TREMELLA = registerItem("tremella",Item::new,defaultProperties());
    public static final Item BLACKFUNGUS = registerItem("black_fungus",Item::new,defaultProperties());
    public static final Item MUSHROOM = registerItem("mushroom",Item::new,defaultProperties());
    public static final Item FLAMMULINAENOKI = registerItem("flammulina_enoki",Item::new,defaultProperties());









    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModMushroom.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
