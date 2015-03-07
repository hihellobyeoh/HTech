package com.htech.main;

import java.lang.reflect.Field;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
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

import com.htech.items.*;
import com.htech.items.blocks.*;
import com.htech.lib.RefStrings;


@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry
{
	@Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
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
		this.mystuff();
		this.oreDictRegistry();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	if(event.getSide() == Side.CLIENT)
    	{
    		this.renderItems();
    	}
    	Field[] fields = MainRegistry.class.getDeclaredFields();
    	//gives no of fields
    	System.out.println(fields.length);         
    	for (Field field : fields) {
    	    //gives the names of the fields
    	    System.out.println(field.getName());   
    	}
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
		
    public static void mystuff(){
    	    	    	
    }
    
    public static void renderItems(){
    	
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	
    	//renderItem.getItemModelMesher().register(coalDust, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CoalDust) coalDust).getName(), "inventory"));

    }
    
    
    
    public static void oreDictRegistry(){
    	//later
    }
    
}
