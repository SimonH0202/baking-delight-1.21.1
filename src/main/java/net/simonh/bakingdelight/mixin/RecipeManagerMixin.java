package net.simonh.bakingdelight.mixin;

import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.simonh.bakingdelight.BakingDelight;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.include.com.google.gson.JsonElement;

import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {

        // Farmer's Delight recipes
        Identifier sweetBerryCookie =  Identifier.of("farmersdelight:sweet_berry_cookie");
        Identifier honeyCookie =  Identifier.of("farmersdelight:honey_cookie");
        Identifier cakeFromMilkBottle = Identifier.of("farmersdelight:cake_from_milk_bottle");
        Identifier pieCrust = Identifier.of("farmersdelight:pie_crust");
        Identifier sweetBerryCheesecake = Identifier.of("farmersdelight:sweet_berry_cheesecake");
        Identifier applePie = Identifier.of("farmersdelight:apple_pie");
        Identifier chocolatePie  = Identifier.of("farmersdelight:chocolate_pie");

        // Minecraft recipes
        Identifier bread = Identifier.of("minecraft:bread");
        Identifier cookie = Identifier.of("minecraft:cookie");
        Identifier cake = Identifier.of("minecraft:cake");
        Identifier pumpkinPie = Identifier.of("minecraft:pumpkin_pie");

        map.remove(sweetBerryCookie);
        map.remove(honeyCookie);
        map.remove(cakeFromMilkBottle);
        map.remove(sweetBerryCheesecake);
        map.remove(applePie);
        map.remove(chocolatePie);
        map.remove(pieCrust);
        map.remove(bread);
        map.remove(cookie);
        map.remove(cake);
        map.remove(pumpkinPie);
    }
}
