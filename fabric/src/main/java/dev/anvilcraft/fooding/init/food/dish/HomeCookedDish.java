package dev.anvilcraft.fooding.init.food.dish;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.food.ModJamsItems;
import dev.anvilcraft.fooding.init.food.fooddata.FruitsData;
import dev.anvilcraft.fooding.init.food.fooddata.dish.HomeCookedDishData;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class HomeCookedDish {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item DUMPLING = registerItem("dumpling", Item::new,defaultProperties().food(HomeCookedDishData.DUMPLING));
    public static final Item FRIEDDUMPLING = registerItem("fried_dumpling",Item::new,defaultProperties().food(HomeCookedDishData.FRIEDDUMPLING));
    public static final Item SOUPDUMPLING = registerItem("soup_dumpling",Item::new,defaultProperties().food(HomeCookedDishData.SOUPDUMPLING));
    public static final Item YANGCHUNNOODLES = registerItem("yangchun_noodles",Item::new,defaultProperties().food(HomeCookedDishData.YANGCHUNNOODLES));
    public static final Item BEEFNOODLES = registerItem("beef_noodles",Item::new,defaultProperties().food(HomeCookedDishData.BEEFNOODLES));
    public static final Item RAVIOLI = registerItem("ravioli",Item::new,defaultProperties().food(HomeCookedDishData.RAVIOLI));
    public static final Item RAWDOUGHPANFRIEDBUN = registerItem("raw_dough_pan_fried_bun",Item::new,defaultProperties().food(HomeCookedDishData.RAWDOUGHPANFRIEDBUN));



    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : HomeCookedDish.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
