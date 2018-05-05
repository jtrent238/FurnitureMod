package com.jtrent238.furnituremod;

import com.jtrent238.furnituremod.blocks.furniture.BlockToilet;
import com.jtrent238.furnituremod.blocks.furniture.chairs.BlockChairChesterfield;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockLoader {

	public static Block BlockChairChesterfield;
	public static Block BlockToilet;

	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		BlockChairChesterfield = new BlockChairChesterfield(Material.rock).setBlockName("BlockChairChesterfield").setBlockTextureName(Main.MODID + ":BlockChairChesterfield").setCreativeTab(Main.FurnitureTab).setHardness(5F);
		BlockToilet = new BlockToilet(Material.rock).setBlockName("BlockToilet").setBlockTextureName(Main.MODID + ":BlockToilet").setCreativeTab(Main.FurnitureTab).setHardness(5F);
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks() {
		
		GameRegistry.registerBlock(BlockChairChesterfield, "BlockChairChesterfield");
		GameRegistry.registerBlock(BlockToilet, "BlockToilet");
		
	}

}
