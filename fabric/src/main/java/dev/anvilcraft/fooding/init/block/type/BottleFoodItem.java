package dev.anvilcraft.fooding.init.block.type;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BottleFoodItem extends Item {
    public BottleFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack itemStack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
        ItemStack itemStack2 = super.finishUsingItem(itemStack, level, livingEntity);
        if (livingEntity instanceof Player && ((Player)livingEntity).getAbilities().instabuild) {
            return itemStack2;
        }
        return new ItemStack(Items.GLASS_BOTTLE);
    }
}
