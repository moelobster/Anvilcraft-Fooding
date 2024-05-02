package dev.anvilcraft.fooding.events.effects;

import java.util.Random;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface FoodType {
  int judgeNum = 128;
  ResourceLocation getCunterResourceLocation();
  ResourceLocation getJudgeResourceLocation();
  void effect(ItemStack itemStack,Level level, ServerPlayer serverPlayer);
  default void addCounter(ItemStack itemStack,Level level, ServerPlayer serverPlayer){
      serverPlayer.awardStat(getCunterResourceLocation(),1);
      int counter = serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation());
      if (counter>=judgeNum && serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==0){
        Random RANDOM = new Random();
        if (RANDOM.nextDouble()>=0.5){
          serverPlayer.awardStat(getJudgeResourceLocation(),1);
        }else {
          serverPlayer.awardStat(getJudgeResourceLocation(),2);
        }
      }
    }
}
