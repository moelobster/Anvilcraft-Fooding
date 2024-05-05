package dev.anvilcraft.fooding.init.item;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.block.ModCropsBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModSeedItems {

    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item HOUTTUYNIACORDATASEED = registerItem("houttuynia_cordata_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.HOUTTUYNIACORDATACROP, defaultProperties()),defaultProperties());
    public static final Item CORIANDERSEED = registerItem("coriander_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.CORIANDERCROP, defaultProperties()),defaultProperties());
    public static final Item CELERYSEED = registerItem("celery_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.CELERYCROP, defaultProperties()),defaultProperties());
    public static final Item SPINACHSEED = registerItem("spinach_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.SPINACHCROP, defaultProperties()),defaultProperties());
    public static final Item CABBAGESEED = registerItem("cabbage_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.CABBAGECROP, defaultProperties()),defaultProperties());
    public static final Item CHINESECABBAGESEED = registerItem("chinese_cabbage_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.CHINESECABBAGECROP, defaultProperties()),defaultProperties());
    public static final Item GENSINGSEED = registerItem("gensing_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.GENSINGCROP, defaultProperties()),defaultProperties());
    public static final Item AMERICANGENSINGSEED = registerItem("american_gensing_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.AMERICANGENSINGCROP, defaultProperties()),defaultProperties());
    public static final Item GOURDSEED = registerItem("gourd_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.GOURDCROP, defaultProperties()),defaultProperties());
    public static final Item SOYBEANSSEED = registerItem("soybeans_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.SOYBEANSCROP, defaultProperties()),defaultProperties());
    public static final Item FRENCHBEANSSEED = registerItem("french_beans_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.FRENCHBEANCROP, defaultProperties()),defaultProperties());
    public static final Item COWPEASEED = registerItem("cowpea_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.COWPEACROP, defaultProperties()),defaultProperties());
    public static final Item PEASEED = registerItem("pea_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.PEACROP, defaultProperties()),defaultProperties());
    public static final Item PEANUTSEED = registerItem("peanut_seed",(properties)->new ItemNameBlockItem(ModCropsBlocks.PEANUTCROP, defaultProperties()),defaultProperties());















    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModSeedItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
