package com.naviaux.eam.tiles.renders;

import com.naviaux.eam.model.ModelExtractor;
import com.naviaux.eam.model.ModelSmelter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ExtractorRenderer extends TileEntitySpecialRenderer {
	private static final ModelExtractor model = new ModelExtractor();
	private static final ResourceLocation texture = new ResourceLocation("eam:textures/models/extractor.png");

	public ExtractorRenderer () { }


	@Override
	public void renderTileEntityAt (TileEntity te, double x, double y, double z, float scale) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
