package com.naviaux.eam.client.gui;

import com.naviaux.eam.handlers.ConfigurationHandler;
import com.naviaux.eam.info.EAMInfo;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class EAMGuiConfig extends GuiConfig {

    public EAMGuiConfig (GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                EAMInfo.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
