package dev.anvilcraft.fooding.init.food;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.food.fooddata.VegetablesData;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModVegetableItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();


    public final static Item TOONLEAF = registerItem("toon_leaf",Item::new,defaultProperties().food(VegetablesData.TOONLEAF));
    public final static Item HOUTTUYNIACORDATA = registerItem("houttuynia_cordata",Item::new,defaultProperties().food(VegetablesData.HOUTTUYNIACORDATA));
    public final static Item CORIANDER = registerItem("coriander",Item::new,defaultProperties().food(VegetablesData.CORIANDER));
    public final static Item CELERY = registerItem("celery",Item::new,defaultProperties().food(VegetablesData.CELERY));
    public final static Item SPINACH = registerItem("spinach",Item::new,defaultProperties().food(VegetablesData.SPINACH));
    public final static Item CABBAGE = registerItem("cabbage",Item::new,defaultProperties().food(VegetablesData.CABBAGE));
    public final static Item CHINESECABBAGE = registerItem("chinese_cabbage",Item::new,defaultProperties().food(VegetablesData.CHINESECABBAGE));
    public final static Item EGGPLANT = registerItem("eggplant",Item::new,defaultProperties().food(VegetablesData.EGGPLANT));
    public final static Item CHILI = registerItem("chili",Item::new,defaultProperties().food(VegetablesData.CHILI));
    public final static Item TOMATO = registerItem("tomato",Item::new,defaultProperties().food(VegetablesData.TOMATO));
    public final static Item GENSING = registerItem("gensing",Item::new,defaultProperties().food(VegetablesData.GENSING));
    public final static Item AMERICANGENSING = registerItem("american_gensing",Item::new,defaultProperties().food(VegetablesData.AMERICANGENSING));
    public final static Item GOURD = registerItem("gourd",Item::new,defaultProperties().food(VegetablesData.GOURD));
    public final static Item SOYBEANS = registerItem("soybeans",Item::new,defaultProperties().food(VegetablesData.SOYBEANS));
    public final static Item FRENCHBEAN = registerItem("french_beans",Item::new,defaultProperties().food(VegetablesData.FRENCHBEAN));
    public final static Item COWPEA = registerItem("cowpea",Item::new,defaultProperties().food(VegetablesData.COWPEA));
    public final static Item PEA = registerItem("pea",Item::new,defaultProperties().food(VegetablesData.PEA));
    public final static Item PEANUT = registerItem("peanut",Item::new,defaultProperties().food(VegetablesData.PEANUT));







    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
