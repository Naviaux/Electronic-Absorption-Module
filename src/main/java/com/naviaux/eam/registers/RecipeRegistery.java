package com.naviaux.eam.registers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeRegistery {

    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_pickaxe), new ItemStack(ItemRegistery.metalBits), new ItemStack(ItemRegistery.stoneHammer));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistery.metalBits), new ItemStack(ItemRegistery.stoneHammer), new ItemStack(Items.iron_ingot));
    }
}
