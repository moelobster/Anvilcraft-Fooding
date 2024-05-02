package dev.anvilcraft.fooding.init.others;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.blocks.ModTrees;
import dev.anvilcraft.fooding.init.blocks.ModWood;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ModItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item APPLELOG = registerBlock(ModWood.APPLELOG, BlockItem::new,defaultProperties());
    public static final Item APPLEWOOD = registerBlock(ModWood.APPLEWOOD, BlockItem::new,defaultProperties());
    public static final Item APPLELEAVES = registerBlock(ModWood.APPLELEAVES,BlockItem::new,defaultProperties());
    public static final Item APPLESAPLING = registerBlock(ModTrees.APPLESAPLING,BlockItem::new,defaultProperties());
    public static final Item APPLEPLANKS = registerBlock(ModWood.APPLEPLANKS,BlockItem::new,defaultProperties());
    public static final Item APPLESTAIRS = registerBlock(ModWood.APPLESTAIRS,BlockItem::new,defaultProperties());
    public static final Item APPLESLAB = registerBlock(ModWood.APPLESLAB,BlockItem::new,defaultProperties());
    public static final Item APPLEBUTTON = registerBlock(ModWood.APPLEBUTTON,BlockItem::new,defaultProperties());
    public static final Item APPLEPRESSUERPLATE = registerBlock(ModWood.APPLEPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item APPLEFENCE = registerBlock(ModWood.APPLEFENCE,BlockItem::new,defaultProperties());
    public static final Item APPLEFENCEGATE = registerBlock(ModWood.APPLEFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item APPLEDOOR = registerBlock(ModWood.APPLEDOOR,BlockItem::new,defaultProperties());
    public static final Item APPLETRAPDOOR = registerBlock(ModWood.APPLETRAPDOOR,BlockItem::new,defaultProperties());



    public static final Item PEARLOG = registerBlock(ModWood.PEARLOG, BlockItem::new,defaultProperties());
    public static final Item PEARWOOD = registerBlock(ModWood.PEARWOOD, BlockItem::new,defaultProperties());
    public static final Item PEARLEAVES = registerBlock(ModWood.PEARLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEARSAPLING = registerBlock(ModTrees.PEARSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEARPLANKS = registerBlock(ModWood.PEARPLANKS,BlockItem::new,defaultProperties());
    public static final Item PEARSTAIRS = registerBlock(ModWood.PEARSTAIRS,BlockItem::new,defaultProperties());
    public static final Item PEARSLAB = registerBlock(ModWood.PEARSLAB,BlockItem::new,defaultProperties());
    public static final Item PEARBUTTON = registerBlock(ModWood.PEARBUTTON,BlockItem::new,defaultProperties());
    public static final Item PEARPRESSUERPLATE = registerBlock(ModWood.PEARPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item PEARFENCE = registerBlock(ModWood.PEARFENCE,BlockItem::new,defaultProperties());
    public static final Item PEARFENCEGATE = registerBlock(ModWood.PEARFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item PEARDOOR = registerBlock(ModWood.PEARDOOR,BlockItem::new,defaultProperties());
    public static final Item PEARTRAPDOOR = registerBlock(ModWood.PEARTRAPDOOR,BlockItem::new,defaultProperties());

    public static final Item LEMONLOG = registerBlock(ModWood.LEMONLOG,BlockItem::new,defaultProperties());
    public static final Item LEMONWOOD = registerBlock(ModWood.LEMONWOOD,BlockItem::new,defaultProperties());
    public static final Item LEMONLEAVES = registerBlock(ModWood.LEMONLEAVES,BlockItem::new,defaultProperties());
    public static final Item LEMONSAPLING = registerBlock(ModTrees.LEMONSAPLING,BlockItem::new,defaultProperties());
    public static final Item LEMONPLANKS = registerBlock(ModWood.LEMONPLANKS,BlockItem::new,defaultProperties());
    public static final Item LEMONSTAIRS = registerBlock(ModWood.LEMONSTAIRS,BlockItem::new,defaultProperties());
    public static final Item LEMONSLAB = registerBlock(ModWood.LEMONSLAB,BlockItem::new,defaultProperties());
    public static final Item LEMONBUTTON = registerBlock(ModWood.LEMONBUTTON,BlockItem::new,defaultProperties());
    public static final Item LEMONPRESSUERPLATE = registerBlock(ModWood.LEMONPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item LEMONFENCE = registerBlock(ModWood.LEMONFENCE,BlockItem::new,defaultProperties());
    public static final Item LEMONFENCEGATE = registerBlock(ModWood.LEMONFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item LEMONDOOR = registerBlock(ModWood.LEMONDOOR,BlockItem::new,defaultProperties());
    public static final Item LEMONTRAPDOOR = registerBlock(ModWood.LEMONTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item WALNUTLOG = registerBlock(ModWood.WALNUTLOG,BlockItem::new,defaultProperties());
    public static final Item WALNUTWOOD = registerBlock(ModWood.WALNUTWOOD,BlockItem::new,defaultProperties());
    public static final Item WALNUTLEAVES = registerBlock(ModWood.WALNUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item WALNUTSAPLING = registerBlock(ModTrees.WALNUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item WALNUTPLANKS = registerBlock(ModWood.WALNUTPLANKS,BlockItem::new,defaultProperties());
    public static final Item WALNUTSTAIRS = registerBlock(ModWood.WALNUTSTAIRS,BlockItem::new,defaultProperties());
    public static final Item WALNUTSLAB = registerBlock(ModWood.WALNUTSLAB,BlockItem::new,defaultProperties());
    public static final Item WALNUTBUTTON = registerBlock(ModWood.WALNUTBUTTON,BlockItem::new,defaultProperties());
    public static final Item WALNUTPRESSUERPLATE = registerBlock(ModWood.WALNUTPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item WALNUTFENCE = registerBlock(ModWood.WALNUTFENCE,BlockItem::new,defaultProperties());
    public static final Item WALNUTFENCEGATE = registerBlock(ModWood.WALNUTFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item WALNUTDOOR = registerBlock(ModWood.WALNUTDOOR,BlockItem::new,defaultProperties());
    public static final Item WALNUTTRAPDOOR = registerBlock(ModWood.WALNUTTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item BANANALOG = registerBlock(ModWood.BANANALOG,BlockItem::new,defaultProperties());
    public static final Item BANANAWOOD = registerBlock(ModWood.BANANAWOOD,BlockItem::new,defaultProperties());
    public static final Item BANANALEAVES = registerBlock(ModWood.BANANALEAVES,BlockItem::new,defaultProperties());
    public static final Item BANANASAPLING = registerBlock(ModTrees.BANANASAPLING,BlockItem::new,defaultProperties());
    public static final Item BANANAPLANKS = registerBlock(ModWood.BANANAPLANKS,BlockItem::new,defaultProperties());
    public static final Item BANANASTAIRS = registerBlock(ModWood.BANANASTAIRS,BlockItem::new,defaultProperties());
    public static final Item BANANASLAB = registerBlock(ModWood.BANANASLAB,BlockItem::new,defaultProperties());
    public static final Item BANANABUTTON = registerBlock(ModWood.BANANABUTTON,BlockItem::new,defaultProperties());
    public static final Item BANANAPRESSUERPLATE = registerBlock(ModWood.BANANAPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item BANANAFENCE = registerBlock(ModWood.BANANAFENCE,BlockItem::new,defaultProperties());
    public static final Item BANANAFENCEGATE = registerBlock(ModWood.BANANAFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item BANANADOOR = registerBlock(ModWood.BANANADOOR,BlockItem::new,defaultProperties());
    public static final Item BANANATRAPDOOR = registerBlock(ModWood.BANANATRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item PEACHLOG = registerBlock(ModWood.PEACHLOG,BlockItem::new,defaultProperties());
    public static final Item PEACHWOOD = registerBlock(ModWood.PEACHWOOD,BlockItem::new,defaultProperties());
    public static final Item PEACHLEAVES = registerBlock(ModWood.PEACHLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEACHSAPLING = registerBlock(ModTrees.PEACHSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEACHPLANKS = registerBlock(ModWood.PEACHPLANKS,BlockItem::new,defaultProperties());
    public static final Item PEACHSTAIRS = registerBlock(ModWood.PEACHSTAIRS,BlockItem::new,defaultProperties());
    public static final Item PEACHSLAB = registerBlock(ModWood.PEACHSLAB,BlockItem::new,defaultProperties());
    public static final Item PEACHBUTTON = registerBlock(ModWood.PEACHBUTTON,BlockItem::new,defaultProperties());
    public static final Item PEACHPRESSUERPLATE = registerBlock(ModWood.PEACHPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item PEACHFENCE = registerBlock(ModWood.PEACHFENCE,BlockItem::new,defaultProperties());
    public static final Item PEACHFENCEGATE = registerBlock(ModWood.PEACHFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item PEACHDOOR = registerBlock(ModWood.PEACHDOOR,BlockItem::new,defaultProperties());
    public static final Item PEACHTRAPDOOR = registerBlock(ModWood.PEACHTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item COCONUTLOG = registerBlock(ModWood.COCONUTLOG,BlockItem::new,defaultProperties());
    public static final Item COCONUTWOOD = registerBlock(ModWood.COCONUTWOOD,BlockItem::new,defaultProperties());
    public static final Item COCONUTLEAVES = registerBlock(ModWood.COCONUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item COCONUTSAPLING = registerBlock(ModTrees.COCONUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item COCONUTPLANKS = registerBlock(ModWood.COCONUTPLANKS,BlockItem::new,defaultProperties());
    public static final Item COCONUTSTAIRS = registerBlock(ModWood.COCONUTSTAIRS,BlockItem::new,defaultProperties());
    public static final Item COCONUTSLAB = registerBlock(ModWood.COCONUTSLAB,BlockItem::new,defaultProperties());
    public static final Item COCONUTBUTTON = registerBlock(ModWood.COCONUTBUTTON,BlockItem::new,defaultProperties());
    public static final Item COCONUTPRESSUERPLATE = registerBlock(ModWood.COCONUTPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item COCONUTFENCE = registerBlock(ModWood.COCONUTFENCE,BlockItem::new,defaultProperties());
    public static final Item COCONUTFENCEGATE = registerBlock(ModWood.COCONUTFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item COCONUTDOOR = registerBlock(ModWood.COCONUTDOOR,BlockItem::new,defaultProperties());
    public static final Item COCONUTTRAPDOOR = registerBlock(ModWood.COCONUTTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item CARAMBOLALOG = registerBlock(ModWood.CARAMBOLALOG,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAWOOD = registerBlock(ModWood.CARAMBOLAWOOD,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLALEAVES = registerBlock(ModWood.CARAMBOLALEAVES,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASAPLING = registerBlock(ModTrees.CARAMBOLASAPLING,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPLANKS = registerBlock(ModWood.CARAMBOLAPLANKS,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASTAIRS = registerBlock(ModWood.CARAMBOLASTAIRS,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASLAB = registerBlock(ModWood.CARAMBOLASLAB,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLABUTTON = registerBlock(ModWood.CARAMBOLABUTTON,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPRESSUERPLATE = registerBlock(ModWood.CARAMBOLAPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAFENCE = registerBlock(ModWood.CARAMBOLAFENCE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAFENCEGATE = registerBlock(ModWood.CARAMBOLAFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLADOOR = registerBlock(ModWood.CARAMBOLADOOR,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLATRAPDOOR = registerBlock(ModWood.CARAMBOLATRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item TOONLOG = registerBlock(ModWood.TOONLOG,BlockItem::new,defaultProperties());
    public static final Item TOONWOOD = registerBlock(ModWood.TOONWOOD,BlockItem::new,defaultProperties());
    public static final Item TOONLEAVES = registerBlock(ModWood.TOONLEAVES,BlockItem::new,defaultProperties());
    public static final Item TOONASAPLING = registerBlock(ModTrees.TOONSAPLING,BlockItem::new,defaultProperties());
    public static final Item TOONPLANKS = registerBlock(ModWood.TOONPLANKS,BlockItem::new,defaultProperties());
    public static final Item TOONSTAIRS = registerBlock(ModWood.TOONSTAIRS,BlockItem::new,defaultProperties());
    public static final Item TOONSLAB = registerBlock(ModWood.TOONSLAB,BlockItem::new,defaultProperties());
    public static final Item TOONBUTTON = registerBlock(ModWood.TOONBUTTON,BlockItem::new,defaultProperties());
    public static final Item TOONPRESSUERPLATE = registerBlock(ModWood.TOONPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item TOONFENCE = registerBlock(ModWood.TOONFENCE,BlockItem::new,defaultProperties());
    public static final Item TOONFENCEGATE = registerBlock(ModWood.TOONFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item TOONDOOR = registerBlock(ModWood.TOONDOOR,BlockItem::new,defaultProperties());
    public static final Item TOONTRAPDOOR = registerBlock(ModWood.TOONTRAPDOOR,BlockItem::new,defaultProperties());






    private static Item registerBlock(Block block, @NotNull BiFunction<Block, Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(block, properties);
        ITEM_MAP.put(BuiltInRegistries.BLOCK.getKey(block).getPath(), item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
