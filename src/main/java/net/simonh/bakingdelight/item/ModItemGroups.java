package net.simonh.bakingdelight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.simonh.bakingdelight.BakingDelight;

public class ModItemGroups {
    public static final ItemGroup BAKING_DELIGHT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BakingDelight.MOD_ID,
                    "baking_delight_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.UNBAKED_COOKIE))
                    .displayName(Text.translatable("itemgroup.bakingdelight.unbaked_cookie"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.UNBAKED_COOKIE);
                        entries.add(ModItems.UNBAKED_SWEET_BERRY_COOKIE);
                        entries.add(ModItems.UNBAKED_HONEY_COOKIE);
                        entries.add(ModItems.UNBAKED_CAKE);
                        entries.add(ModItems.UNBAKED_SWEET_BERRY_CHEESECAKE);
                        entries.add(ModItems.UNBAKED_APPLE_PIE);
                        entries.add(ModItems.UNBAKED_CHOCOLATE_PIE);
                        entries.add(ModItems.UNBAKED_PUMPKIN_PIE);
                    }).build());

    public static void registerItemGroups() {
        BakingDelight.LOGGER.info("Registering Mod Item Groups");
    }
}
