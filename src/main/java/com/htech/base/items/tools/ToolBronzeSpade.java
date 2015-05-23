package com.htech.base.items.tools;

import com.htech.base.lib.RefStringsBase;
import com.htech.base.main.HTBase;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzeSpade extends ItemSpade {

	public ToolBronzeSpade(String unlocalizedName, ToolMaterial material){
		
		super(material);
		this.setCreativeTab(HTBase.tabHtech);
		this.setUnlocalizedName(unlocalizedName);
	}
	public String getName() {
		return getUnlocalizedName();
	}
}