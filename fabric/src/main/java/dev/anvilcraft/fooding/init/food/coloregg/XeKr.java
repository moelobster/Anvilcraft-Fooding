package dev.anvilcraft.fooding.init.food.coloregg;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.food.dish.HomeCookedDish;
import dev.anvilcraft.fooding.init.food.fooddata.dish.HomeCookedDishData;
import dev.dubhe.anvilcraft.item.ModFoods;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class XeKr {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item BEEF_MUSHROOM_STEW_XEKR = registerItem("beef_mushroom_stew_xekr", BowlFoodItem::new,defaultProperties().food(dev.anvilcraft.fooding.init.food.coloregg.fooddata.XeKr.BEEF_MUSHROOM_STEW_XEKR));


    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : XeKr.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
