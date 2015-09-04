package com.htech.items.tools;

import com.htech.lib.RefStrings;
import com.htech.main.HTMain;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBronzePickaxe extends ItemPickaxe {

	public ToolBronzePickaxe(String unlocalizedName, ToolMaterial material){
		
		super(material);
		this.setCreativeTab(HTMain.tabHtech);
		this.setUnlocalizedName(unlocalizedName);
	}
	public String getName() {
		return getUnlocalizedName();
	}
}