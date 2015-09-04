package com.htech.items;

import java.lang.reflect.Field;

import com.htech.lib.RefStrings;
import com.htech.main.HTMain;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLeadIngot extends Item {
	
	private final String name = "leadingot";
	public ItemLeadIngot(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTMain.tabHtech);
	}
	public String getName(){
		return name;
	}
}