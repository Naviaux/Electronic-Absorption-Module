package com.naviaux.eam;

import com.naviaux.eam.handlers.ConfigurationHandler;
import com.naviaux.eam.info.EAMInfo;
import com.naviaux.eam.registers.*;
import com.naviaux.eam.utility.LogUtil;
import com.naviaux.eam.proxy.IProxy;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;

@Mod(modid=EAMInfo.MOD_ID, name=EAMInfo.MOD_NAME, version=EAMInfo.VERSION, guiFactory=EAMInfo.GUI_FACTORY_CLASS)
public class EAModule {
    @Mod.Instance(EAMInfo.MOD_ID)
    public static EAModule instance;

    @SidedProxy(clientSide=EAMInfo.CLIENT_PROXY_CLASS, serverSide=EAMInfo.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ItemRegistery.init();
        OreDictionaryRegistery.init();
        RecipeRegistery.init();
        LogUtil.info("Pre-Initialization Complete");
    }
    @Mod.EventHandler
    public void initialization(FMLInitializationEvent event) {
        LogUtil.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInitialization(FMLPostInitializationEvent event) {
        LogUtil.info("Post-Initialization Complete");
    }
}
