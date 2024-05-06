package dev.anvilcraft.fooding.init.food.coloregg.fooddata;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class XeKr {
    public static final FoodProperties BEEF_MUSHROOM_STEW_XEKR = new FoodProperties.Builder()
            .nutrition(10).saturationMod(0.8f).effect(new MobEffectInstance(MobEffects.HUNGER,400,1),1.0f).effect(new MobEffectInstance(MobEffects.WITHER,400,1),1.0f).build();
}
