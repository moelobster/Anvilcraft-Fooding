package dev.anvilcraft.fooding.init.food;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModCerealsItems {
    //四体不勤，五谷不分
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();


    public static final Item RICE = registerItem("rice",Item::new,defaultProperties());
    public static final Item TARO = registerItem("taro",Item::new,defaultProperties());
    public static final Item CORN = registerItem("corn",Item::new,defaultProperties());
    public static final Item SWEETPOTATO = registerItem("sweet_potato",Item::new,defaultProperties());
    public static final Item MILLET = registerItem("millet",Item::new,defaultProperties());
    public static final Item SORGHUM =registerItem("sorghum",Item::new,defaultProperties());







    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModCerealsItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
