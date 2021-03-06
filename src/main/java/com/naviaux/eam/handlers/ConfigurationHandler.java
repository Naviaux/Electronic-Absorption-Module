package com.naviaux.eam.handlers;

import com.naviaux.eam.info.EAMInfo;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static boolean testValue = false;

	public static void init (File configFile) {
		// create config file
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent (ConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(EAMInfo.MOD_ID)) loadConfiguration();
	}

	private static void loadConfiguration () {
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is a config value");

		if (configuration.hasChanged()) configuration.save();
	}
}
