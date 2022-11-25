package net.adam.armor;

import net.adam.armor.items.moditems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class armor implements ModInitializer {
	public static final String MOD_ID = "armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		moditems.registerModItems();
	}
}