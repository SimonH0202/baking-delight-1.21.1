package net.simonh.bakingdelight.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.simonh.bakingdelight.BakingDelight;
import net.simonh.bakingdelight.item.ModItems;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        Map<Item, Item> recipeMap = Map.of(ModItems.UNBAKED_COOKIE, Items.COOKIE, ModItems.UNBAKED_CAKE, Items.CAKE);

        for (Map.Entry<Item, Item> entry : recipeMap.entrySet()) {
            CookingRecipeJsonBuilder.createSmelting(
                            Ingredient.ofItems(entry.getKey()),
                            RecipeCategory.FOOD,
                            entry.getValue(),
                            0.35f, 200
                    ).criterion(FabricRecipeProvider.hasItem(ModItems.UNBAKED_COOKIE), conditionsFromItem(ModItems.UNBAKED_COOKIE))
                    .offerTo(recipeExporter, Identifier.of(BakingDelight.MOD_ID, Registries.ITEM.getId(entry.getValue()).getPath() + "_from_smelting"));
        }

        for (Map.Entry<Item, Item> entry : recipeMap.entrySet()) {
            CookingRecipeJsonBuilder.createSmoking(
                            Ingredient.ofItems(entry.getKey()),
                            RecipeCategory.FOOD,
                            entry.getValue(),
                            0.35f, 100
                    ).criterion(FabricRecipeProvider.hasItem(ModItems.UNBAKED_COOKIE), conditionsFromItem(ModItems.UNBAKED_COOKIE))
                    .offerTo(recipeExporter, Identifier.of(BakingDelight.MOD_ID,Registries.ITEM.getId(entry.getValue()).getPath() + "_from_smoking"));
        }
    }
}
