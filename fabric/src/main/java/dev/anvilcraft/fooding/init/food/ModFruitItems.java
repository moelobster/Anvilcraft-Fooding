package dev.anvilcraft.fooding.init.food;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.food.fooddata.FruitsData;
import dev.anvilcraft.fooding.init.block.ModCropsBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModFruitItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public final static Item PEAR = registerItem("pear", Item::new,defaultProperties().food(FruitsData.PEAR));
    public final static Item LEMON = registerItem("lemon",Item::new,defaultProperties().food(FruitsData.LEMON));
    public final static Item GRAPE = registerItem("grape",Item::new,defaultProperties().food(FruitsData.GRAPE));
    public final static Item BANANA = registerItem("banana",Item::new,defaultProperties().food(FruitsData.BANANA));
    public final static Item WALNUT = registerItem("walnut",Item::new,defaultProperties().food(FruitsData.WALNUT));
    public final static Item CHERRY = registerItem("cherry",Item::new,defaultProperties().food(FruitsData.CHERRY));
    public final static Item PEACH = registerItem("peach",Item::new,defaultProperties().food(FruitsData.PEACH));
    public final static Item COCONUT = registerItem("coconut",Item::new,defaultProperties().food(FruitsData.COCONUT));
    public final static Item CARAMBOLA = registerItem("carambola",Item::new,defaultProperties().food(FruitsData.CARAMBOLA));
    public final static Item STRAWBERRY = registerItem("strawberry",(properties)->new ItemNameBlockItem(ModCropsBlocks.STRAWBERYCROP, new Item.Properties().food(FruitsData.STRAWBERRY)),defaultProperties().food(FruitsData.STRAWBERRY));
    public final static Item BLUEBERRY = registerItem("blueberry",(properties)->new ItemNameBlockItem(ModCropsBlocks.BLUEBERYCROP, new Item.Properties().food(FruitsData.BLUEBERRY)),defaultProperties().food(FruitsData.BLUEBERRY));
    public final static Item TOON = registerItem("toon",Item::new,defaultProperties().food(FruitsData.TOON));







    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModFruitItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
