package com.htech.mech.main;

import com.htech.mech.lib.RefStringsMech;
import com.htech.proxy.CommonProxy;

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


@Mod(modid = RefStringsMech.MODIDMECH, name = RefStringsMech.NAMEMECH, version = RefStringsMech.VERSION)
public class HTMech{
	
	@Instance(RefStringsMech.MODIDMECH)
	public static HTMech instance;
	
	@SidedProxy(clientSide=RefStringsMech.CLIENTMECH, serverSide=RefStringsMech.SERVERMECH)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabHTechMech = new CreativeTabs("tabHTechMech") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.coal;
	    }
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
}