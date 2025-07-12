package net.simonh.bakingdelight.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.simonh.bakingdelight.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.UNBAKED_COOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_SWEET_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_HONEY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_SWEET_BERRY_CHEESECAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_APPLE_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_CHOCOLATE_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNBAKED_PUMPKIN_PIE, Models.GENERATED);
    }
}
