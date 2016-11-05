package com.zixiken.dimdoors.blocks;

import com.zixiken.dimdoors.items.ModItems;
import com.zixiken.dimdoors.tileentities.TileEntityDimDoorGold;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockDimDoorGold extends BlockDimDoorBase {
    public static final String ID = "blockDimDoorGold";

	public BlockDimDoorGold() {
		super(Material.iron);
        setHardness(1.0F);
        setUnlocalizedName(ID);
	}

	@Override
	public void placeLink(World world, BlockPos pos) {
	}
	
	@Override
	public Item getItemDoor() {return ModItems.itemDimDoorGold;}
	
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {return new TileEntityDimDoorGold();}

}