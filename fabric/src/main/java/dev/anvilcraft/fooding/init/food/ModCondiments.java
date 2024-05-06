package dev.anvilcraft.fooding.init.food;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModCondiments {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item VEGETABLEOIL = registerItem("vegetable_oil",Item::new,defaultProperties());
    public static final Item LARD = registerItem("lard",Item::new,defaultProperties());
    public static final Item BUTTER = registerItem("butter",Item::new,defaultProperties());
    public static final Item SOYSAUCE = registerItem("soy_sauce",Item::new,defaultProperties());





    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModCondiments.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
