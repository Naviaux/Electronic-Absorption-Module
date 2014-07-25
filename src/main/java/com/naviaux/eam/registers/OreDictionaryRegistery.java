package com.naviaux.eam.registers;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryRegistery {
    public static void init () {
        OreDictionary.registerOre("EAMHammer", ItemRegistery.stoneHammer);
    }
}
