package dev.anvilcraft.fooding.data;


import dev.anvilcraft.fooding.events.tag.ModFoodTags;
import dev.anvilcraft.fooding.init.food.ModFruitItems;
import dev.anvilcraft.fooding.init.food.ModJamsItems;
import dev.anvilcraft.fooding.init.food.ModVegetableItems;
import dev.anvilcraft.fooding.init.food.dish.HomeCookedDish;
import dev.anvilcraft.fooding.init.others.ModBlockItems;
import dev.dubhe.anvilcraft.init.ModItems;
import dev.dubhe.anvilcraft.item.ModFoods;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlockItems.APPLELOG)
                .add(ModBlockItems.APPLEWOOD)
                .add(ModBlockItems.PEARLOG)
                .add(ModBlockItems.PEARWOOD)
                .add(ModBlockItems.LEMONLOG)
                .add(ModBlockItems.LEMONWOOD)
                .add(ModBlockItems.WALNUTLOG)
                .add(ModBlockItems.WALNUTWOOD)
                .add(ModBlockItems.BANANALOG)
                .add(ModBlockItems.BANANAWOOD)
                .add(ModBlockItems.PEACHLOG)
                .add(ModBlockItems.PEACHWOOD)
                .add(ModBlockItems.COCONUTLOG)
                .add(ModBlockItems.COCONUTWOOD)
                .add(ModBlockItems.CARAMBOLALOG)
                .add(ModBlockItems.CARAMBOLAWOOD)
                .add(ModBlockItems.TOONLOG)
                .add(ModBlockItems.TOONWOOD);
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlockItems.APPLEPLANKS)
                .add(ModBlockItems.PEARPLANKS)
                .add(ModBlockItems.LEMONPLANKS)
                .add(ModBlockItems.WALNUTPLANKS)
                .add(ModBlockItems.BANANAPLANKS)
                .add(ModBlockItems.PEACHPLANKS)
                .add(ModBlockItems.COCONUTPLANKS)
                .add(ModBlockItems.CARAMBOLAPLANKS)
                .add(ModBlockItems.TOONPLANKS);
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlockItems.APPLELOG)
                .add(ModBlockItems.PEARLOG)
                .add(ModBlockItems.LEMONLOG)
                .add(ModBlockItems.WALNUTLOG)
                .add(ModBlockItems.BANANALOG)
                .add(ModBlockItems.PEACHLOG)
                .add(ModBlockItems.COCONUTLOG)
                .add(ModBlockItems.CARAMBOLALOG)
                .add(ModBlockItems.TOONLOG);
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlockItems.APPLEBUTTON)
                .add(ModBlockItems.PEARBUTTON)
                .add(ModBlockItems.LEMONBUTTON)
                .add(ModBlockItems.WALNUTBUTTON)
                .add(ModBlockItems.BANANABUTTON)
                .add(ModBlockItems.PEACHBUTTON)
                .add(ModBlockItems.COCONUTBUTTON)
                .add(ModBlockItems.CARAMBOLABUTTON)
                .add(ModBlockItems.TOONBUTTON);
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlockItems.APPLEDOOR)
                .add(ModBlockItems.PEARDOOR)
                .add(ModBlockItems.LEMONDOOR)
                .add(ModBlockItems.WALNUTDOOR)
                .add(ModBlockItems.BANANADOOR)
                .add(ModBlockItems.PEACHDOOR)
                .add(ModBlockItems.COCONUTDOOR)
                .add(ModBlockItems.CARAMBOLADOOR)
                .add(ModBlockItems.TOONDOOR);
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlockItems.APPLESTAIRS)
                .add(ModBlockItems.PEARSTAIRS)
                .add(ModBlockItems.LEMONSTAIRS)
                .add(ModBlockItems.WALNUTSTAIRS)
                .add(ModBlockItems.BANANASTAIRS)
                .add(ModBlockItems.PEACHSTAIRS)
                .add(ModBlockItems.COCONUTSTAIRS)
                .add(ModBlockItems.CARAMBOLASTAIRS)
                .add(ModBlockItems.TOONSTAIRS);
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlockItems.APPLESLAB)
                .add(ModBlockItems.PEARSLAB)
                .add(ModBlockItems.LEMONSLAB)
                .add(ModBlockItems.WALNUTSLAB)
                .add(ModBlockItems.BANANASLAB)
                .add(ModBlockItems.PEACHSLAB)
                .add(ModBlockItems.COCONUTSLAB)
                .add(ModBlockItems.CARAMBOLASLAB)
                .add(ModBlockItems.TOONSLAB);
        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlockItems.APPLEFENCE)
                .add(ModBlockItems.PEARFENCE)
                .add(ModBlockItems.LEMONFENCE)
                .add(ModBlockItems.WALNUTFENCE)
                .add(ModBlockItems.BANANAFENCE)
                .add(ModBlockItems.PEACHFENCE)
                .add(ModBlockItems.COCONUTFENCE)
                .add(ModBlockItems.CARAMBOLAFENCE)
                .add(ModBlockItems.TOONFENCE);
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlockItems.APPLEPRESSUERPLATE)
                .add(ModBlockItems.PEARPRESSUERPLATE)
                .add(ModBlockItems.LEMONPRESSUERPLATE)
                .add(ModBlockItems.WALNUTPRESSUERPLATE)
                .add(ModBlockItems.BANANAPRESSUERPLATE)
                .add(ModBlockItems.PEACHPRESSUERPLATE)
                .add(ModBlockItems.COCONUTPRESSUERPLATE)
                .add(ModBlockItems.CARAMBOLAPRESSUERPLATE)
                .add(ModBlockItems.TOONPRESSUERPLATE);
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlockItems.APPLETRAPDOOR)
                .add(ModBlockItems.PEARTRAPDOOR)
                .add(ModBlockItems.LEMONTRAPDOOR)
                .add(ModBlockItems.WALNUTTRAPDOOR)
                .add(ModBlockItems.BANANATRAPDOOR)
                .add(ModBlockItems.PEACHTRAPDOOR)
                .add(ModBlockItems.COCONUTTRAPDOOR)
                .add(ModBlockItems.CARAMBOLATRAPDOOR)
                .add(ModBlockItems.TOONTRAPDOOR);
        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlockItems.APPLESAPLING)
                .add(ModBlockItems.PEARSAPLING)
                .add(ModBlockItems.LEMONSAPLING)
                .add(ModBlockItems.WALNUTSAPLING)
                .add(ModBlockItems.BANANASAPLING)
                .add(ModBlockItems.PEACHSAPLING)
                .add(ModBlockItems.COCONUTSAPLING)
                .add(ModBlockItems.CARAMBOLASAPLING)
                .add(ModBlockItems.TOONSAPLING);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlockItems.APPLELEAVES)
                .add(ModBlockItems.PEARLEAVES)
                .add(ModBlockItems.LEMONLEAVES)
                .add(ModBlockItems.WALNUTLEAVES)
                .add(ModBlockItems.BANANALEAVES)
                .add(ModBlockItems.PEACHLEAVES)
                .add(ModBlockItems.COCONUTLEAVES)
                .add(ModBlockItems.CARAMBOLALEAVES)
                .add(ModBlockItems.TOONLEAVES);


        getOrCreateTagBuilder(ModFoodTags.SWEET)//甜
                .add(Items.HONEY_BOTTLE)
                .add(Items.PUMPKIN_PIE)
                .add(Items.GLOW_BERRIES)
                .add(ModJamsItems.GLOWBERRIESJAM)
                .add(Items.SWEET_BERRIES)
                .add(ModJamsItems.SWEETBERRIESJAM)
                .add(Items.MELON_SLICE)
                .add(ModFruitItems.PEAR)
                .add(ModJamsItems.PEARJAM)
                .add(Items.APPLE)
                .add(ModJamsItems.APPLEJAM)
                .add(ModFruitItems.BANANA)
                .add(ModFruitItems.BLUEBERRY)
                .add(ModJamsItems.BLUEBERRYJAM)
                .add(ModFruitItems.STRAWBERRY)
                .add(ModJamsItems.STRAWBERRYJAM)
                .add(ModFruitItems.PEACH)
                .add(ModJamsItems.PEACHJAM)
                .add(ModFruitItems.CARAMBOLA)
                .add(ModFruitItems.CHERRY)
                .add(ModJamsItems.CARAMBOLAJAM)
                .add(ModFruitItems.COCONUT)
                .add(ModFruitItems.GRAPE)
                .add(ModJamsItems.GRAPEJAM)
                .add(ModVegetableItems.TOMATO)
                .add(ModJamsItems.TOMATOJAM)
                .add(ModItems.CHOCOLATE.getId())
                .add(ModItems.CHOCOLATE_BLACK.getId())
                .add(ModItems.CHOCOLATE_WHITE.getId());
        getOrCreateTagBuilder(ModFoodTags.ACID)//酸
                .add(ModVegetableItems.TOMATO)
                .add(ModJamsItems.TOMATOJAM)
                .add(ModFruitItems.GRAPE)
                .add(ModJamsItems.GRAPEJAM)
                .add(ModFruitItems.LEMON)
                .add(ModJamsItems.LEMONJAM)
                .add(ModFruitItems.CHERRY)
                .add(ModJamsItems.CHERRYJAM);
        getOrCreateTagBuilder(ModFoodTags.HOT)//辛
                .add(ModVegetableItems.CHILI)
                .add(ModVegetableItems.HOUTTUYNIACORDATA)
                .add(ModJamsItems.CHILIJAM);
        getOrCreateTagBuilder(ModFoodTags.NUT)//坚果
                .add(ModFruitItems.TOON)
                .add(ModFruitItems.WALNUT);
        getOrCreateTagBuilder(ModFoodTags.SATIETY)//饱腹
                .add(Items.PUMPKIN_PIE)
                .add(Items.BAKED_POTATO)
                .add(Items.BREAD)
                .add(ModItems.CREAMY_BREAD_ROLL.getId())
                .add(HomeCookedDish.DUMPLING);
        getOrCreateTagBuilder(ModFoodTags.FRUIT)//果味
                .add(Items.GLOW_BERRIES)
                .add(Items.SWEET_BERRIES)
                .add(Items.MELON_SLICE)
                .add(Items.APPLE)
                .add(ModFruitItems.PEAR)
                .add(ModFruitItems.BANANA)
                .add(ModFruitItems.BLUEBERRY)
                .add(ModFruitItems.STRAWBERRY)
                .add(ModFruitItems.PEACH)
                .add(ModFruitItems.CARAMBOLA)
                .add(ModFruitItems.CHERRY)
                .add(ModFruitItems.COCONUT)
                .add(ModFruitItems.GRAPE)
                .add(ModFruitItems.LEMON);
        getOrCreateTagBuilder(ModFoodTags.MEAT)//肉
                .add(Items.RABBIT_STEW)
                .add(Items.COOKED_BEEF)
                .add(Items.COOKED_CHICKEN)
                .add(Items.COOKED_MUTTON)
                .add(Items.COOKED_PORKCHOP)
                .add(Items.COOKED_RABBIT)
                .add(ModItems.BEEF_MUSHROOM_STEW_RAW.getId())
                .add(HomeCookedDish.DUMPLING);
        getOrCreateTagBuilder(ModFoodTags.SEAFOOD)//海味
                .add(Items.COOKED_COD)
                .add(Items.COOKED_SALMON)
                .add(Items.PUFFERFISH)
                .add(Items.TROPICAL_FISH)
                .add(Items.DRIED_KELP);
        getOrCreateTagBuilder(ModFoodTags.UNBELIEVABLE)//不可思议
                .add(Items.CHORUS_FRUIT)
                .add(Items.GOLDEN_APPLE)
                .add(Items.ENCHANTED_GOLDEN_APPLE);
        getOrCreateTagBuilder(ModFoodTags.LUXURIOUS)//华贵
                .add(Items.GOLDEN_APPLE)
                .add(Items.ENCHANTED_GOLDEN_APPLE)
                .add(Items.GOLDEN_CARROT);
        getOrCreateTagBuilder(ModFoodTags.POISON)//毒
                .add(Items.SPIDER_EYE);
        getOrCreateTagBuilder(ModFoodTags.BITTER)//苦
                .add(ModItems.CHOCOLATE_BLACK.getId());

    }

}
