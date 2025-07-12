package net.simonh.bakingdelight;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.simonh.bakingdelight.item.ModItemGroups;
import net.simonh.bakingdelight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BakingDelight implements ModInitializer {
	public static final String MOD_ID = "bakingdelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.RegisterModItems();
	}
}