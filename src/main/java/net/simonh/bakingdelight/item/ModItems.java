package net.simonh.bakingdelight.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.simonh.bakingdelight.BakingDelight;

public class ModItems {
    public static final Item UNBAKED_COOKIE = registerItem("unbaked_cookie", new Item(new Item.Settings().food(ModFoodComponent.UNBAKED_COOKIE)));
    public static final Item UNBAKED_SWEET_BERRY_COOKIE = registerItem("unbaked_sweet_berry_cookie", new Item(new Item.Settings().food(ModFoodComponent.UNBAKED_COOKIE)));
    public static final Item UNBAKED_HONEY_COOKIE = registerItem("unbaked_honey_cookie", new Item(new Item.Settings().food(ModFoodComponent.UNBAKED_COOKIE)));
    public static final Item UNBAKED_CAKE = registerItem("unbaked_cake", new Item(new Item.Settings().maxCount(1)));
    public static final Item UNBAKED_SWEET_BERRY_CHEESECAKE = registerItem("unbaked_sweet_berry_cheesecake", new Item(new Item.Settings()));
    public static final Item UNBAKED_APPLE_PIE = registerItem("unbaked_apple_pie", new Item(new Item.Settings()));
    public static final Item UNBAKED_CHOCOLATE_PIE = registerItem("unbaked_chocolate_pie", new Item(new Item.Settings()));
    public static final Item UNBAKED_PUMPKIN_PIE = registerItem("unbaked_pumpkin_pie", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BakingDelight.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        BakingDelight.LOGGER.info("Registering Mod Items");
    }
}
