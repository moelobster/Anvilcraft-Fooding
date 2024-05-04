package dev.anvilcraft.fooding.init.item;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModWoodenItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

//    public static final Item APPLEBOAT = registerItem("apple_boat",new ModBoatType(false, ModBoat.Type.APPLE,(new Item.Properties()).stacksTo(1)));
//    public static final Item APPLESIGN = registerItem("apple_sign",new SignItem((new Item.Properties()).stacksTo(16),))



    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModWoodenItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
