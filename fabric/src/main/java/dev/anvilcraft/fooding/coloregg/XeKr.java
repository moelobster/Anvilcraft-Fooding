package dev.anvilcraft.fooding.coloregg;

import dev.dubhe.anvilcraft.init.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SuspiciousStewItem;

import java.util.Objects;

public class XeKr {
    public static InteractionResult ModInteract(Player player2, InteractionHand interactionHand, MushroomCow mushroomCow){
        ItemStack itemStack = player2.getItemInHand(interactionHand);
        if (itemStack.is(Items.BOWL) && !mushroomCow.isBaby() && mushroomCow.hasCustomName() && mushroomCow.getCustomName().getString().equals("XeKr")) {
            ItemStack itemStack2;
            itemStack2 = new ItemStack(ModItems.BEEF_MUSHROOM_STEW);
            ItemStack itemStack3 = ItemUtils.createFilledResult(itemStack, player2, itemStack2, false);
            player2.setItemInHand(interactionHand, itemStack3);
            SoundEvent soundEvent = SoundEvents.MOOSHROOM_MILK;
            mushroomCow.playSound(soundEvent, 1.0f, 1.0f);
            return InteractionResult.sidedSuccess(mushroomCow.level().isClientSide);
        }
        return null;
    }
}
