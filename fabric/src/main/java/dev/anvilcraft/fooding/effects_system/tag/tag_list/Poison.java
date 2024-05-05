package dev.anvilcraft.fooding.effects_system.tag.tag_list;

import dev.anvilcraft.fooding.effects_system.tag.ModFoodTags;
import dev.anvilcraft.fooding.init.others.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Poison implements FoodType{

    @Override
    public ResourceLocation getCunter() {
        return ModPlayerStatistics.POISONCOUNTER;
    }

    @Override
    public ResourceLocation getJudge() {
        return ModPlayerStatistics.POISONJUDGE;
    }
    @Override
    public void effect(@NotNull ItemStack itemStack,Level level, ServerPlayer serverPlayer){
        if (itemStack.is(ModFoodTags.POISON)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM, getCunter());
            for (;num>=1;num=num/ FoodType.judgeNum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM, getJudge())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION,30*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM, getJudge())==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 5.0f*l;
                serverPlayer.setHealth(newHealth);
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,40*l,2));
            }
        }
    }
}
