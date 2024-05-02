package dev.anvilcraft.fooding.fabric;

import dev.anvilcraft.fooding.init.blocks.ModCrops;
import dev.anvilcraft.fooding.init.blocks.ModTrees;
import dev.anvilcraft.fooding.init.blocks.ModWood;
import dev.anvilcraft.fooding.init.items.*;
import dev.anvilcraft.fooding.init.others.ModItemGroup;
import dev.anvilcraft.fooding.init.others.ModItems;
import dev.anvilcraft.fooding.init.others.ModPlayerStatistics;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AnvilCraftFoodingFabric implements ModInitializer {
    public static final String MOD_ID = "anvilcraft_fooding";

    @Override
    public void onInitialize() {
        ModTrees.register();
        ModWood.register();
        ModItems.register();
        ModMushroom.register();
        ModCereals.register();
        ModVegetable.register();
        ModFruit.register();
        ModJams.register();
        ModCrops.register();
        ModItemGroup.register();
        ModPlayerStatistics.register();
    }
    public static @NotNull ResourceLocation of(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}
