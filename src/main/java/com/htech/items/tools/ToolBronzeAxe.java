package com.htech.items.tools;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzeAxe extends ItemAxe {
	
	private final String name = "bronzeaxe";
	public ToolBronzeAxe(ToolMaterial material){
		
		super(material);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}