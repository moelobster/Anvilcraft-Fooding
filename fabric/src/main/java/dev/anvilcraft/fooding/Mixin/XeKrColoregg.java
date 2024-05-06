package dev.anvilcraft.fooding.Mixin;

import dev.anvilcraft.fooding.init.food.coloregg.XeKr;
import dev.dubhe.anvilcraft.init.ModItems;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MushroomCow.class)
public abstract class XeKrColoregg {

    @ModifyArg(method = "mobInteract",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemUtils;createFilledResult(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Z)Lnet/minecraft/world/item/ItemStack;"),index = 2)
    private ItemStack MobInteract(ItemStack emptyStack){
        MushroomCow mushroomCow = (MushroomCow)(Object)this;
        if (mushroomCow.hasCustomName()){
            if (mushroomCow.getCustomName().getString().equals("XeKr")){
                ItemStack itemStack = new ItemStack(XeKr.BEEF_MUSHROOM_STEW_XEKR);
                return itemStack;
            }
        }
        return emptyStack;
    }
}
