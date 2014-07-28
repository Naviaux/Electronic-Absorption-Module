package com.naviaux.eam.registers;

import com.naviaux.eam.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;

public class BlockRegistry {
	public static final EAMBlock casing = new BlockCasing();
	public static final EAMBlock compressor = new BlockCompressor();
	public static final EAMBlockContainer extractor = new BlockExtractor();
	public static final EAMBlockContainer smelter = new BlockSmelter();

	public static void init () {
		GameRegistry.registerBlock(casing, "casing");
		GameRegistry.registerBlock(compressor, "compressor");
		GameRegistry.registerBlock(extractor, "extractor");
		GameRegistry.registerBlock(smelter, "smelter");
	}
}
