package com.naviaux.eam.registers;

import com.naviaux.eam.info.EAMInfo;
import com.naviaux.eam.item.EAMItem;
import com.naviaux.eam.item.ItemMetalBits;
import com.naviaux.eam.item.ItemStoneHammer;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(EAMInfo.MOD_ID)
public class ItemRegistery {
    public static final EAMItem metalBits = new ItemMetalBits();
    public static final EAMItem stoneHammer = new ItemStoneHammer();

    public static void init () {
        GameRegistry.registerItem(metalBits, "metalBits");
        GameRegistry.registerItem(stoneHammer, "stoneHammer");
    }
}
