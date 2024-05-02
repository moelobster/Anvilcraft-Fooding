package dev.anvilcraft.fooding.data.fabric;

import dev.anvilcraft.fooding.block.features.ModTreeFeatures;
import dev.anvilcraft.fooding.data.ModBlockTagProvider;
import dev.anvilcraft.fooding.data.ModGenerator;
import dev.anvilcraft.fooding.data.ModItemTagProvider;
import dev.anvilcraft.fooding.data.ModModelsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class AnvilCraftFoodingDatagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModGenerator::new);
    }
    @Override
    public void buildRegistry(RegistrySetBuilder RegistryBuilder){
        RegistryBuilder.add(Registries.CONFIGURED_FEATURE, ModTreeFeatures::bootstrap);
    }
}
