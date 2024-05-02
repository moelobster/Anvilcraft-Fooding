package dev.anvilcraft.fooding.init.blocks;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModWood {
    private static final Map<String,Block> BLOCK_MAP = new HashMap<>();




    public static final Block APPLELOG = registerBlock("apple_log", RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final Block APPLEWOOD = registerBlock("apple_wood", RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
    public static final Block APPLEPLANKS = registerBlock("apple_planks", Block::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLESTAIRS = registerBlock("apple_stairs",(properties) -> new StairBlock(ModWood.APPLEPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLESLAB = registerBlock("apple_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLEBUTTON = registerBlock("apple_button",(properties) -> new ButtonBlock(properties, BlockSetType.OAK,20,true),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLEPRESSUERPLATE = registerBlock("apple_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLEFENCE = registerBlock("apple_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLEFENCEGATE = registerBlock("apple_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLEDOOR = registerBlock("apple_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLETRAPDOOR = registerBlock("apple_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block APPLELEAVES = registerBlock("apple_leaves", LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));



    public static final Block PEARLOG = registerBlock("pear_log", RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final Block PEARWOOD = registerBlock("pear_wood", RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
    public static final Block PEARPLANKS = registerBlock("pear_planks", Block::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARSTAIRS = registerBlock("pear_stairs",(properties) -> new StairBlock(ModWood.PEARPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARSLAB = registerBlock("pear_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARBUTTON = registerBlock("pear_button",(properties) -> new ButtonBlock(properties, BlockSetType.OAK,20,true),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARPRESSUERPLATE = registerBlock("pear_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARFENCE = registerBlock("pear_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARFENCEGATE = registerBlock("pear_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARDOOR = registerBlock("pear_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARTRAPDOOR = registerBlock("pear_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEARLEAVES = registerBlock("pear_leaves", LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));



    public static final Block LEMONLOG = registerBlock("lemon_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG));
    public static final Block LEMONWOOD = registerBlock("lemon_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD));
    public static final Block LEMONPLANKS = registerBlock("lemon_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONSTAIRS = registerBlock("lemon_stairs",(properties) -> new StairBlock(ModWood.LEMONPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONSLAB = registerBlock("lemon_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONBUTTON = registerBlock("lemon_button",(properties) -> new ButtonBlock(properties, BlockSetType.BIRCH,20,true),BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONPRESSUERPLATE = registerBlock("lemon_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.BIRCH),BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONFENCE = registerBlock("lemon_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONFENCEGATE = registerBlock("lemon_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.BIRCH),BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONDOOR = registerBlock("lemon_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.BIRCH),BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONTRAPDOOR = registerBlock("lemon_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.BIRCH),BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final Block LEMONLEAVES = registerBlock("lemon_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES));



    public static final Block WALNUTLOG = registerBlock("walnut_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block WALNUTWOOD = registerBlock("walnut_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block WALNUTPLANKS = registerBlock("walnut_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTSTAIRS = registerBlock("walnut_stairs",(properties) -> new StairBlock(ModWood.WALNUTPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTSLAB = registerBlock("walnut_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTBUTTON = registerBlock("walnut_button",(properties) -> new ButtonBlock(properties, BlockSetType.JUNGLE,20,true),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTPRESSUERPLATE = registerBlock("walnut_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTFENCE = registerBlock("walnut_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTFENCEGATE = registerBlock("walnut_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTDOOR = registerBlock("walnut_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTTRAPDOOR = registerBlock("walnut_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block WALNUTLEAVES = registerBlock("walnut_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));



    public static final Block BANANALOG = registerBlock("banana_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block BANANAWOOD = registerBlock("banana_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block BANANAPLANKS = registerBlock("banana_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANASTAIRS = registerBlock("banana_stairs",(properties) -> new StairBlock(ModWood.BANANAPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANASLAB = registerBlock("banana_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANABUTTON = registerBlock("banana_button",(properties) -> new ButtonBlock(properties, BlockSetType.JUNGLE,20,true),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANAPRESSUERPLATE = registerBlock("banana_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANAFENCE = registerBlock("banana_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANAFENCEGATE = registerBlock("banana_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANADOOR = registerBlock("banana_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANATRAPDOOR = registerBlock("banana_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block BANANALEAVES = registerBlock("banana_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));



    public static final Block PEACHLOG = registerBlock("peach_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final Block PEACHWOOD = registerBlock("peach_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
    public static final Block PEACHPLANKS = registerBlock("peach_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHSTAIRS = registerBlock("peach_stairs",(properties) -> new StairBlock(ModWood.PEACHPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHSLAB = registerBlock("peach_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHBUTTON = registerBlock("peach_button",(properties) -> new ButtonBlock(properties, BlockSetType.OAK,20,true),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHPRESSUERPLATE = registerBlock("peach_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHFENCE = registerBlock("peach_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHFENCEGATE = registerBlock("peach_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHDOOR = registerBlock("peach_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHTRAPDOOR = registerBlock("peach_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.OAK),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final Block PEACHLEAVES = registerBlock("peach_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));



    public static final Block COCONUTLOG = registerBlock("coconut_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block COCONUTWOOD = registerBlock("coconut_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block COCONUTPLANKS = registerBlock("coconut_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTSTAIRS = registerBlock("coconut_stairs",(properties) -> new StairBlock(ModWood.COCONUTPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTSLAB = registerBlock("coconut_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTBUTTON = registerBlock("coconut_button",(properties) -> new ButtonBlock(properties, BlockSetType.JUNGLE,20,true),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTPRESSUERPLATE = registerBlock("coconut_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTFENCE = registerBlock("coconut_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTFENCEGATE = registerBlock("coconut_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTDOOR = registerBlock("coconut_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTTRAPDOOR = registerBlock("coconut_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block COCONUTLEAVES = registerBlock("coconut_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));



    public static final Block CARAMBOLALOG = registerBlock("carambola_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block CARAMBOLAWOOD = registerBlock("carambola_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block CARAMBOLAPLANKS = registerBlock("carambola_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLASTAIRS = registerBlock("carambola_stairs",(properties) -> new StairBlock(ModWood.CARAMBOLAPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLASLAB = registerBlock("carambola_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLABUTTON = registerBlock("carambola_button",(properties) -> new ButtonBlock(properties, BlockSetType.JUNGLE,20,true),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLAPRESSUERPLATE = registerBlock("carambola_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLAFENCE = registerBlock("carambola_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLAFENCEGATE = registerBlock("carambola_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLADOOR = registerBlock("carambola_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLATRAPDOOR = registerBlock("carambola_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.JUNGLE),BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final Block CARAMBOLALEAVES = registerBlock("carambola_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));



    public static final Block TOONLOG = registerBlock("toon_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG));
    public static final Block TOONWOOD = registerBlock("toon_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD));
    public static final Block TOONPLANKS = registerBlock("toon_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONSTAIRS = registerBlock("toon_stairs",(properties) -> new StairBlock(ModWood.TOONPLANKS.defaultBlockState(),properties),BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONSLAB = registerBlock("toon_slab",SlabBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONBUTTON = registerBlock("toon_button",(properties) -> new ButtonBlock(properties, BlockSetType.SPRUCE,20,true),BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONPRESSUERPLATE = registerBlock("toon_pressure_plate",(properties) -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,properties,BlockSetType.SPRUCE),BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONFENCE = registerBlock("toon_fence",FenceBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONFENCEGATE = registerBlock("toon_fence_gate",(properties) -> new FenceGateBlock(properties, WoodType.SPRUCE),BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONDOOR = registerBlock("toon_door",(properties) -> new DoorBlock(properties.noOcclusion(),BlockSetType.SPRUCE),BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONTRAPDOOR = registerBlock("toon_trapdoor",(properties) -> new TrapDoorBlock(properties.noOcclusion(),BlockSetType.SPRUCE),BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final Block TOONLEAVES = registerBlock("toon_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES));





    public static void register() {
        for (Map.Entry<String, Block> entry : ModWood.BLOCK_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, AnvilCraftFoodingFabric.of(entry.getKey()), entry.getValue());
        }
    }

    private static Block registerBlock(String id, @NotNull Function<BlockBehaviour.Properties, Block> blockCreator, BlockBehaviour.Properties properties) {
        Block block = blockCreator.apply(properties);
        BLOCK_MAP.put(id, block);
        return block;
    }
}
