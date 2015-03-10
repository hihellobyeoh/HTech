package com.htech.base.items;

import com.htech.base.lib.RefStringsBase;
import com.htech.base.main.HTBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTinIngot extends Item {
	
	private final String name = "tiningot";
	public ItemTinIngot(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStringsBase.MODIDBASE + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}