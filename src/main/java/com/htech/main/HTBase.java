package com.htech.main;

import com.htech.crafting.HTCraftingManager;
import com.htech.init.HTBlocks;
import com.htech.init.HTItems;
import com.htech.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class HTBase
{
	@Instance(RefStrings.MODID)
	public static HTBase instance;
	
	@SidedProxy(clientSide=RefStrings.CLIENT, serverSide=RefStrings.SERVER)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabHtech = new CreativeTabs("tabHtech") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.coal;
	    }
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		HTItems.preInit();
		HTBlocks.preInit();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	HTItems.init();
    	HTBlocks.init();
    	HTCraftingManager.init();
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    	if(event.getSide() == Side.CLIENT)
    	{
    		HTItems.postInit();
    		HTBlocks.postInit();
    	}
    	
    }
}