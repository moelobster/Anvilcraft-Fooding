package dev.anvilcraft.fooding.events;

import java.util.HashMap;
import java.util.Map;

import dev.anvilcraft.fooding.events.effects.*;
import dev.anvilcraft.fooding.events.tag.ModFoodTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class OnFinishEatingFood {
    static private final Map<TagKey<Item>, FoodType> foodTypeMap = initFoodTypeMap();
    private static Map<TagKey<Item>, FoodType> initFoodTypeMap() {
        Map<TagKey<Item>, FoodType> foodTypeMap = new HashMap<>();
        foodTypeMap.put(ModFoodTags.SWEET, new Sweet());
        foodTypeMap.put(ModFoodTags.HOT, new Hot());
        foodTypeMap.put(ModFoodTags.NUT, new Nut());
        foodTypeMap.put(ModFoodTags.SATIETY, new Satiety());
        foodTypeMap.put(ModFoodTags.MEAT, new Meat());
        foodTypeMap.put(ModFoodTags.SEAFOOD, new Seafood());
        foodTypeMap.put(ModFoodTags.UNBELIEVABLE, new Unbelievable());
        foodTypeMap.put(ModFoodTags.LUXURIOUS, new Luxurious());
        foodTypeMap.put(ModFoodTags.POISON, new Poison());
        foodTypeMap.put(ModFoodTags.FRUIT, new Fruit());
        foodTypeMap.put(ModFoodTags.ACID, new Acid());
        foodTypeMap.put(ModFoodTags.BITTER,new Bitter());
        return foodTypeMap;
    }
    public static void onFinishEating(ItemStack itemStack, Level level, LivingEntity livingEntity){
        if (itemStack.isEdible()&&livingEntity instanceof ServerPlayer player){
            for (TagKey<Item> itemTagKey : itemStack.getTags().toList()) {
                if (foodTypeMap.containsKey(itemTagKey)) {
                    FoodType foodType = foodTypeMap.get(itemTagKey);
                    foodType.effect(itemStack, level, player);
                    foodType.addCounter(itemStack,level, player);
                }
            }
        }
    }
}

