package com.htech.items;

import com.htech.lib.RefStrings;
import com.htech.main.HTMain;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzeIngot extends Item {

	private final String name = "bronzeingot";
	public ItemBronzeIngot(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTMain.tabHtech);
	}
	public String getName(){
		return name;
	}
}