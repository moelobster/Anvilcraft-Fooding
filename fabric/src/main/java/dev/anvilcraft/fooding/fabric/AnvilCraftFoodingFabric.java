package dev.anvilcraft.fooding.fabric;

import dev.anvilcraft.fooding.init.block.ModCropsBlocks;
import dev.anvilcraft.fooding.init.block.ModTreesBlocks;
import dev.anvilcraft.fooding.init.block.ModWoodBlocks;
import dev.anvilcraft.fooding.init.food.*;
import dev.anvilcraft.fooding.init.food.coloregg.XeKr;
import dev.anvilcraft.fooding.init.food.dish.HomeCookedDish;
import dev.anvilcraft.fooding.init.food.dish.raw.HomeCookedDishRaw;
import dev.anvilcraft.fooding.init.item.ModSeedItems;
import dev.anvilcraft.fooding.init.item.ModWoodenItems;
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
        //block
        ModCropsBlocks.register();
        ModTreesBlocks.register();
        ModWoodBlocks.register();
        //food
        HomeCookedDish.register();
        HomeCookedDishRaw.register();
        ModMushroomItems.register();
        ModCerealsItems.register();
        ModVegetableItems.register();
        ModFruitItems.register();
        ModJamsItems.register();
        //item
        ModSeedItems.register();
        ModWoodenItems.register();
        //other
        ModBlockItems.register();
        ModItemGroups.register();
        ModPlayerStatistics.register();


        //egg
        XeKr.register();
    }
    public static @NotNull ResourceLocation of(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}
