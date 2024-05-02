package dev.anvilcraft.fooding.block.features;

import dev.anvilcraft.fooding.fabric.AnvilCraftFoodingFabric;
import dev.anvilcraft.fooding.init.blocks.ModWood;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;


public class ModTreeFeatures{

    public static final ResourceKey<ConfiguredFeature<?, ?>> APPLETREE = ModTreeFeatures.createKey("apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEARTREE = ModTreeFeatures.createKey("pear_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEMONTREE = ModTreeFeatures.createKey("lemon_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUTTREE = ModTreeFeatures.createKey("walnut_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BANANATREE = ModTreeFeatures.createKey("banana_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACHTREE = ModTreeFeatures.createKey("peach_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COCONUTTREE = ModTreeFeatures.createKey("coconut_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CARAMBOLATREE = ModTreeFeatures.createKey("carambola_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOONTREE = ModTreeFeatures.createKey("toon_tree");
    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block block, Block block2, int i, int j, int k, int l) {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(block),
                new StraightTrunkPlacer(i, j, k),
                BlockStateProvider.simple(block2),
                new BlobFoliagePlacer(ConstantInt.of(l), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1));
    }
    private static TreeConfiguration.TreeConfigurationBuilder createApple(){
        return createStraightBlobTree(ModWood.APPLELOG, ModWood.APPLELEAVES,5,3,0,2).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createPear() {
        return createStraightBlobTree(ModWood.PEARLOG, ModWood.PEARLEAVES, 5, 3, 0, 3).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createLemon() {
        return createStraightBlobTree(ModWood.LEMONLOG, ModWood.LEMONLEAVES, 5, 2, 0, 3).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createWalnut() {
        return createStraightBlobTree(ModWood.WALNUTLOG, ModWood.WALNUTLEAVES, 6, 3, 0, 3).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createBanana() {
        return createStraightBlobTree(ModWood.BANANALOG, ModWood.BANANALEAVES, 7, 4, 0, 4).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createPeach() {
        return createStraightBlobTree(ModWood.PEACHLOG, ModWood.PEACHLEAVES, 5, 2, 0, 2).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createCoconut() {
        return createStraightBlobTree(ModWood.COCONUTLOG, ModWood.COCONUTLEAVES, 7, 2, 0, 3).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createCarambola() {
        return createStraightBlobTree(ModWood.CARAMBOLALOG, ModWood.CARAMBOLALEAVES, 6, 2, 0, 3).ignoreVines();
    }
    private static TreeConfiguration.TreeConfigurationBuilder createToon() {
        return createStraightBlobTree(ModWood.TOONLOG, ModWood.TOONLEAVES, 7, 2, 0, 2).ignoreVines();
    }
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> bootstapContext){
        register(bootstapContext,APPLETREE,Feature.TREE,createApple().build());
        register(bootstapContext,PEARTREE,Feature.TREE,createPear().build());
        register(bootstapContext,LEMONTREE, Feature.TREE,createLemon().build());
        register(bootstapContext,WALNUTTREE, Feature.TREE,createWalnut().build());
        register(bootstapContext,BANANATREE,Feature.TREE,createBanana().build());
        register(bootstapContext,PEACHTREE, Feature.TREE,createPeach().build());
        register(bootstapContext,COCONUTTREE, Feature.TREE,createCoconut().build());
        register(bootstapContext,CARAMBOLATREE,Feature.TREE,createCarambola().build());
        register(bootstapContext,TOONTREE, Feature.TREE,createToon().build());
    }
    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String string) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, AnvilCraftFoodingFabric.of(string));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> bootstapContext, ResourceKey<ConfiguredFeature<?, ?>> resourceKey, F feature, FC featureConfiguration) {
        bootstapContext.register(resourceKey, new ConfiguredFeature<>(feature, featureConfiguration));
    }

}
