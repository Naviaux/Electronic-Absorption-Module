package com.naviaux.eam.registers;

import com.naviaux.eam.tiles.TileEntityExtractor;
import com.naviaux.eam.tiles.TileEntitySmelter;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistery {
	public static void init () {
		GameRegistry.registerTileEntity(TileEntitySmelter.class, "smelter");
		GameRegistry.registerTileEntity(TileEntityExtractor.class, "extractor");
	}
}
