package dev.anvilcraft.fooding.data;

import dev.anvilcraft.fooding.init.block.ModCropsBlocks;
import dev.anvilcraft.fooding.init.block.ModTreesBlocks;
import dev.anvilcraft.fooding.init.block.ModWoodBlocks;
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
        BlockModelGenerators.BlockFamilyProvider APPLEFAMILY = blockStateModelGenerator.family(ModWoodBlocks.APPLEPLANKS);
        BlockModelGenerators.BlockFamilyProvider PEARFAMILY = blockStateModelGenerator.family(ModWoodBlocks.PEARPLANKS);
        BlockModelGenerators.BlockFamilyProvider LEMONFAMILY = blockStateModelGenerator.family(ModWoodBlocks.LEMONPLANKS);
        BlockModelGenerators.BlockFamilyProvider WALNUTFAMILY = blockStateModelGenerator.family(ModWoodBlocks.WALNUTPLANKS);
        BlockModelGenerators.BlockFamilyProvider BANANAFAMILY = blockStateModelGenerator.family(ModWoodBlocks.BANANAPLANKS);
        BlockModelGenerators.BlockFamilyProvider PEACHFAMILY = blockStateModelGenerator.family(ModWoodBlocks.PEACHPLANKS);
        BlockModelGenerators.BlockFamilyProvider COCONUTFAMILY = blockStateModelGenerator.family(ModWoodBlocks.COCONUTPLANKS);
        BlockModelGenerators.BlockFamilyProvider CARAMBOLAFAMILY = blockStateModelGenerator.family(ModWoodBlocks.CARAMBOLAPLANKS);
        BlockModelGenerators.BlockFamilyProvider TOONFAMILY = blockStateModelGenerator.family(ModWoodBlocks.TOONPLANKS);

        APPLEFAMILY.stairs(ModWoodBlocks.APPLESTAIRS);
        APPLEFAMILY.slab(ModWoodBlocks.APPLESLAB);
        APPLEFAMILY.button(ModWoodBlocks.APPLEBUTTON);
        APPLEFAMILY.pressurePlate(ModWoodBlocks.APPLEPRESSUERPLATE);
        APPLEFAMILY.fence(ModWoodBlocks.APPLEFENCE);
        APPLEFAMILY.fenceGate(ModWoodBlocks.APPLEFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.APPLEDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.APPLETRAPDOOR);

        PEARFAMILY.stairs(ModWoodBlocks.PEARSTAIRS);
        PEARFAMILY.slab(ModWoodBlocks.PEARSLAB);
        PEARFAMILY.button(ModWoodBlocks.PEARBUTTON);
        PEARFAMILY.pressurePlate(ModWoodBlocks.PEARPRESSUERPLATE);
        PEARFAMILY.fence(ModWoodBlocks.PEARFENCE);
        PEARFAMILY.fenceGate(ModWoodBlocks.PEARFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.PEARDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.PEARTRAPDOOR);

        LEMONFAMILY.stairs(ModWoodBlocks.LEMONSTAIRS);
        LEMONFAMILY.slab(ModWoodBlocks.LEMONSLAB);
        LEMONFAMILY.button(ModWoodBlocks.LEMONBUTTON);
        LEMONFAMILY.pressurePlate(ModWoodBlocks.LEMONPRESSUERPLATE);
        LEMONFAMILY.fence(ModWoodBlocks.LEMONFENCE);
        LEMONFAMILY.fenceGate(ModWoodBlocks.LEMONFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.LEMONDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.LEMONTRAPDOOR);

        WALNUTFAMILY.stairs(ModWoodBlocks.WALNUTSTAIRS);
        WALNUTFAMILY.slab(ModWoodBlocks.WALNUTSLAB);
        WALNUTFAMILY.button(ModWoodBlocks.WALNUTBUTTON);
        WALNUTFAMILY.pressurePlate(ModWoodBlocks.WALNUTPRESSUERPLATE);
        WALNUTFAMILY.fence(ModWoodBlocks.WALNUTFENCE);
        WALNUTFAMILY.fenceGate(ModWoodBlocks.WALNUTFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.WALNUTDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.WALNUTTRAPDOOR);

        BANANAFAMILY.stairs(ModWoodBlocks.BANANASTAIRS);
        BANANAFAMILY.slab(ModWoodBlocks.BANANASLAB);
        BANANAFAMILY.button(ModWoodBlocks.BANANABUTTON);
        BANANAFAMILY.pressurePlate(ModWoodBlocks.BANANAPRESSUERPLATE);
        BANANAFAMILY.fence(ModWoodBlocks.BANANAFENCE);
        BANANAFAMILY.fenceGate(ModWoodBlocks.BANANAFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.BANANADOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.BANANATRAPDOOR);

        PEACHFAMILY.stairs(ModWoodBlocks.PEACHSTAIRS);
        PEACHFAMILY.slab(ModWoodBlocks.PEACHSLAB);
        PEACHFAMILY.button(ModWoodBlocks.PEACHBUTTON);
        PEACHFAMILY.pressurePlate(ModWoodBlocks.PEACHPRESSUERPLATE);
        PEACHFAMILY.fence(ModWoodBlocks.PEACHFENCE);
        PEACHFAMILY.fenceGate(ModWoodBlocks.PEACHFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.PEACHDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.PEACHTRAPDOOR);

        COCONUTFAMILY.stairs(ModWoodBlocks.COCONUTSTAIRS);
        COCONUTFAMILY.slab(ModWoodBlocks.COCONUTSLAB);
        COCONUTFAMILY.button(ModWoodBlocks.COCONUTBUTTON);
        COCONUTFAMILY.pressurePlate(ModWoodBlocks.COCONUTPRESSUERPLATE);
        COCONUTFAMILY.fence(ModWoodBlocks.COCONUTFENCE);
        COCONUTFAMILY.fenceGate(ModWoodBlocks.COCONUTFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.COCONUTDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.COCONUTTRAPDOOR);

        CARAMBOLAFAMILY.stairs(ModWoodBlocks.CARAMBOLASTAIRS);
        CARAMBOLAFAMILY.slab(ModWoodBlocks.CARAMBOLASLAB);
        CARAMBOLAFAMILY.button(ModWoodBlocks.CARAMBOLABUTTON);
        CARAMBOLAFAMILY.pressurePlate(ModWoodBlocks.CARAMBOLAPRESSUERPLATE);
        CARAMBOLAFAMILY.fence(ModWoodBlocks.CARAMBOLAFENCE);
        CARAMBOLAFAMILY.fenceGate(ModWoodBlocks.CARAMBOLAFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.CARAMBOLADOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.CARAMBOLATRAPDOOR);

        TOONFAMILY.stairs(ModWoodBlocks.TOONSTAIRS);
        TOONFAMILY.slab(ModWoodBlocks.TOONSLAB);
        TOONFAMILY.button(ModWoodBlocks.TOONBUTTON);
        TOONFAMILY.pressurePlate(ModWoodBlocks.TOONPRESSUERPLATE);
        TOONFAMILY.fence(ModWoodBlocks.TOONFENCE);
        TOONFAMILY.fenceGate(ModWoodBlocks.TOONFENCEGATE);
        blockStateModelGenerator.createDoor(ModWoodBlocks.TOONDOOR);
        blockStateModelGenerator.createTrapdoor(ModWoodBlocks.TOONTRAPDOOR);


        blockStateModelGenerator.woodProvider(ModWoodBlocks.APPLELOG).log(ModWoodBlocks.APPLELOG).wood(ModWoodBlocks.APPLEWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.PEARLOG).log(ModWoodBlocks.PEARLOG).wood(ModWoodBlocks.PEARWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.LEMONLOG).log(ModWoodBlocks.LEMONLOG).wood(ModWoodBlocks.LEMONWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.WALNUTLOG).log(ModWoodBlocks.WALNUTLOG).wood(ModWoodBlocks.WALNUTWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.BANANALOG).log(ModWoodBlocks.BANANALOG).wood(ModWoodBlocks.BANANAWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.PEACHLOG).log(ModWoodBlocks.PEACHLOG).wood(ModWoodBlocks.PEACHWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.COCONUTLOG).log(ModWoodBlocks.COCONUTLOG).wood(ModWoodBlocks.COCONUTWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.CARAMBOLALOG).log(ModWoodBlocks.CARAMBOLALOG).wood(ModWoodBlocks.CARAMBOLAWOOD);
        blockStateModelGenerator.woodProvider(ModWoodBlocks.TOONLOG).log(ModWoodBlocks.TOONLOG).wood(ModWoodBlocks.TOONWOOD);


        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.APPLELEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.PEARLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.LEMONLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.WALNUTLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.BANANALEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.PEACHLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.COCONUTLEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.CARAMBOLALEAVES);
        blockStateModelGenerator.createTrivialCube(ModWoodBlocks.TOONLEAVES);


        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.APPLESAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.PEARSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.LEMONSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.WALNUTSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.BANANASAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.PEACHSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.COCONUTSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.CARAMBOLASAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTreesBlocks.TOONSAPLING,BlockModelGenerators.TintState.NOT_TINTED);

        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModCropsBlocks.STRAWBERYCROP,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModCropsBlocks.BLUEBERYCROP,BlockModelGenerators.TintState.NOT_TINTED);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
