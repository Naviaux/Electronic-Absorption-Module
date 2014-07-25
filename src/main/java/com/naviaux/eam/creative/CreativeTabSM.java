package com.naviaux.eam.creative;

import com.naviaux.eam.info.EAMInfo;
import com.naviaux.eam.registers.ItemRegistery;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSM {

    public static CreativeTabs EAMCreativeTab = new CreativeTabs(EAMInfo.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem () {
            return ItemRegistery.stoneHammer;
        }
    };
}
