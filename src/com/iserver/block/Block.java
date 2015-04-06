package com.iserver.block;

import java.util.Collection;

import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.inventory.ItemStack;

public interface Block {

	public abstract boolean isBlockPowered();
	  
	  public abstract boolean isBlockIndirectlyPowered();
	  
	  public abstract int getBlockPower();
	  
	  public abstract boolean isEmpty();
	  
	  public abstract boolean isLiquid();
	  
	  public abstract double getTemperature();
	  
	  public abstract double getHumidity();
	  
	  public abstract boolean breakNaturally();
	  
	  public abstract boolean breakNaturally(ItemStack paramItemStack);
	  
	  public abstract Collection<ItemStack> getDrops();
	  
	  public abstract Collection<ItemStack> getDrops(ItemStack paramItemStack);
}
