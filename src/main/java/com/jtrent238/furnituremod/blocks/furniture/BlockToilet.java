package com.jtrent238.furnituremod.blocks.furniture;

import com.jtrent238.furnituremod.entity.tileentity.TileEntityBlockChairChesterfield;
import com.jtrent238.furnituremod.entity.tileentity.TileEntityBlockToilet;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IRegistry;
import net.minecraft.util.RegistryDefaulted;
import net.minecraft.world.World;

public class BlockToilet extends BlockContainer{

	public BlockToilet(Material material) {
        super(material);

        this.setBlockName("BlockToilet");
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityBlockToilet();
    }
        
}
 