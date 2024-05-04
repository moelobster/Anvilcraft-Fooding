package dev.anvilcraft.fooding.fabric;

import dev.anvilcraft.fooding.init.block.ModCropsBlocks;
import dev.anvilcraft.fooding.init.block.ModTreesBlocks;
import dev.anvilcraft.fooding.init.block.ModWoodBlocks;
import dev.anvilcraft.fooding.init.food.*;
import dev.anvilcraft.fooding.init.others.ModItemGroups;
import dev.anvilcraft.fooding.init.others.ModBlockItems;
import dev.anvilcraft.fooding.init.others.ModPlayerStatistics;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AnvilCraftFoodingFabric implements ModInitializer {
    public static final String MOD_ID = "anvilcraft_fooding";

    @Override
    public void onInitialize() {
        ModTreesBlocks.register();
        ModWoodBlocks.register();
        ModBlockItems.register();
        ModMushroomItems.register();
        ModCerealsItems.register();
        ModVegetableItems.register();
        ModFruitItems.register();
        ModJamsItems.register();
        ModCropsBlocks.register();
        ModItemGroups.register();
        ModPlayerStatistics.register();
    }
    public static @NotNull ResourceLocation of(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}
