package com.htech.base.items.blocks;

import com.htech.base.lib.RefStringsBase;
import com.htech.base.main.HTBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LeadBlock extends Block {
	
	private final String name = "leadblock";
	public LeadBlock(){
		super(Material.iron);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(RefStringsBase.MODIDBASE + "_" + name);
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