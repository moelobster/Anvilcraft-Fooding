package dev.anvilcraft.fooding.init.block;

import dev.anvilcraft.fooding.init.block.type.Blueberry;
import dev.anvilcraft.fooding.init.block.type.Strawberry;
import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModCropsBlocks {
    private static final Map<String, Block> BLOCK_MAP = new HashMap<>();

    public static final Block STRAWBERYCROP = registerBlock("strawberry_crop", Strawberry::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block BLUEBERYCROP = registerBlock("blueberry_crop", Blueberry::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block HOUTTUYNIACORDATACROP = registerBlock("houttuynia_cordata_crop", CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block CORIANDERCROP = registerBlock("coriander_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block CELERYCROP = registerBlock("celery_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block SPINACHCROP = registerBlock("spinach_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block CABBAGECROP = registerBlock("cabbage_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block CHINESECABBAGECROP = registerBlock("chinese_cabbage_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block EGGPLANTCROP = registerBlock("eggplant_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block CHILICROP = registerBlock("chili_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block TOMATOCROP = registerBlock("tomato_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block GENSINGCROP = registerBlock("gensing_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block AMERICANGENSINGCROP = registerBlock("american_gensing_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block GOURDCROP = registerBlock("gourd_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block SOYBEANSCROP = registerBlock("soybeans_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block FRENCHBEANCROP = registerBlock("french_beans_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block COWPEACROP = registerBlock("cowpea_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block PEACROP = registerBlock("pea_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));
    public static final Block PEANUTCROP = registerBlock("peanut_crop",CropBlock::new,BlockBehaviour.Properties.copy(Blocks.WHEAT));



    public static void register() {
        for (Map.Entry<String, Block> entry : ModCropsBlocks.BLOCK_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }

    private static Block registerBlock(String id, @NotNull Function<BlockBehaviour.Properties, Block> blockCreator, BlockBehaviour.Properties properties) {
        Block block = blockCreator.apply(properties);
        BLOCK_MAP.put(id, block);
        return block;
    }
}
