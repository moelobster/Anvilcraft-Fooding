package dev.anvilcraft.fooding.events;

import dev.anvilcraft.fooding.init.block.ModTreesBlocks;
import dev.anvilcraft.fooding.init.block.ModWoodBlocks;
import dev.anvilcraft.fooding.init.food.ModFruitItems;
import dev.anvilcraft.fooding.init.food.ModMushroomItems;
import dev.anvilcraft.fooding.init.food.ModVegetableItems;
import dev.anvilcraft.fooding.init.item.ModSeedItems;
import net.minecraft.world.level.ItemLike;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ModComposterItems {
    private static void add(float f, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), f);
    }
    public static void bootStrap(){
        add(0.3f, ModTreesBlocks.APPLESAPLING);
        add(0.3f, ModTreesBlocks.PEARSAPLING);
        add(0.3f, ModTreesBlocks.LEMONSAPLING);
        add(0.3f, ModTreesBlocks.WALNUTSAPLING);
        add(0.3f, ModTreesBlocks.BANANASAPLING);
        add(0.3f, ModTreesBlocks.PEACHSAPLING);
        add(0.3f, ModTreesBlocks.COCONUTSAPLING);
        add(0.3f, ModTreesBlocks.CARAMBOLASAPLING);
        add(0.3f, ModTreesBlocks.TOONSAPLING);
        add(0.3f, ModWoodBlocks.APPLELEAVES);
        add(0.3f, ModWoodBlocks.PEARLEAVES);
        add(0.3f, ModWoodBlocks.LEMONLEAVES);
        add(0.3f, ModWoodBlocks.WALNUTLEAVES);
        add(0.3f, ModWoodBlocks.BANANALEAVES);
        add(0.3f, ModWoodBlocks.PEACHLEAVES);
        add(0.3f, ModWoodBlocks.COCONUTLEAVES);
        add(0.3f, ModWoodBlocks.CARAMBOLALEAVES);
        add(0.3f, ModWoodBlocks.TOONLEAVES);
        add(0.3f, ModSeedItems.HOUTTUYNIACORDATASEED);
        add(0.3f, ModSeedItems.CORIANDERSEED);
        add(0.3f, ModSeedItems.CELERYSEED);
        add(0.3f, ModSeedItems.SPINACHSEED);
        add(0.3f, ModSeedItems.CABBAGESEED);
        add(0.3f, ModSeedItems.CHINESECABBAGESEED);
        add(0.3f, ModSeedItems.GENSINGSEED);
        add(0.3f, ModSeedItems.AMERICANGENSINGSEED);
        add(0.3f, ModSeedItems.GOURDSEED);
        add(0.3f, ModSeedItems.SOYBEANSSEED);
        add(0.3f, ModSeedItems.FRENCHBEANSSEED);
        add(0.3f, ModSeedItems.COWPEASEED);
        add(0.3f, ModSeedItems.PEASEED);
        add(0.3f, ModSeedItems.PEANUTSEED);
        add(0.65f, ModVegetableItems.TOONLEAF);
        add(0.65f, ModVegetableItems.HOUTTUYNIACORDATA);
        add(0.65f, ModVegetableItems.CORIANDER);
        add(0.65f, ModVegetableItems.CELERY);
        add(0.65f, ModVegetableItems.SPINACH);
        add(0.65f, ModVegetableItems.CABBAGE);
        add(0.65f, ModVegetableItems.CHINESECABBAGE);
        add(0.65f, ModVegetableItems.EGGPLANT);
        add(0.65f, ModVegetableItems.CHILI);
        add(0.65f, ModVegetableItems.TOMATO);
        add(0.65f, ModVegetableItems.GENSING);
        add(0.65f, ModVegetableItems.AMERICANGENSING);
        add(0.65f, ModVegetableItems.GOURD);
        add(0.65f, ModVegetableItems.SOYBEANS);
        add(0.65f, ModVegetableItems.FRENCHBEANS);
        add(0.65f, ModVegetableItems.COWPEA);
        add(0.65f, ModVegetableItems.PEA);
        add(0.65f, ModVegetableItems.PEANUT);
        add(0.65f, ModMushroomItems.GREENMUSHROOM);
        add(0.65f, ModMushroomItems.BLUEMUSHROOM);
        add(0.65f, ModMushroomItems.TREMELLA);
        add(0.65f, ModMushroomItems.BLACKFUNGUS);
        add(0.65f, ModMushroomItems.MUSHROOM);
        add(0.65f, ModMushroomItems.FLAMMULINAENOKI);
        add(0.65f, ModFruitItems.PEAR);
        add(0.65f, ModFruitItems.LEMON);
        add(0.65f, ModFruitItems.GRAPE);
        add(0.65f, ModFruitItems.BANANA);
        add(0.65f, ModFruitItems.WALNUT);
        add(0.65f, ModFruitItems.CHERRY);
        add(0.65f, ModFruitItems.PEACH);
        add(0.65f, ModFruitItems.COCONUT);
        add(0.65f, ModFruitItems.CARAMBOLA);
        add(0.65f, ModFruitItems.STRAWBERRY);
        add(0.65f, ModFruitItems.BLUEBERRY);
        add(0.65f, ModFruitItems.TOON);
    }
}
