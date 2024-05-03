package dev.anvilcraft.fooding.data;


import dev.anvilcraft.fooding.events.tag.ModFoodTags;
import dev.anvilcraft.fooding.init.blocks.ModTrees;
import dev.anvilcraft.fooding.init.blocks.ModWood;
import dev.anvilcraft.fooding.init.items.ModFruit;
import dev.anvilcraft.fooding.init.items.ModJams;
import dev.anvilcraft.fooding.init.items.ModVegetable;
import dev.anvilcraft.fooding.init.others.ModItems;
import dev.dubhe.anvilcraft.init.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModItems.APPLELOG)
                .add(ModItems.APPLEWOOD)
                .add(ModItems.PEARLOG)
                .add(ModItems.PEARWOOD)
                .add(ModItems.LEMONLOG)
                .add(ModItems.LEMONWOOD)
                .add(ModItems.WALNUTLOG)
                .add(ModItems.WALNUTWOOD)
                .add(ModItems.BANANALOG)
                .add(ModItems.BANANAWOOD)
                .add(ModItems.PEACHLOG)
                .add(ModItems.PEACHWOOD)
                .add(ModItems.COCONUTLOG)
                .add(ModItems.COCONUTWOOD)
                .add(ModItems.CARAMBOLALOG)
                .add(ModItems.CARAMBOLAWOOD)
                .add(ModItems.TOONLOG)
                .add(ModItems.TOONWOOD);
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModItems.APPLEPLANKS)
                .add(ModItems.PEARPLANKS)
                .add(ModItems.LEMONPLANKS)
                .add(ModItems.WALNUTPLANKS)
                .add(ModItems.BANANAPLANKS)
                .add(ModItems.PEACHPLANKS)
                .add(ModItems.COCONUTPLANKS)
                .add(ModItems.CARAMBOLAPLANKS)
                .add(ModItems.TOONPLANKS);
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModItems.APPLELOG)
                .add(ModItems.PEARLOG)
                .add(ModItems.LEMONLOG)
                .add(ModItems.WALNUTLOG)
                .add(ModItems.BANANALOG)
                .add(ModItems.PEACHLOG)
                .add(ModItems.COCONUTLOG)
                .add(ModItems.CARAMBOLALOG)
                .add(ModItems.TOONLOG);
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModItems.APPLEBUTTON)
                .add(ModItems.PEARBUTTON)
                .add(ModItems.LEMONBUTTON)
                .add(ModItems.WALNUTBUTTON)
                .add(ModItems.BANANABUTTON)
                .add(ModItems.PEACHBUTTON)
                .add(ModItems.COCONUTBUTTON)
                .add(ModItems.CARAMBOLABUTTON)
                .add(ModItems.TOONBUTTON);
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModItems.APPLEDOOR)
                .add(ModItems.PEARDOOR)
                .add(ModItems.LEMONDOOR)
                .add(ModItems.WALNUTDOOR)
                .add(ModItems.BANANADOOR)
                .add(ModItems.PEACHDOOR)
                .add(ModItems.COCONUTDOOR)
                .add(ModItems.CARAMBOLADOOR)
                .add(ModItems.TOONDOOR);
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModItems.APPLESTAIRS)
                .add(ModItems.PEARSTAIRS)
                .add(ModItems.LEMONSTAIRS)
                .add(ModItems.WALNUTSTAIRS)
                .add(ModItems.BANANASTAIRS)
                .add(ModItems.PEACHSTAIRS)
                .add(ModItems.COCONUTSTAIRS)
                .add(ModItems.CARAMBOLASTAIRS)
                .add(ModItems.TOONSTAIRS);
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModItems.APPLESLAB)
                .add(ModItems.PEARSLAB)
                .add(ModItems.LEMONSLAB)
                .add(ModItems.WALNUTSLAB)
                .add(ModItems.BANANASLAB)
                .add(ModItems.PEACHSLAB)
                .add(ModItems.COCONUTSLAB)
                .add(ModItems.CARAMBOLASLAB)
                .add(ModItems.TOONSLAB);
        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModItems.APPLEFENCE)
                .add(ModItems.PEARFENCE)
                .add(ModItems.LEMONFENCE)
                .add(ModItems.WALNUTFENCE)
                .add(ModItems.BANANAFENCE)
                .add(ModItems.PEACHFENCE)
                .add(ModItems.COCONUTFENCE)
                .add(ModItems.CARAMBOLAFENCE)
                .add(ModItems.TOONFENCE);
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModItems.APPLEPRESSUERPLATE)
                .add(ModItems.PEARPRESSUERPLATE)
                .add(ModItems.LEMONPRESSUERPLATE)
                .add(ModItems.WALNUTPRESSUERPLATE)
                .add(ModItems.BANANAPRESSUERPLATE)
                .add(ModItems.PEACHPRESSUERPLATE)
                .add(ModItems.COCONUTPRESSUERPLATE)
                .add(ModItems.CARAMBOLAPRESSUERPLATE)
                .add(ModItems.TOONPRESSUERPLATE);
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModItems.APPLETRAPDOOR)
                .add(ModItems.PEARTRAPDOOR)
                .add(ModItems.LEMONTRAPDOOR)
                .add(ModItems.WALNUTTRAPDOOR)
                .add(ModItems.BANANATRAPDOOR)
                .add(ModItems.PEACHTRAPDOOR)
                .add(ModItems.COCONUTTRAPDOOR)
                .add(ModItems.CARAMBOLATRAPDOOR)
                .add(ModItems.TOONTRAPDOOR);
        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModItems.APPLESAPLING)
                .add(ModItems.PEARSAPLING)
                .add(ModItems.LEMONSAPLING)
                .add(ModItems.WALNUTSAPLING)
                .add(ModItems.BANANASAPLING)
                .add(ModItems.PEACHSAPLING)
                .add(ModItems.COCONUTSAPLING)
                .add(ModItems.CARAMBOLASAPLING)
                .add(ModItems.TOONSAPLING);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModItems.APPLELEAVES)
                .add(ModItems.PEARLEAVES)
                .add(ModItems.LEMONLEAVES)
                .add(ModItems.WALNUTLEAVES)
                .add(ModItems.BANANALEAVES)
                .add(ModItems.PEACHLEAVES)
                .add(ModItems.COCONUTLEAVES)
                .add(ModItems.CARAMBOLALEAVES)
                .add(ModItems.TOONLEAVES);


        getOrCreateTagBuilder(ModFoodTags.SWEET)//甜
                .add(Items.HONEY_BOTTLE)
                .add(Items.PUMPKIN_PIE)
                .add(Items.GLOW_BERRIES)
                .add(ModJams.GLOWBERRIESJAM)
                .add(Items.SWEET_BERRIES)
                .add(ModJams.SWEETBERRIESJAM)
                .add(Items.MELON_SLICE)
                .add(ModFruit.PEAR)
                .add(ModJams.PEARJAM)
                .add(Items.APPLE)
                .add(ModJams.APPLEJAM)
                .add(ModFruit.BANANA)
                .add(ModFruit.BLUEBERRY)
                .add(ModJams.BLUEBERRYJAM)
                .add(ModFruit.STRAWBERRY)
                .add(ModJams.STRAWBERRYJAM)
                .add(ModFruit.PEACH)
                .add(ModJams.PEACHJAM)
                .add(ModFruit.CARAMBOLA)
                .add(ModFruit.CHERRY)
                .add(ModJams.CARAMBOLAJAM)
                .add(ModFruit.COCONUT)
                .add(ModFruit.GRAPE)
                .add(ModJams.GRAPEJAM)
                .add(ModVegetable.TOMATO)
                .add(ModJams.TOMATOJAM);
        getOrCreateTagBuilder(ModFoodTags.ACID)//酸
                .add(ModVegetable.TOMATO)
                .add(ModJams.TOMATOJAM)
                .add(ModFruit.GRAPE)
                .add(ModJams.GRAPEJAM)
                .add(ModFruit.LEMON)
                .add(ModJams.LEMONJAM)
                .add(ModFruit.CHERRY)
                .add(ModJams.CHERRYJAM);
        getOrCreateTagBuilder(ModFoodTags.HOT)//辛
                .add(ModVegetable.CHILI)
                .add(ModVegetable.HOUTTUYNIACORDATA)
                .add(ModJams.CHILIJAM);
        getOrCreateTagBuilder(ModFoodTags.NUT)//坚果
                .add(ModFruit.TOON)
                .add(ModFruit.WALNUT);
        getOrCreateTagBuilder(ModFoodTags.SATIETY)//饱腹
                .add(Items.PUMPKIN_PIE)
                .add(Items.BAKED_POTATO)
                .add(Items.BREAD);
        getOrCreateTagBuilder(ModFoodTags.FRUIT)//果味
                .add(Items.GLOW_BERRIES)
                .add(Items.SWEET_BERRIES)
                .add(Items.MELON_SLICE)
                .add(Items.APPLE)
                .add(ModFruit.PEAR)
                .add(ModFruit.BANANA)
                .add(ModFruit.BLUEBERRY)
                .add(ModFruit.STRAWBERRY)
                .add(ModFruit.PEACH)
                .add(ModFruit.CARAMBOLA)
                .add(ModFruit.CHERRY)
                .add(ModFruit.COCONUT)
                .add(ModFruit.GRAPE)
                .add(ModFruit.LEMON);
        getOrCreateTagBuilder(ModFoodTags.MEAT)//肉
                .add(Items.RABBIT_STEW)
                .add(Items.COOKED_BEEF)
                .add(Items.COOKED_CHICKEN)
                .add(Items.COOKED_MUTTON)
                .add(Items.COOKED_PORKCHOP)
                .add(Items.COOKED_RABBIT);
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

    }

}
