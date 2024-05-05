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

public class Mushroom implements FoodType {

    @Override
    public ResourceLocation getCunter() {
        return ModPlayerStatistics.MUSHROOMCOUNTER;
    }

    @Override
    public ResourceLocation getJudge() {
        return ModPlayerStatistics.MUSHROOMJUDGE;
    }

    @Override
    public void effect(@NotNull ItemStack itemStack,Level level, ServerPlayer serverPlayer){
        if (itemStack.is(ModFoodTags.MUSHROOM)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,getCunter());
            for (;num>=1;num=num/ judgeNum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudge())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,5*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudge())==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 8.0f*l;
                serverPlayer.setHealth(newHealth);
            }
        }
    }
}
