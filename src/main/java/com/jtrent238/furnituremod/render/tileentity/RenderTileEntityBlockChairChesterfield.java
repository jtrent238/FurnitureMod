package com.jtrent238.furnituremod.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.jtrent238.furnituremod.Main;
import com.jtrent238.furnituremod.entity.tileentity.TileEntityBlockChairChesterfield;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderTileEntityBlockChairChesterfield extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityBlockChairChesterfield(){
        texture = new ResourceLocation(Main.MODID, "models/BlockChairChesterfieldTexture.png");
        objModelLocation = new ResourceLocation(Main.MODID, "models/BlockChairChesterfieldModel.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}

	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
		TileEntityBlockChairChesterfield te2 = (TileEntityBlockChairChesterfield) te;
		
		float rotation = te2.rotation + (timeSinceLastTick / 2F);
		float scale = te2.scale  * 2F;
		
		bindTexture(texture);

		GL11.glPushMatrix();
		GL11.glTranslated(posX + 0.5F, posY, posZ + 0.48F);
		GL11.glScalef(scale, scale, scale);
		GL11.glPushMatrix();
		//GL11.glRotatef(rotation, 0F, 1F, 0.5F);
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
}

	
}