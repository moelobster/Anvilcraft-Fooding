package dev.anvilcraft.fooding.init.others;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.blocks.ModWood;
import dev.anvilcraft.fooding.init.items.*;
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

public class ModItemGroup {
    private static final Map<String, CreativeModeTab.Builder> ITEM_GROUP_MAP = new HashMap<>();
    public static final CreativeModeTab.Builder ANVILCOOK_VEGETABLE = createItemGroup("vegetable", FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModVegetable.CHINESECABBAGE))
            .displayItems((ctx,entries)->{
                entries.accept(ModVegetable.TOONLEAF.getDefaultInstance());
                entries.accept(ModVegetable.HOUTTUYNIACORDATA.getDefaultInstance());
                entries.accept(ModVegetable.CORIANDER.getDefaultInstance());
                entries.accept(ModVegetable.CELERY.getDefaultInstance());
                entries.accept(ModVegetable.SPINACH.getDefaultInstance());
                entries.accept(ModVegetable.CABBAGE.getDefaultInstance());
                entries.accept(ModVegetable.CHINESECABBAGE.getDefaultInstance());
                entries.accept(ModVegetable.EGGPLANT.getDefaultInstance());
                entries.accept(ModVegetable.CHILI.getDefaultInstance());
                entries.accept(ModVegetable.TOMATO.getDefaultInstance());
                entries.accept(ModVegetable.GENSING.getDefaultInstance());
                entries.accept(ModVegetable.AMERICANGENSING.getDefaultInstance());
                entries.accept(ModVegetable.GOURD.getDefaultInstance());
                entries.accept(ModVegetable.SOYBEANS.getDefaultInstance());
                entries.accept(ModVegetable.FRENCHBEAN.getDefaultInstance());
                entries.accept(ModVegetable.COWPEA.getDefaultInstance());
                entries.accept(ModVegetable.PEA.getDefaultInstance());
                entries.accept(ModVegetable.PEANUT.getDefaultInstance());
                entries.accept(ModMushroom.GREENMUSHROOM.getDefaultInstance());
                entries.accept(ModMushroom.BLUEMUSHROOM.getDefaultInstance());
                entries.accept(ModMushroom.TREMELLA.getDefaultInstance());
                entries.accept(ModMushroom.BLACKFUNGUS.getDefaultInstance());
                entries.accept(ModMushroom.MUSHROOM.getDefaultInstance());
                entries.accept(ModMushroom.FLAMMULINAENOKI.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCOOK_FRUIT = createItemGroup("fruit",FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModFruit.PEAR))
            .displayItems((ctx,entries)->{
                entries.accept(ModFruit.PEAR.getDefaultInstance());
                entries.accept(ModFruit.LEMON.getDefaultInstance());
                entries.accept(ModFruit.GRAPE.getDefaultInstance());
                entries.accept(ModFruit.BANANA.getDefaultInstance());
                entries.accept(ModFruit.WALNUT.getDefaultInstance());
                entries.accept(ModFruit.CHERRY.getDefaultInstance());
                entries.accept(ModFruit.PEACH.getDefaultInstance());
                entries.accept(ModFruit.COCONUT.getDefaultInstance());
                entries.accept(ModFruit.CARAMBOLA.getDefaultInstance());
                entries.accept(ModFruit.STRAWBERRY.getDefaultInstance());
                entries.accept(ModFruit.BLUEBERRY.getDefaultInstance());
                entries.accept(ModFruit.TOON.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCOOK_JAMS = createItemGroup("jams",FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModJams.CHILIJAM))
            .displayItems((ctx,entries)->{
                entries.accept(ModJams.GLOWBERRIESJAM.getDefaultInstance());
                entries.accept(ModJams.SWEETBERRIESJAM.getDefaultInstance());
                entries.accept(ModJams.APPLEJAM.getDefaultInstance());
                entries.accept(ModJams.PEARJAM.getDefaultInstance());
                entries.accept(ModJams.LEMONJAM.getDefaultInstance());
                entries.accept(ModJams.GRAPEJAM.getDefaultInstance());
                entries.accept(ModJams.CHERRYJAM.getDefaultInstance());
                entries.accept(ModJams.PEACHJAM.getDefaultInstance());
                entries.accept(ModJams.CARAMBOLAJAM.getDefaultInstance());
                entries.accept(ModJams.STRAWBERRYJAM.getDefaultInstance());
                entries.accept(ModJams.BLUEBERRYJAM.getDefaultInstance());
                entries.accept(ModJams.CHILIJAM.getDefaultInstance());
                entries.accept(ModJams.TOMATOJAM.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCOOK_CEREALS = createItemGroup("cereals",FabricItemGroup::builder)
            .icon(()-> new ItemStack(ModCereals.RICE))
            .displayItems((ctx,entries)->{
                entries.accept(ModCereals.RICE.getDefaultInstance());
                entries.accept(ModCereals.TARO.getDefaultInstance());
                entries.accept(ModCereals.SWEETPOTATO.getDefaultInstance());
                entries.accept(ModCereals.CORN.getDefaultInstance());
                entries.accept(ModCereals.MILLET.getDefaultInstance());
                entries.accept(ModCereals.SORGHUM.getDefaultInstance());
            });
    public static final CreativeModeTab.Builder ANVILCOOK_BLOCKS = createItemGroup("blocks",FabricItemGroup::builder)
            .icon(()->new ItemStack(ModWood.PEARLOG))
            .displayItems((ctx,entries)->{
                entries.accept(ModItems.APPLELOG.getDefaultInstance());
                entries.accept(ModItems.APPLEWOOD.getDefaultInstance());
                entries.accept(ModItems.APPLEPLANKS.getDefaultInstance());
                entries.accept(ModItems.APPLESTAIRS.getDefaultInstance());
                entries.accept(ModItems.APPLESLAB.getDefaultInstance());
                entries.accept(ModItems.APPLEBUTTON.getDefaultInstance());
                entries.accept(ModItems.APPLEPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.APPLEFENCE.getDefaultInstance());
                entries.accept(ModItems.APPLEFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.APPLEDOOR.getDefaultInstance());
                entries.accept(ModItems.APPLETRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.PEARLOG.getDefaultInstance());
                entries.accept(ModItems.PEARWOOD.getDefaultInstance());
                entries.accept(ModItems.PEARPLANKS.getDefaultInstance());
                entries.accept(ModItems.PEARSTAIRS.getDefaultInstance());
                entries.accept(ModItems.PEARSLAB.getDefaultInstance());
                entries.accept(ModItems.PEARBUTTON.getDefaultInstance());
                entries.accept(ModItems.PEARPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.PEARFENCE.getDefaultInstance());
                entries.accept(ModItems.PEARFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.PEARDOOR.getDefaultInstance());
                entries.accept(ModItems.PEARTRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.LEMONLOG.getDefaultInstance());
                entries.accept(ModItems.LEMONWOOD.getDefaultInstance());
                entries.accept(ModItems.LEMONPLANKS.getDefaultInstance());
                entries.accept(ModItems.LEMONSTAIRS.getDefaultInstance());
                entries.accept(ModItems.LEMONSLAB.getDefaultInstance());
                entries.accept(ModItems.LEMONBUTTON.getDefaultInstance());
                entries.accept(ModItems.LEMONPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.LEMONFENCE.getDefaultInstance());
                entries.accept(ModItems.LEMONFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.LEMONDOOR.getDefaultInstance());
                entries.accept(ModItems.LEMONTRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.WALNUTLOG.getDefaultInstance());
                entries.accept(ModItems.WALNUTWOOD.getDefaultInstance());
                entries.accept(ModItems.WALNUTPLANKS.getDefaultInstance());
                entries.accept(ModItems.WALNUTSTAIRS.getDefaultInstance());
                entries.accept(ModItems.WALNUTSLAB.getDefaultInstance());
                entries.accept(ModItems.WALNUTBUTTON.getDefaultInstance());
                entries.accept(ModItems.WALNUTPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.WALNUTFENCE.getDefaultInstance());
                entries.accept(ModItems.WALNUTFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.WALNUTDOOR.getDefaultInstance());
                entries.accept(ModItems.WALNUTTRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.BANANALOG.getDefaultInstance());
                entries.accept(ModItems.BANANAWOOD.getDefaultInstance());
                entries.accept(ModItems.BANANAPLANKS.getDefaultInstance());
                entries.accept(ModItems.BANANASTAIRS.getDefaultInstance());
                entries.accept(ModItems.BANANASLAB.getDefaultInstance());
                entries.accept(ModItems.BANANABUTTON.getDefaultInstance());
                entries.accept(ModItems.BANANAPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.BANANAFENCE.getDefaultInstance());
                entries.accept(ModItems.BANANAFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.BANANADOOR.getDefaultInstance());
                entries.accept(ModItems.BANANATRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.PEACHLOG.getDefaultInstance());
                entries.accept(ModItems.PEACHWOOD.getDefaultInstance());
                entries.accept(ModItems.PEACHPLANKS.getDefaultInstance());
                entries.accept(ModItems.PEACHSTAIRS.getDefaultInstance());
                entries.accept(ModItems.PEACHSLAB.getDefaultInstance());
                entries.accept(ModItems.PEACHBUTTON.getDefaultInstance());
                entries.accept(ModItems.PEACHPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.PEACHFENCE.getDefaultInstance());
                entries.accept(ModItems.PEACHFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.PEACHDOOR.getDefaultInstance());
                entries.accept(ModItems.PEACHTRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.COCONUTLOG.getDefaultInstance());
                entries.accept(ModItems.COCONUTWOOD.getDefaultInstance());
                entries.accept(ModItems.COCONUTPLANKS.getDefaultInstance());
                entries.accept(ModItems.COCONUTSTAIRS.getDefaultInstance());
                entries.accept(ModItems.COCONUTSLAB.getDefaultInstance());
                entries.accept(ModItems.COCONUTBUTTON.getDefaultInstance());
                entries.accept(ModItems.COCONUTPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.COCONUTFENCE.getDefaultInstance());
                entries.accept(ModItems.COCONUTFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.COCONUTDOOR.getDefaultInstance());
                entries.accept(ModItems.COCONUTTRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.CARAMBOLALOG.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLAWOOD.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLAPLANKS.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLASTAIRS.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLASLAB.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLABUTTON.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLAPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLAFENCE.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLAFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLADOOR.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLATRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.TOONLOG.getDefaultInstance());
                entries.accept(ModItems.TOONWOOD.getDefaultInstance());
                entries.accept(ModItems.TOONPLANKS.getDefaultInstance());
                entries.accept(ModItems.TOONSTAIRS.getDefaultInstance());
                entries.accept(ModItems.TOONSLAB.getDefaultInstance());
                entries.accept(ModItems.TOONBUTTON.getDefaultInstance());
                entries.accept(ModItems.TOONPRESSUERPLATE.getDefaultInstance());
                entries.accept(ModItems.TOONFENCE.getDefaultInstance());
                entries.accept(ModItems.TOONFENCEGATE.getDefaultInstance());
                entries.accept(ModItems.TOONDOOR.getDefaultInstance());
                entries.accept(ModItems.TOONTRAPDOOR.getDefaultInstance());

                entries.accept(ModItems.APPLELEAVES.getDefaultInstance());
                entries.accept(ModItems.PEARLEAVES.getDefaultInstance());
                entries.accept(ModItems.LEMONLEAVES.getDefaultInstance());
                entries.accept(ModItems.WALNUTLEAVES.getDefaultInstance());
                entries.accept(ModItems.BANANALEAVES.getDefaultInstance());
                entries.accept(ModItems.PEACHLEAVES.getDefaultInstance());
                entries.accept(ModItems.COCONUTLEAVES.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLALEAVES.getDefaultInstance());
                entries.accept(ModItems.TOONLEAVES.getDefaultInstance());

                entries.accept(ModItems.APPLESAPLING.getDefaultInstance());
                entries.accept(ModItems.PEARSAPLING.getDefaultInstance());
                entries.accept(ModItems.LEMONSAPLING.getDefaultInstance());
                entries.accept(ModItems.WALNUTSAPLING.getDefaultInstance());
                entries.accept(ModItems.BANANASAPLING.getDefaultInstance());
                entries.accept(ModItems.PEACHSAPLING.getDefaultInstance());
                entries.accept(ModItems.COCONUTSAPLING.getDefaultInstance());
                entries.accept(ModItems.CARAMBOLASAPLING.getDefaultInstance());
                entries.accept(ModItems.TOONSAPLING.getDefaultInstance());
            });




    private static CreativeModeTab.@NotNull Builder createItemGroup(String id, @NotNull Supplier<CreativeModeTab.Builder> itemGroupBuilder) {
        CreativeModeTab.Builder builder = itemGroupBuilder.get();
        builder.title(Component.translatable("itemGroup.anvilcraft_fooding." + id));
        ITEM_GROUP_MAP.put(id, builder);
        return builder;
    }

    public static void register() {
        for (Map.Entry<String, CreativeModeTab.Builder> entry : ModItemGroup.ITEM_GROUP_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue().build());
        }
    }
}
