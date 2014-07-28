package com.naviaux.eam.block;

import com.naviaux.eam.tiles.TileEntityExtractor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockExtractor extends EAMBlockContainer {
	public BlockExtractor () {
		super();
		this.setBlockName("extractor");
		this.setBlockTextureName("extractor");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.6875F, 1.0F);
	}

	public boolean isOpaqueCube () {
		return false;
	}

	public boolean renderAsNormalBlock () {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity (World var1, int var2) {
		return new TileEntityExtractor();
	}

	@Override
	public int getRenderType () {
		return -1;
	}
}
