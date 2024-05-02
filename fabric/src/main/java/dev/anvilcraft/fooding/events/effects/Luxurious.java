package dev.anvilcraft.fooding.events.effects;

import java.util.Random;

import dev.anvilcraft.fooding.events.tag.ModFoodTags;
import dev.anvilcraft.fooding.init.others.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Luxurious implements FoodType{
    @Override
    public ResourceLocation getCunterResourceLocation() {
        return ModPlayerStatistics.LUXURIOUSCOUNTER;
    }

    @Override
    public ResourceLocation getJudgeResourceLocation() {
        return ModPlayerStatistics.LUXURIOUSJUDGE;
    }
    @Override
    public void effect(@NotNull ItemStack itemStack,Level level, ServerPlayer serverPlayer){
        if (itemStack.is(ModFoodTags.LUXURIOUS)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation());
            for (;num>=1;num=num/ FoodType.judgeNum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK,5*l,1));
                Random RANDOM = new Random();
                if (RANDOM.nextDouble() <= 0.05*l) {
                    ItemStack goldIngotStack = new ItemStack(Items.DIAMOND);
                    ItemEntity goldIngotEntity = new ItemEntity(level, serverPlayer.xOld, serverPlayer.yOld, serverPlayer.zOld, goldIngotStack);
                    level.addFreshEntity(goldIngotEntity);
                }
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,5*l,1));
            }
        }
    }
}
