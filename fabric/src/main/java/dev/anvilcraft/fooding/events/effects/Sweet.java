package dev.anvilcraft.fooding.events.effects;

import dev.anvilcraft.fooding.events.tag.ModFoodTags;
import dev.anvilcraft.fooding.init.others.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Sweet implements FoodType{

    @Override
    public ResourceLocation getCunterResourceLocation() {
        return ModPlayerStatistics.SWEETCOUNTER;
    }

    @Override
    public ResourceLocation getJudgeResourceLocation() {
        return ModPlayerStatistics.SWEETJUDGE;
    }
    @Override
    public void effect(@NotNull ItemStack itemStack,Level level, ServerPlayer serverPlayer){
        if (itemStack.is(ModFoodTags.SWEET)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation());
            for (;num>=1;num=num/ FoodType.judgeNum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==1){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth + 1.0f*l;
                serverPlayer.setHealth(newHealth);
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,5*l,1));
            }
        }
    }
}
