package com.htech.base.items.blocks;

import com.htech.base.lib.RefStrings;
import com.htech.base.main.HTBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZincOre extends Block {
	private final String name = "zincore";
	public ZincOre(){
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(RefStrings.MODIDBASE + "_" + name);
		setCreativeTab(HTBase.tabHtech);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 1);
		setStepSound(soundTypePiston);
		setResistance(15.0F);
	}
	
	public String getName(){
		return name;
	}
}