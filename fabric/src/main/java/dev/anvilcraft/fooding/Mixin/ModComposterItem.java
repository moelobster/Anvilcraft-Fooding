package dev.anvilcraft.fooding.Mixin;


import dev.anvilcraft.fooding.events.ModComposterItems;
import net.minecraft.world.level.block.ComposterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ComposterBlock.class)
public abstract class ModComposterItem {
    @Inject(method = "bootStrap",at = @At("TAIL"))
    private static void bootStrap(CallbackInfo ci){
        ModComposterItems.bootStrap();
    }
}
