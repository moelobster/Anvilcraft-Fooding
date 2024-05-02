package dev.anvilcraft.fooding.init.blocks;

import dev.anvilcraft.fooding.block.type.Blueberry;
import dev.anvilcraft.fooding.block.type.Strawberry;
import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModCrops {
    private static final Map<String, Block> BLOCK_MAP = new HashMap<>();

    public static final Block STRAWBERYCROP = registerBlock("strawberry_crop", Strawberry::new,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BLUEBERYCROP = registerBlock("blueberry_crop", Blueberry::new,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));








    public static void register() {
        for (Map.Entry<String, Block> entry : ModCrops.BLOCK_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }

    private static Block registerBlock(String id, @NotNull Function<BlockBehaviour.Properties, Block> blockCreator, BlockBehaviour.Properties properties) {
        Block block = blockCreator.apply(properties);
        BLOCK_MAP.put(id, block);
        return block;
    }
}
