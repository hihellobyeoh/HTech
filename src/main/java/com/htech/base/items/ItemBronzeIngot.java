package com.htech.base.items;

import com.htech.base.lib.RefStrings;
import com.htech.base.main.HTBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzeIngot extends Item {

	private final String name = "bronzeingot";
	public ItemBronzeIngot(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODIDBASE + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	public String getName(){
		return name;
	}
}