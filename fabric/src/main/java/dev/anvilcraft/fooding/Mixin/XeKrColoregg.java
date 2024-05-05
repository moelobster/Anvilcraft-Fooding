package dev.anvilcraft.fooding.Mixin;

import dev.anvilcraft.fooding.coloregg.XeKr;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MushroomCow.class)
public abstract class XeKrColoregg {

    @Inject(method = "mobInteract",at = @At("HEAD"))
    private void MobInteract(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir){
        XeKr.ModInteract(player,hand,(MushroomCow)(Object)this);
    }
}
