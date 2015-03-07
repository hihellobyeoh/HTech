package com.htech.items;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemZincIngot extends Item {
	
	private final String name = "zincingot";
	public ItemZincIngot(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}