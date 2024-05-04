package dev.anvilcraft.fooding.init.others;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.block.ModWoodBlocks;
import dev.anvilcraft.fooding.init.food.*;
import dev.anvilcraft.fooding.init.food.dish.HomeCookedDish;
import dev.anvilcraft.fooding.init.food.dish.raw.HomeCookedDishRaw;
import dev.anvilcraft.fooding.init.item.ModSeeds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModItemGroups {
    private static final Map<String, CreativeModeTab.Builder> ITEM_GROUP_MAP = new HashMap<>();
    public static final CreativeModeTab.Builder ANVILCRAFT_FOODING_VEGETABLE = createItemGroup("vegetable", FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModVegetableItems.CHINESECABBAGE))
            .displayItems((ctx,entries)->{
                entries.accept(ModVegetableItems.TOONLEAF.getDefaultInstance());
                entries.accept(ModVegetableItems.HOUTTUYNIACORDATA.getDefaultInstance());
                entries.accept(ModSeeds.HOUTTUYNIACORDATASEED.getDefaultInstance());
                entries.accept(ModVegetableItems.CORIANDER.getDefaultInstance());
                entries.accept(ModSeeds.CORIANDERSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.CELERY.getDefaultInstance());
                entries.accept(ModSeeds.CELERYSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.SPINACH.getDefaultInstance());
                entries.accept(ModSeeds.SPINACHSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.CABBAGE.getDefaultInstance());
                entries.accept(ModSeeds.CABBAGESEED.getDefaultInstance());
                entries.accept(ModVegetableItems.CHINESECABBAGE.getDefaultInstance());
                entries.accept(ModSeeds.CHINESECABBAGESEED.getDefaultInstance());
                entries.accept(ModVegetableItems.EGGPLANT.getDefaultInstance());
                entries.accept(ModSeeds.EGGPLANTSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.CHILI.getDefaultInstance());
                entries.accept(ModSeeds.CHILISEED.getDefaultInstance());
                entries.accept(ModVegetableItems.TOMATO.getDefaultInstance());
                entries.accept(ModSeeds.TOMATOSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.GENSING.getDefaultInstance());
                entries.accept(ModSeeds.GENSINGSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.AMERICANGENSING.getDefaultInstance());
                entries.accept(ModSeeds.AMERICANGENSINGSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.GOURD.getDefaultInstance());
                entries.accept(ModSeeds.GOURDSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.SOYBEANS.getDefaultInstance());
                entries.accept(ModSeeds.SOYBEANSSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.FRENCHBEANS.getDefaultInstance());
                entries.accept(ModSeeds.FRENCHBEANSEED.getDefaultInstance());
                entries.accept(ModVegetableItems.COWPEA.getDefaultInstance());
                entries.accept(ModSeeds.COWPEASEED.getDefaultInstance());
                entries.accept(ModVegetableItems.PEA.getDefaultInstance());
                entries.accept(ModSeeds.PEASEED.getDefaultInstance());
                entries.accept(ModVegetableItems.PEANUT.getDefaultInstance());
                entries.accept(ModSeeds.PEANUTSEED.getDefaultInstance());
                entries.accept(ModMushroomItems.GREENMUSHROOM.getDefaultInstance());
                entries.accept(ModMushroomItems.BLUEMUSHROOM.getDefaultInstance());
                entries.accept(ModMushroomItems.TREMELLA.getDefaultInstance());
                entries.accept(ModMushroomItems.BLACKFUNGUS.getDefaultInstance());
                entries.accept(ModMushroomItems.MUSHROOM.getDefaultInstance());
                entries.accept(ModMushroomItems.FLAMMULINAENOKI.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCRAFT_FOODING_FRUIT = createItemGroup("fruit",FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModFruitItems.PEAR))
            .displayItems((ctx,entries)->{
                entries.accept(ModFruitItems.PEAR.getDefaultInstance());
                entries.accept(ModFruitItems.LEMON.getDefaultInstance());
                entries.accept(ModFruitItems.GRAPE.getDefaultInstance());
                entries.accept(ModFruitItems.BANANA.getDefaultInstance());
                entries.accept(ModFruitItems.WALNUT.getDefaultInstance());
                entries.accept(ModFruitItems.CHERRY.getDefaultInstance());
                entries.accept(ModFruitItems.PEACH.getDefaultInstance());
                entries.accept(ModFruitItems.COCONUT.getDefaultInstance());
                entries.accept(ModFruitItems.CARAMBOLA.getDefaultInstance());
                entries.accept(ModFruitItems.STRAWBERRY.getDefaultInstance());
                entries.accept(ModFruitItems.BLUEBERRY.getDefaultInstance());
                entries.accept(ModFruitItems.TOON.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCRAFT_FOODING_JAMS = createItemGroup("jams",FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModJamsItems.CHILIJAM))
            .displayItems((ctx,entries)->{
                entries.accept(ModJamsItems.GLOWBERRIESJAM.getDefaultInstance());
                entries.accept(ModJamsItems.SWEETBERRIESJAM.getDefaultInstance());
                entries.accept(ModJamsItems.APPLEJAM.getDefaultInstance());
                entries.accept(ModJamsItems.PEARJAM.getDefaultInstance());
                entries.accept(ModJamsItems.LEMONJAM.getDefaultInstance());
                entries.accept(ModJamsItems.GRAPEJAM.getDefaultInstance());
                entries.accept(ModJamsItems.CHERRYJAM.getDefaultInstance());
                entries.accept(ModJamsItems.PEACHJAM.getDefaultInstance());
                entries.accept(ModJamsItems.CARAMBOLAJAM.getDefaultInstance());
                entries.accept(ModJamsItems.STRAWBERRYJAM.getDefaultInstance());
                entries.accept(ModJamsItems.BLUEBERRYJAM.getDefaultInstance());
                entries.accept(ModJamsItems.CHILIJAM.getDefaultInstance());
                entries.accept(ModJamsItems.TOMATOJAM.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCRAFT_FOODING_CEREALS = createItemGroup("cereals",FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModCerealsItems.RICE))
            .displayItems((ctx,entries)->{
                entries.accept(ModCerealsItems.RICE.getDefaultInstance());
                entries.accept(ModCerealsItems.TARO.getDefaultInstance());
                entries.accept(ModCerealsItems.SWEETPOTATO.getDefaultInstance());
                entries.accept(ModCerealsItems.CORN.getDefaultInstance());
                entries.accept(ModCerealsItems.MILLET.getDefaultInstance());
                entries.accept(ModCerealsItems.SORGHUM.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCRAFT_FOODING_BLOCKS = createItemGroup("blocks",FabricItemGroup::builder)
            .icon(()->new ItemStack(ModWoodBlocks.PEARLOG))
            .displayItems((ctx,entries)->{
                entries.accept(ModBlockItems.APPLELOG.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.APPLESTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.APPLESLAB.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.APPLEDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.APPLETRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.PEARLOG.getDefaultInstance());
                entries.accept(ModBlockItems.PEARWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.PEARPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.PEARSTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.PEARSLAB.getDefaultInstance());
                entries.accept(ModBlockItems.PEARBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.PEARPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.PEARFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.PEARFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.PEARDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.PEARTRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.LEMONLOG.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONSTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONSLAB.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONTRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.WALNUTLOG.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTSTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTSLAB.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTTRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.BANANALOG.getDefaultInstance());
                entries.accept(ModBlockItems.BANANAWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.BANANAPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.BANANASTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.BANANASLAB.getDefaultInstance());
                entries.accept(ModBlockItems.BANANABUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.BANANAPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.BANANAFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.BANANAFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.BANANADOOR.getDefaultInstance());
                entries.accept(ModBlockItems.BANANATRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.PEACHLOG.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHSTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHSLAB.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHTRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.COCONUTLOG.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTSTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTSLAB.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTTRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.CARAMBOLALOG.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLAWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLAPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLASTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLASLAB.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLABUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLAPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLAFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLAFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLADOOR.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLATRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.TOONLOG.getDefaultInstance());
                entries.accept(ModBlockItems.TOONWOOD.getDefaultInstance());
                entries.accept(ModBlockItems.TOONPLANKS.getDefaultInstance());
                entries.accept(ModBlockItems.TOONSTAIRS.getDefaultInstance());
                entries.accept(ModBlockItems.TOONSLAB.getDefaultInstance());
                entries.accept(ModBlockItems.TOONBUTTON.getDefaultInstance());
                entries.accept(ModBlockItems.TOONPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModBlockItems.TOONFENCE.getDefaultInstance());
                entries.accept(ModBlockItems.TOONFENCEGATE.getDefaultInstance());
                entries.accept(ModBlockItems.TOONDOOR.getDefaultInstance());
                entries.accept(ModBlockItems.TOONTRAPDOOR.getDefaultInstance());

                entries.accept(ModBlockItems.APPLELEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.PEARLEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONLEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTLEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.BANANALEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHLEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTLEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLALEAVES.getDefaultInstance());
                entries.accept(ModBlockItems.TOONLEAVES.getDefaultInstance());

                entries.accept(ModBlockItems.APPLESAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.PEARSAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.LEMONSAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.WALNUTSAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.BANANASAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.PEACHSAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.COCONUTSAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.CARAMBOLASAPLING.getDefaultInstance());
                entries.accept(ModBlockItems.TOONSAPLING.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCRAFT_FOODING_HOMECOOKEDDISH = createItemGroup("home_cooked_dish",FabricItemGroup::builder)
        .icon(()->new ItemStack(HomeCookedDish.DUMPLING))
        .displayItems((ctx,entries)->{
            entries.accept(HomeCookedDish.DUMPLING.getDefaultInstance());
            entries.accept(HomeCookedDishRaw.DUMPLINGRAW.getDefaultInstance());
        });



    private static CreativeModeTab.@NotNull Builder createItemGroup(String id, @NotNull Supplier<CreativeModeTab.Builder> itemGroupBuilder) {
        CreativeModeTab.Builder builder = itemGroupBuilder.get();
        builder.title(Component.translatable("itemGroup.anvilcraft_fooding." + id));
        ITEM_GROUP_MAP.put(id, builder);
        return builder;
    }

    public static void register() {
        for (Map.Entry<String, CreativeModeTab.Builder> entry : ModItemGroups.ITEM_GROUP_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue().build());
        }
    }
}
