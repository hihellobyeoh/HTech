package com.htech.items.tools;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzePickaxe extends ItemPickaxe {
	
	private final String name = "bronzepickaxe";
	public ToolBronzePickaxe(ToolMaterial material){
		
		super(material);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}