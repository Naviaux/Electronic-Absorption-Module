package com.naviaux.eam.proxy;

import com.naviaux.eam.tiles.TileEntityExtractor;
import com.naviaux.eam.tiles.TileEntitySmelter;
import com.naviaux.eam.tiles.renders.ExtractorRenderer;
import com.naviaux.eam.tiles.renders.SmelterRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class ClientProxy extends CommonProxy {
	public static TileEntitySpecialRenderer renderSmelter = new SmelterRenderer();
	public static TileEntitySpecialRenderer renderExtractor = new ExtractorRenderer();

	public static void registerRenderThings () {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySmelter.class, renderSmelter);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExtractor.class, renderExtractor);
	}
}
