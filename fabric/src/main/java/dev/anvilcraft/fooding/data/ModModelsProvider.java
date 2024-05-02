package dev.anvilcraft.fooding.data;

import dev.anvilcraft.fooding.init.blocks.ModCrops;
import dev.anvilcraft.fooding.init.blocks.ModTrees;
import dev.anvilcraft.fooding.init.blocks.ModWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider APPLEFAMILY = blockStateModelGenerator.family(ModWood.APPLEPLANKS);
        BlockModelGenerators.BlockFamilyProvider PEARFAMILY = blockStateModelGenerator.family(ModWood.PEARPLANKS);
        BlockModelGenerators.BlockFamilyProvider LEMONFAMILY = blockStateModelGenerator.family(ModWood.LEMONPLANKS);
        BlockModelGenerators.BlockFamilyProvider WALNUTFAMILY = blockStateModelGenerator.family(ModWood.WALNUTPLANKS);
        BlockModelGenerators.BlockFamilyProvider BANANAFAMILY = blockStateModelGenerator.family(ModWood.BANANAPLANKS);
        BlockModelGenerators.BlockFamilyProvider PEACHFAMILY = blockStateModelGenerator.family(ModWood.PEACHPLANKS);
        BlockModelGenerators.BlockFamilyProvider COCONUTFAMILY = blockStateModelGenerator.family(ModWood.COCONUTPLANKS);
        BlockModelGenerators.BlockFamilyProvider CARAMBOLAFAMILY = blockStateModelGenerator.family(ModWood.CARAMBOLAPLANKS);
        BlockModelGenerators.BlockFamilyProvider TOONFAMILY = blockStateModelGenerator.family(ModWood.TOONPLANKS);

        APPLEFAMILY.stairs(ModWood.APPLESTAIRS);
        APPLEFAMILY.slab(ModWood.APPLESLAB);
        APPLEFAMILY.button(ModWood.APPLEBUTTON);
        APPLEFAMILY.pressurePlate(ModWood.APPLEPRESSUERPLATE);
        APPLEFAMILY.fence(ModWood.APPLEFENCE);
        APPLEFAMILY.fenceGate(ModWood.APPLEFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.APPLEDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.APPLETRAPDOOR);

        PEARFAMILY.stairs(ModWood.PEARSTAIRS);
        PEARFAMILY.slab(ModWood.PEARSLAB);
        PEARFAMILY.button(ModWood.PEARBUTTON);
        PEARFAMILY.pressurePlate(ModWood.PEARPRESSUERPLATE);
        PEARFAMILY.fence(ModWood.PEARFENCE);
        PEARFAMILY.fenceGate(ModWood.PEARFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.PEARDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.PEARTRAPDOOR);

        LEMONFAMILY.stairs(ModWood.LEMONSTAIRS);
        LEMONFAMILY.slab(ModWood.LEMONSLAB);
        LEMONFAMILY.button(ModWood.LEMONBUTTON);
        LEMONFAMILY.pressurePlate(ModWood.LEMONPRESSUERPLATE);
        LEMONFAMILY.fence(ModWood.LEMONFENCE);
        LEMONFAMILY.fenceGate(ModWood.LEMONFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.LEMONDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.LEMONTRAPDOOR);

        WALNUTFAMILY.stairs(ModWood.WALNUTSTAIRS);
        WALNUTFAMILY.slab(ModWood.WALNUTSLAB);
        WALNUTFAMILY.button(ModWood.WALNUTBUTTON);
        WALNUTFAMILY.pressurePlate(ModWood.WALNUTPRESSUERPLATE);
        WALNUTFAMILY.fence(ModWood.WALNUTFENCE);
        WALNUTFAMILY.fenceGate(ModWood.WALNUTFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.WALNUTDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.WALNUTTRAPDOOR);

        BANANAFAMILY.stairs(ModWood.BANANASTAIRS);
        BANANAFAMILY.slab(ModWood.BANANASLAB);
        BANANAFAMILY.button(ModWood.BANANABUTTON);
        BANANAFAMILY.pressurePlate(ModWood.BANANAPRESSUERPLATE);
        BANANAFAMILY.fence(ModWood.BANANAFENCE);
        BANANAFAMILY.fenceGate(ModWood.BANANAFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.BANANADOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.BANANATRAPDOOR);

        PEACHFAMILY.stairs(ModWood.PEACHSTAIRS);
        PEACHFAMILY.slab(ModWood.PEACHSLAB);
        PEACHFAMILY.button(ModWood.PEACHBUTTON);
        PEACHFAMILY.pressurePlate(ModWood.PEACHPRESSUERPLATE);
        PEACHFAMILY.fence(ModWood.PEACHFENCE);
        PEACHFAMILY.fenceGate(ModWood.PEACHFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.PEACHDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.PEACHTRAPDOOR);

        COCONUTFAMILY.stairs(ModWood.COCONUTSTAIRS);
        COCONUTFAMILY.slab(ModWood.COCONUTSLAB);
        COCONUTFAMILY.button(ModWood.COCONUTBUTTON);
        COCONUTFAMILY.pressurePlate(ModWood.COCONUTPRESSUERPLATE);
        COCONUTFAMILY.fence(ModWood.COCONUTFENCE);
        COCONUTFAMILY.fenceGate(ModWood.COCONUTFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.COCONUTDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.COCONUTTRAPDOOR);

        CARAMBOLAFAMILY.stairs(ModWood.CARAMBOLASTAIRS);
        CARAMBOLAFAMILY.slab(ModWood.CARAMBOLASLAB);
        CARAMBOLAFAMILY.button(ModWood.CARAMBOLABUTTON);
        CARAMBOLAFAMILY.pressurePlate(ModWood.CARAMBOLAPRESSUERPLATE);
        CARAMBOLAFAMILY.fence(ModWood.CARAMBOLAFENCE);
        CARAMBOLAFAMILY.fenceGate(ModWood.CARAMBOLAFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.CARAMBOLADOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.CARAMBOLATRAPDOOR);

        TOONFAMILY.stairs(ModWood.TOONSTAIRS);
        TOONFAMILY.slab(ModWood.TOONSLAB);
        TOONFAMILY.button(ModWood.TOONBUTTON);
        TOONFAMILY.pressurePlate(ModWood.TOONPRESSUERPLATE);
        TOONFAMILY.fence(ModWood.TOONFENCE);
        TOONFAMILY.fenceGate(ModWood.TOONFENCEGATE);
        blockStateModelGenerator.createDoor(ModWood.TOONDOOR);
        blockStateModelGenerator.createTrapdoor(ModWood.TOONTRAPDOOR);


        blockStateModelGenerator.woodProvider(ModWood.APPLELOG).log(ModWood.APPLELOG).wood(ModWood.APPLEWOOD);
        blockStateModelGenerator.woodProvider(ModWood.PEARLOG).log(ModWood.PEARLOG).wood(ModWood.PEARWOOD);
        blockStateModelGenerator.woodProvider(ModWood.LEMONLOG).log(ModWood.LEMONLOG).wood(ModWood.LEMONWOOD);
        blockStateModelGenerator.woodProvider(ModWood.WALNUTLOG).log(ModWood.WALNUTLOG).wood(ModWood.WALNUTWOOD);
        blockStateModelGenerator.woodProvider(ModWood.BANANALOG).log(ModWood.BANANALOG).wood(ModWood.BANANAWOOD);
        blockStateModelGenerator.woodProvider(ModWood.PEACHLOG).log(ModWood.PEACHLOG).wood(ModWood.PEACHWOOD);
        blockStateModelGenerator.woodProvider(ModWood.COCONUTLOG).log(ModWood.COCONUTLOG).wood(ModWood.COCONUTWOOD);
        blockStateModelGenerator.woodProvider(ModWood.CARAMBOLALOG).log(ModWood.CARAMBOLALOG).wood(ModWood.CARAMBOLAWOOD);
        blockStateModelGenerator.woodProvider(ModWood.TOONLOG).log(ModWood.TOONLOG).wood(ModWood.TOONWOOD);


        blockStateModelGenerator.createTrivialCube(ModWood.APPLELEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.PEARLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.LEMONLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.WALNUTLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.BANANALEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.PEACHLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.COCONUTLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.CARAMBOLALEAVES);
        blockStateModelGenerator.createTrivialCube(ModWood.TOONLEAVES);


        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.APPLESAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.PEARSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.LEMONSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.WALNUTSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.BANANASAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.PEACHSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.COCONUTSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.CARAMBOLASAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.TOONSAPLING,BlockModelGenerators.TintState.NOT_TINTED);

        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModCrops.STRAWBERYCROP,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModCrops.BLUEBERYCROP,BlockModelGenerators.TintState.NOT_TINTED);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
