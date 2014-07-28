package com.naviaux.eam.block;

import com.naviaux.eam.tiles.TileEntitySmelter;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSmelter extends EAMBlockContainer {
	public BlockSmelter () {
		super(Material.rock);
		this.setBlockName("smelter");
		this.setBlockTextureName("smelter");
		this.setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 1.0F, 0.875F);
	}

	public boolean isOpaqueCube () {
		return false;
	}

	public boolean renderAsNormalBlock () {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity (World var1, int var2) {
		return new TileEntitySmelter();
	}

	@Override
	public int getRenderType () {
		return -1;
	}
}
