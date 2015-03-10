package com.htech.base.items.tools;

import com.htech.base.lib.RefStrings;
import com.htech.base.main.HTBase;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzeAxe extends ItemAxe {
	
	private final String name = "bronzeaxe";
	public ToolBronzeAxe(ToolMaterial material){
		
		super(material);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODIDBASE + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}