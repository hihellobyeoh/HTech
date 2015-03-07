package com.htech.items.blocks;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperBlock extends Block {

	private final String name = "copperblock";
	public CopperBlock(){
		super(Material.iron);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
		setHardness(4.0F);
		setHarvestLevel("pickaxe", 1);
		setStepSound(soundTypeMetal);
		setResistance(30.0F);
	}
	
	public String getName(){
		return name;
	}
}