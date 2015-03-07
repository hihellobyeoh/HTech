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

import com.htech.crafting.HTCraftingManager;
import com.htech.items.*;
import com.htech.items.blocks.*;
import com.htech.lib.RefStrings;


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
		this.oreDictRegistry();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	HTCraftingManager.mainRegistry();
    	
    	if(event.getSide() == Side.CLIENT)
    	{
    		this.renderItems();
    	}
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
    
    //items
    public static Item copperIngot = new CopperIngot();
    public static Item tinIngot = new TinIngot();
    public static Item zincIngot = new ZincIngot();
    public static Item leadIngot = new LeadIngot();
    
    //blocks
    public static Block copperBlock = new CopperBlock();
    public static Block copperOre = new CopperOre();
    public static Block tinBlock = new TinBlock();
    public static Block tinOre = new TinOre();
    public static Block zincBlock = new ZincBlock();
    public static Block zincOre = new ZincOre();
    public static Block leadBlock = new LeadBlock();
    public static Block leadOre = new LeadOre();
    
    public static void renderItems(){
    	
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	
    	renderItem.getItemModelMesher().register(leadIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((LeadIngot) leadIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(copperIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperIngot) copperIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(tinIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((TinIngot) tinIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(zincIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ZincIngot) zincIngot).getName(), "inventory"));
    	
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperBlock) copperBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperOre) copperOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tinBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((TinBlock) tinBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tinOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((TinOre) tinOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(leadBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((LeadBlock) leadBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(leadOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((LeadOre) leadOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(zincBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ZincBlock) zincBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(zincOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ZincOre) zincOre).getName(), "inventory"));

    }
    
    
    
    public static void oreDictRegistry(){
    	//later
    }
    
}
