package dev.anvilcraft.fooding.init.others;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;

import java.util.HashMap;
import java.util.Map;


public class ModPlayerStatistics {
    private static final Map<String,ResourceLocation>TAG_MAP = new HashMap<>();
    public static final ResourceLocation SWEETCOUNTER = makeCustomStat("sweet_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation SWEETJUDGE = makeCustomStat("sweet_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation ACIDCOUNTER = makeCustomStat("acid_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation ACIDJUDGE = makeCustomStat("acid_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation HOTCOUNTER = makeCustomStat("hot_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation HOTJUDGE = makeCustomStat("hot_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation NUTCOUNTER = makeCustomStat("nut_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation NUTJUDGE = makeCustomStat("nut_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation SATIETYCOUNTER = makeCustomStat("satiety_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation SATIETYJUDGE = makeCustomStat("satiety_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation FRUITCOUNTER = makeCustomStat("fruit_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation FRUITJUDGE = makeCustomStat("fruit_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation MEATCOUNTER = makeCustomStat("meat_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation MEATJUDGE = makeCustomStat("meat_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation SEAFOODCOUNTER = makeCustomStat("seafood_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation SEAFOODJUDGE = makeCustomStat("seafood_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation UNBELIEVABLECOUNTER = makeCustomStat("unbelievable_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation UNBELIEVABLEJUDGE = makeCustomStat("unbelievable_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation LUXURIOUSCOUNTER = makeCustomStat("luxurious_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation LUXURIOUSJUDGE = makeCustomStat("luxurious_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation POISONCOUNTER = makeCustomStat("poison_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation POISONJUDGE = makeCustomStat("poison_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation BITTERCOUNTER = makeCustomStat("bitter_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation BITTERJUDGE = makeCustomStat("bitter_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation MUSHROOMCOUNTER = makeCustomStat("mushroom_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation MUSHROOMJUDGE = makeCustomStat("mushroom_judge",StatFormatter.DEFAULT);


    public static final ResourceLocation OILCOUNTER = makeCustomStat("oil_counter",StatFormatter.DEFAULT);
    public static final ResourceLocation OILJUDGE = makeCustomStat("oil_judge",StatFormatter.DEFAULT);



    private static ResourceLocation makeCustomStat(String id, StatFormatter statFormatter) {
        ResourceLocation resourceLocation = AnvilCraftFoodingFabric.of(id);
        TAG_MAP.put(id,resourceLocation);
        return resourceLocation;
    }
    public static void register() {
        for (Map.Entry<String, ResourceLocation> entry : ModPlayerStatistics.TAG_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.CUSTOM_STAT, entry.getKey(), entry.getValue());
        }
    }
}
