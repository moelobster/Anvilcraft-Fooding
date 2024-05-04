package dev.anvilcraft.fooding.init.others;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.block.ModTreesBlocks;
import dev.anvilcraft.fooding.init.block.ModWoodBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ModBlockItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item APPLELOG = registerBlock(ModWoodBlocks.APPLELOG, BlockItem::new,defaultProperties());
    public static final Item APPLEWOOD = registerBlock(ModWoodBlocks.APPLEWOOD, BlockItem::new,defaultProperties());
    public static final Item APPLELEAVES = registerBlock(ModWoodBlocks.APPLELEAVES,BlockItem::new,defaultProperties());
    public static final Item APPLESAPLING = registerBlock(ModTreesBlocks.APPLESAPLING,BlockItem::new,defaultProperties());
    public static final Item APPLEPLANKS = registerBlock(ModWoodBlocks.APPLEPLANKS,BlockItem::new,defaultProperties());
    public static final Item APPLESTAIRS = registerBlock(ModWoodBlocks.APPLESTAIRS,BlockItem::new,defaultProperties());
    public static final Item APPLESLAB = registerBlock(ModWoodBlocks.APPLESLAB,BlockItem::new,defaultProperties());
    public static final Item APPLEBUTTON = registerBlock(ModWoodBlocks.APPLEBUTTON,BlockItem::new,defaultProperties());
    public static final Item APPLEPRESSUERPLATE = registerBlock(ModWoodBlocks.APPLEPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item APPLEFENCE = registerBlock(ModWoodBlocks.APPLEFENCE,BlockItem::new,defaultProperties());
    public static final Item APPLEFENCEGATE = registerBlock(ModWoodBlocks.APPLEFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item APPLEDOOR = registerBlock(ModWoodBlocks.APPLEDOOR,BlockItem::new,defaultProperties());
    public static final Item APPLETRAPDOOR = registerBlock(ModWoodBlocks.APPLETRAPDOOR,BlockItem::new,defaultProperties());



    public static final Item PEARLOG = registerBlock(ModWoodBlocks.PEARLOG, BlockItem::new,defaultProperties());
    public static final Item PEARWOOD = registerBlock(ModWoodBlocks.PEARWOOD, BlockItem::new,defaultProperties());
    public static final Item PEARLEAVES = registerBlock(ModWoodBlocks.PEARLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEARSAPLING = registerBlock(ModTreesBlocks.PEARSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEARPLANKS = registerBlock(ModWoodBlocks.PEARPLANKS,BlockItem::new,defaultProperties());
    public static final Item PEARSTAIRS = registerBlock(ModWoodBlocks.PEARSTAIRS,BlockItem::new,defaultProperties());
    public static final Item PEARSLAB = registerBlock(ModWoodBlocks.PEARSLAB,BlockItem::new,defaultProperties());
    public static final Item PEARBUTTON = registerBlock(ModWoodBlocks.PEARBUTTON,BlockItem::new,defaultProperties());
    public static final Item PEARPRESSUERPLATE = registerBlock(ModWoodBlocks.PEARPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item PEARFENCE = registerBlock(ModWoodBlocks.PEARFENCE,BlockItem::new,defaultProperties());
    public static final Item PEARFENCEGATE = registerBlock(ModWoodBlocks.PEARFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item PEARDOOR = registerBlock(ModWoodBlocks.PEARDOOR,BlockItem::new,defaultProperties());
    public static final Item PEARTRAPDOOR = registerBlock(ModWoodBlocks.PEARTRAPDOOR,BlockItem::new,defaultProperties());

    public static final Item LEMONLOG = registerBlock(ModWoodBlocks.LEMONLOG,BlockItem::new,defaultProperties());
    public static final Item LEMONWOOD = registerBlock(ModWoodBlocks.LEMONWOOD,BlockItem::new,defaultProperties());
    public static final Item LEMONLEAVES = registerBlock(ModWoodBlocks.LEMONLEAVES,BlockItem::new,defaultProperties());
    public static final Item LEMONSAPLING = registerBlock(ModTreesBlocks.LEMONSAPLING,BlockItem::new,defaultProperties());
    public static final Item LEMONPLANKS = registerBlock(ModWoodBlocks.LEMONPLANKS,BlockItem::new,defaultProperties());
    public static final Item LEMONSTAIRS = registerBlock(ModWoodBlocks.LEMONSTAIRS,BlockItem::new,defaultProperties());
    public static final Item LEMONSLAB = registerBlock(ModWoodBlocks.LEMONSLAB,BlockItem::new,defaultProperties());
    public static final Item LEMONBUTTON = registerBlock(ModWoodBlocks.LEMONBUTTON,BlockItem::new,defaultProperties());
    public static final Item LEMONPRESSUERPLATE = registerBlock(ModWoodBlocks.LEMONPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item LEMONFENCE = registerBlock(ModWoodBlocks.LEMONFENCE,BlockItem::new,defaultProperties());
    public static final Item LEMONFENCEGATE = registerBlock(ModWoodBlocks.LEMONFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item LEMONDOOR = registerBlock(ModWoodBlocks.LEMONDOOR,BlockItem::new,defaultProperties());
    public static final Item LEMONTRAPDOOR = registerBlock(ModWoodBlocks.LEMONTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item WALNUTLOG = registerBlock(ModWoodBlocks.WALNUTLOG,BlockItem::new,defaultProperties());
    public static final Item WALNUTWOOD = registerBlock(ModWoodBlocks.WALNUTWOOD,BlockItem::new,defaultProperties());
    public static final Item WALNUTLEAVES = registerBlock(ModWoodBlocks.WALNUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item WALNUTSAPLING = registerBlock(ModTreesBlocks.WALNUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item WALNUTPLANKS = registerBlock(ModWoodBlocks.WALNUTPLANKS,BlockItem::new,defaultProperties());
    public static final Item WALNUTSTAIRS = registerBlock(ModWoodBlocks.WALNUTSTAIRS,BlockItem::new,defaultProperties());
    public static final Item WALNUTSLAB = registerBlock(ModWoodBlocks.WALNUTSLAB,BlockItem::new,defaultProperties());
    public static final Item WALNUTBUTTON = registerBlock(ModWoodBlocks.WALNUTBUTTON,BlockItem::new,defaultProperties());
    public static final Item WALNUTPRESSUERPLATE = registerBlock(ModWoodBlocks.WALNUTPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item WALNUTFENCE = registerBlock(ModWoodBlocks.WALNUTFENCE,BlockItem::new,defaultProperties());
    public static final Item WALNUTFENCEGATE = registerBlock(ModWoodBlocks.WALNUTFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item WALNUTDOOR = registerBlock(ModWoodBlocks.WALNUTDOOR,BlockItem::new,defaultProperties());
    public static final Item WALNUTTRAPDOOR = registerBlock(ModWoodBlocks.WALNUTTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item BANANALOG = registerBlock(ModWoodBlocks.BANANALOG,BlockItem::new,defaultProperties());
    public static final Item BANANAWOOD = registerBlock(ModWoodBlocks.BANANAWOOD,BlockItem::new,defaultProperties());
    public static final Item BANANALEAVES = registerBlock(ModWoodBlocks.BANANALEAVES,BlockItem::new,defaultProperties());
    public static final Item BANANASAPLING = registerBlock(ModTreesBlocks.BANANASAPLING,BlockItem::new,defaultProperties());
    public static final Item BANANAPLANKS = registerBlock(ModWoodBlocks.BANANAPLANKS,BlockItem::new,defaultProperties());
    public static final Item BANANASTAIRS = registerBlock(ModWoodBlocks.BANANASTAIRS,BlockItem::new,defaultProperties());
    public static final Item BANANASLAB = registerBlock(ModWoodBlocks.BANANASLAB,BlockItem::new,defaultProperties());
    public static final Item BANANABUTTON = registerBlock(ModWoodBlocks.BANANABUTTON,BlockItem::new,defaultProperties());
    public static final Item BANANAPRESSUERPLATE = registerBlock(ModWoodBlocks.BANANAPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item BANANAFENCE = registerBlock(ModWoodBlocks.BANANAFENCE,BlockItem::new,defaultProperties());
    public static final Item BANANAFENCEGATE = registerBlock(ModWoodBlocks.BANANAFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item BANANADOOR = registerBlock(ModWoodBlocks.BANANADOOR,BlockItem::new,defaultProperties());
    public static final Item BANANATRAPDOOR = registerBlock(ModWoodBlocks.BANANATRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item PEACHLOG = registerBlock(ModWoodBlocks.PEACHLOG,BlockItem::new,defaultProperties());
    public static final Item PEACHWOOD = registerBlock(ModWoodBlocks.PEACHWOOD,BlockItem::new,defaultProperties());
    public static final Item PEACHLEAVES = registerBlock(ModWoodBlocks.PEACHLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEACHSAPLING = registerBlock(ModTreesBlocks.PEACHSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEACHPLANKS = registerBlock(ModWoodBlocks.PEACHPLANKS,BlockItem::new,defaultProperties());
    public static final Item PEACHSTAIRS = registerBlock(ModWoodBlocks.PEACHSTAIRS,BlockItem::new,defaultProperties());
    public static final Item PEACHSLAB = registerBlock(ModWoodBlocks.PEACHSLAB,BlockItem::new,defaultProperties());
    public static final Item PEACHBUTTON = registerBlock(ModWoodBlocks.PEACHBUTTON,BlockItem::new,defaultProperties());
    public static final Item PEACHPRESSUERPLATE = registerBlock(ModWoodBlocks.PEACHPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item PEACHFENCE = registerBlock(ModWoodBlocks.PEACHFENCE,BlockItem::new,defaultProperties());
    public static final Item PEACHFENCEGATE = registerBlock(ModWoodBlocks.PEACHFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item PEACHDOOR = registerBlock(ModWoodBlocks.PEACHDOOR,BlockItem::new,defaultProperties());
    public static final Item PEACHTRAPDOOR = registerBlock(ModWoodBlocks.PEACHTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item COCONUTLOG = registerBlock(ModWoodBlocks.COCONUTLOG,BlockItem::new,defaultProperties());
    public static final Item COCONUTWOOD = registerBlock(ModWoodBlocks.COCONUTWOOD,BlockItem::new,defaultProperties());
    public static final Item COCONUTLEAVES = registerBlock(ModWoodBlocks.COCONUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item COCONUTSAPLING = registerBlock(ModTreesBlocks.COCONUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item COCONUTPLANKS = registerBlock(ModWoodBlocks.COCONUTPLANKS,BlockItem::new,defaultProperties());
    public static final Item COCONUTSTAIRS = registerBlock(ModWoodBlocks.COCONUTSTAIRS,BlockItem::new,defaultProperties());
    public static final Item COCONUTSLAB = registerBlock(ModWoodBlocks.COCONUTSLAB,BlockItem::new,defaultProperties());
    public static final Item COCONUTBUTTON = registerBlock(ModWoodBlocks.COCONUTBUTTON,BlockItem::new,defaultProperties());
    public static final Item COCONUTPRESSUERPLATE = registerBlock(ModWoodBlocks.COCONUTPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item COCONUTFENCE = registerBlock(ModWoodBlocks.COCONUTFENCE,BlockItem::new,defaultProperties());
    public static final Item COCONUTFENCEGATE = registerBlock(ModWoodBlocks.COCONUTFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item COCONUTDOOR = registerBlock(ModWoodBlocks.COCONUTDOOR,BlockItem::new,defaultProperties());
    public static final Item COCONUTTRAPDOOR = registerBlock(ModWoodBlocks.COCONUTTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item CARAMBOLALOG = registerBlock(ModWoodBlocks.CARAMBOLALOG,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAWOOD = registerBlock(ModWoodBlocks.CARAMBOLAWOOD,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLALEAVES = registerBlock(ModWoodBlocks.CARAMBOLALEAVES,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASAPLING = registerBlock(ModTreesBlocks.CARAMBOLASAPLING,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPLANKS = registerBlock(ModWoodBlocks.CARAMBOLAPLANKS,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASTAIRS = registerBlock(ModWoodBlocks.CARAMBOLASTAIRS,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASLAB = registerBlock(ModWoodBlocks.CARAMBOLASLAB,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLABUTTON = registerBlock(ModWoodBlocks.CARAMBOLABUTTON,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPRESSUERPLATE = registerBlock(ModWoodBlocks.CARAMBOLAPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAFENCE = registerBlock(ModWoodBlocks.CARAMBOLAFENCE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAFENCEGATE = registerBlock(ModWoodBlocks.CARAMBOLAFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLADOOR = registerBlock(ModWoodBlocks.CARAMBOLADOOR,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLATRAPDOOR = registerBlock(ModWoodBlocks.CARAMBOLATRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item TOONLOG = registerBlock(ModWoodBlocks.TOONLOG,BlockItem::new,defaultProperties());
    public static final Item TOONWOOD = registerBlock(ModWoodBlocks.TOONWOOD,BlockItem::new,defaultProperties());
    public static final Item TOONLEAVES = registerBlock(ModWoodBlocks.TOONLEAVES,BlockItem::new,defaultProperties());
    public static final Item TOONSAPLING = registerBlock(ModTreesBlocks.TOONSAPLING,BlockItem::new,defaultProperties());
    public static final Item TOONPLANKS = registerBlock(ModWoodBlocks.TOONPLANKS,BlockItem::new,defaultProperties());
    public static final Item TOONSTAIRS = registerBlock(ModWoodBlocks.TOONSTAIRS,BlockItem::new,defaultProperties());
    public static final Item TOONSLAB = registerBlock(ModWoodBlocks.TOONSLAB,BlockItem::new,defaultProperties());
    public static final Item TOONBUTTON = registerBlock(ModWoodBlocks.TOONBUTTON,BlockItem::new,defaultProperties());
    public static final Item TOONPRESSUERPLATE = registerBlock(ModWoodBlocks.TOONPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item TOONFENCE = registerBlock(ModWoodBlocks.TOONFENCE,BlockItem::new,defaultProperties());
    public static final Item TOONFENCEGATE = registerBlock(ModWoodBlocks.TOONFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item TOONDOOR = registerBlock(ModWoodBlocks.TOONDOOR,BlockItem::new,defaultProperties());
    public static final Item TOONTRAPDOOR = registerBlock(ModWoodBlocks.TOONTRAPDOOR,BlockItem::new,defaultProperties());






    private static Item registerBlock(Block block, @NotNull BiFunction<Block, Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(block, properties);
        ITEM_MAP.put(BuiltInRegistries.BLOCK.getKey(block).getPath(), item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModBlockItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }
}
