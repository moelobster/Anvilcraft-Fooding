package dev.anvilcraft.fooding.init.items;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.fooddata.JamsData;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModJams {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();
    public final static Item GLOWBERRIESJAM = registerItem("glow_berries_jam",Item::new,defaultProperties().food(JamsData.GLOWBERRIESJAM));
    public final static Item SWEETBERRIESJAM = registerItem("sweet_berries_jam",Item::new,defaultProperties().food(JamsData.SWEETBERRIESJAM));
    public final static Item APPLEJAM = registerItem("apple_jam",Item::new,defaultProperties().food(JamsData.APPLEJAM));

    public final static Item PEARJAM = registerItem("pear_jam",Item::new,defaultProperties().food(JamsData.PEARJAM));
    public final static Item LEMONJAM = registerItem("lemon_jam",Item::new,defaultProperties().food(JamsData.LEMOONJAM));
    public final static Item GRAPEJAM = registerItem("grape_jam",Item::new,defaultProperties().food(JamsData.GRAPEJAM));
    public final static Item CHERRYJAM = registerItem("cherry_jam",Item::new,defaultProperties().food(JamsData.CHERRYJAM));
    public final static Item PEACHJAM = registerItem("peach_jam",Item::new,defaultProperties().food(JamsData.PEACHJAM));
    public final static Item CARAMBOLAJAM = registerItem("carambola_jam",Item::new,defaultProperties().food(JamsData.CARAMBOLAJAM));
    public final static Item STRAWBERRYJAM = registerItem("strawberry_jam",Item::new,defaultProperties().food(JamsData.STRAWBERRYJAM));
    public final static Item BLUEBERRYJAM = registerItem("blueberry_jam",Item::new,defaultProperties().food(JamsData.BLUEBERRYJAM));
    public final static Item CHILIJAM = registerItem("chili_jam",Item::new,defaultProperties().food(JamsData.CHILIJAM));
    public final static Item TOMATOJAM = registerItem("tomato_jam",Item::new,defaultProperties().food(JamsData.TOMATOJAM));



    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModJams.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
