package com.naviaux.eam.block;

import com.naviaux.eam.creative.EAMCreativeTabs;
import com.naviaux.eam.info.EAMInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class EAMBlockContainer extends BlockContainer {
	public EAMBlockContainer (Material material) {
		super(material);
		this.setCreativeTab(EAMCreativeTabs.EAM_TAB);
	}

	public EAMBlockContainer () {
		this(Material.rock);
	}

	@Override
	public TileEntity createNewTileEntity (World p_149915_1_, int p_149915_2_) {
		return null;
	}
}
