package com.naviaux.eam.block;

import com.naviaux.eam.creative.EAMCreativeTabs;
import com.naviaux.eam.info.EAMInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class EAMBlock extends Block {
	public EAMBlock (Material material) {
		super(material);
		this.setCreativeTab(EAMCreativeTabs.EAM_TAB);
	}

	public EAMBlock () {
		this(Material.rock);
	}

	@Override
	public String getUnlocalizedName () {
		return String.format("tile.%s%s", EAMInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly (Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName (String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
