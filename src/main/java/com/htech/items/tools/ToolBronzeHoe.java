package com.htech.items.tools;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzeHoe extends ItemHoe {
	
	private final String name = "bronzehoe";
	public ToolBronzeHoe(ToolMaterial material){
		
		super(material);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}