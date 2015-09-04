package com.htech.items.blocks;

import com.htech.lib.RefStrings;
import com.htech.main.HTMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperOre extends Block {
	private final String name = "copperore";
	public CopperOre(){
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTMain.tabHtech);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 1);
		setStepSound(soundTypePiston);
		setResistance(15.0F);
	}
	
	public String getName(){
		return name;
	}
}