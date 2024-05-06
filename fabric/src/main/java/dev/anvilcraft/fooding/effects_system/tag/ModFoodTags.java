package dev.anvilcraft.fooding.effects_system.tag;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public final class ModFoodTags {
    public static final TagKey<Item> SWEET = ModFoodTags.bind("sweet_tag");
    public static final TagKey<Item> ACID = ModFoodTags.bind("acid_tag");
    public static final TagKey<Item> NUT = ModFoodTags.bind("nut_tag");
    public static final TagKey<Item> SATIETY = ModFoodTags.bind("satiety_tag");
    public static final TagKey<Item> FRUIT = ModFoodTags.bind("fruit_tag");
    public static final TagKey<Item> MEAT = ModFoodTags.bind("meat_tag");
    public static final TagKey<Item> SEAFOOD = ModFoodTags.bind("seafood_tag");
    public static final TagKey<Item> UNBELIEVABLE = ModFoodTags.bind("unbelievable_tag");
    public static final TagKey<Item> LUXURIOUS = ModFoodTags.bind("luxurious_tag");
    public static final TagKey<Item> HOT = ModFoodTags.bind("hot_tag");
    public static final TagKey<Item> POISON = ModFoodTags.bind("poison_tag");
    public static final TagKey<Item> BITTER = ModFoodTags.bind("bitter_tag");
    public static final TagKey<Item> MUSHROOM = ModFoodTags.bind("mushroom_tag");
    public static final TagKey<Item> OIL = ModFoodTags.bind("oil_tag");


    private static @NotNull TagKey<Item> bind(String id) {
        return TagKey.create(Registries.ITEM, AnvilCraftFoodingFabric.of(id));
    }
}
