package dev.anvilcraft.fooding.effects_system.tag.tag_list;

import java.util.Random;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface FoodType {
  int judgeNum = 4;
  ResourceLocation getCunter();
  ResourceLocation getJudge();
  void effect(ItemStack itemStack,Level level, ServerPlayer serverPlayer);
  default void addCounter(ItemStack itemStack,Level level, ServerPlayer serverPlayer){
      serverPlayer.awardStat(getCunter(),1);
      int counter = serverPlayer.getStats().getValue(Stats.CUSTOM, getCunter());
      if (counter>=judgeNum && serverPlayer.getStats().getValue(Stats.CUSTOM, getJudge())==0){
        Random RANDOM = new Random();
        if (RANDOM.nextDouble()>=0.5){
          serverPlayer.awardStat(getJudge(),1);
        }else {
          serverPlayer.awardStat(getJudge(),2);
        }
      }
    }
}
