package dev.anvilcraft.fooding.data;

import dev.anvilcraft.fooding.init.blocks.ModWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModWood.APPLELOG)
                .add(ModWood.APPLEWOOD)
                .add(ModWood.PEARLOG)
                .add(ModWood.PEARWOOD)
                .add(ModWood.LEMONLOG)
                .add(ModWood.LEMONWOOD)
                .add(ModWood.WALNUTLOG)
                .add(ModWood.WALNUTWOOD)
                .add(ModWood.BANANALOG)
                .add(ModWood.BANANAWOOD)
                .add(ModWood.PEACHLOG)
                .add(ModWood.PEACHWOOD)
                .add(ModWood.COCONUTLOG)
                .add(ModWood.COCONUTWOOD)
                .add(ModWood.CARAMBOLALOG)
                .add(ModWood.CARAMBOLAWOOD)
                .add(ModWood.TOONLOG)
                .add(ModWood.TOONWOOD);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModWood.APPLEFENCE)
                .add(ModWood.PEARFENCE)
                .add(ModWood.LEMONFENCE)
                .add(ModWood.WALNUTFENCE)
                .add(ModWood.BANANAFENCE)
                .add(ModWood.PEACHFENCE)
                .add(ModWood.COCONUTFENCE)
                .add(ModWood.CARAMBOLAFENCE)
                .add(ModWood.TOONFENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModWood.APPLEFENCEGATE)
                .add(ModWood.PEARFENCEGATE)
                .add(ModWood.LEMONFENCEGATE)
                .add(ModWood.WALNUTFENCEGATE)
                .add(ModWood.BANANAFENCEGATE)
                .add(ModWood.PEACHFENCEGATE)
                .add(ModWood.COCONUTFENCEGATE)
                .add(ModWood.CARAMBOLAFENCEGATE)
                .add(ModWood.TOONFENCEGATE);
    }
}
