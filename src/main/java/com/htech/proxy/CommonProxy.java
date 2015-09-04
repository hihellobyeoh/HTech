package com.htech.proxy;

import com.htech.crafting.HTCraftingManager;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class CommonProxy {
	
	public void init(FMLInitializationEvent e) {
		HTCraftingManager.init();
	}
}
