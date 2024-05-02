package dev.anvilcraft.fooding.init.blocks;

import dev.anvilcraft.fooding.block.grow.*;
import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModTrees {
    private static final Map<String, Block> TREE_MAP = new HashMap<>();

    public static final Block APPLESAPLING = registerBlock("apple_sapling",(properties)->new SaplingBlock(new AppleTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block PEARSAPLING = registerBlock("pear_sapling",(properties)->new SaplingBlock(new PearTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block LEMONSAPLING = registerBlock("lemon_sapling",(properties)->new SaplingBlock(new LemonTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block WALNUTSAPLING = registerBlock("walnut_sapling",(properties)->new SaplingBlock(new WalnutTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block BANANASAPLING = registerBlock("banana_sapling",(properties)->new SaplingBlock(new BananaTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block PEACHSAPLING = registerBlock("peach_sapling",(properties)->new SaplingBlock(new PeachTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block COCONUTSAPLING = registerBlock("coconut_sapling",(properties)->new SaplingBlock(new CoconutTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block CARAMBOLASAPLING = registerBlock("carambola_sapling",(properties)->new SaplingBlock(new CarambolaTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());
    public static final Block TOONSAPLING = registerBlock("toon_sapling",(properties)->new SaplingBlock(new ToonTreeGrower(),properties),
            BlockBehaviour.Properties.of().pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).noCollission().randomTicks().instabreak());



    public static void register() {
        for (Map.Entry<String, Block> entry : ModTrees.TREE_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }

    private static Block registerBlock(String id, @NotNull Function<BlockBehaviour.Properties, Block> blockCreator, BlockBehaviour.Properties properties) {
        Block block = blockCreator.apply(properties);
        TREE_MAP.put(id, block);
        return block;
    }
}
