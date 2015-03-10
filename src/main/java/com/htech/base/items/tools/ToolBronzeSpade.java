package com.htech.base.items.tools;

import com.htech.base.lib.RefStrings;
import com.htech.base.main.HTBase;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzeSpade extends ItemSpade {
	
	private final String name = "bronzespade";
	public ToolBronzeSpade(ToolMaterial material){
		
		super(material);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODIDBASE + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}