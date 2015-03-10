package com.htech.base.init;

import com.htech.base.items.blocks.*;
import com.htech.base.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class HTBlocks {

	public static void preInit(){
		registerBlocks();
	}
	
	public static void init(){
		registerOreDict();
	}
	
	public static void postInit(){
		renderBlocks();
	}
	
	
    //ores
    public static Block copperOre;
    public static Block tinOre;
    public static Block leadOre;
    public static Block zincOre;
    
    //metal blocks
    public static Block copperBlock;
    public static Block tinBlock;
    public static Block leadBlock;
    public static Block zincBlock;
    public static Block bronzeBlock;
	
    public static void registerBlocks(){
    	
    	//ores
    	copperOre = new CopperOre();
        tinOre = new TinOre();
        leadOre = new LeadOre();
        zincOre = new ZincOre();
    	
        //metal blocks
        copperBlock = new CopperBlock();
        tinBlock = new TinBlock();
        leadBlock = new LeadBlock();
        zincBlock = new ZincBlock();
        bronzeBlock = new BronzeBlock();
    }
    
    public static void registerOreDict(){
    	
    }
    
    public static void renderBlocks(){
    	
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	
    	//blocks
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperBlock), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((CopperBlock) copperBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperOre), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((CopperOre) copperOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tinBlock), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((TinBlock) tinBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tinOre), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((TinOre) tinOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(leadBlock), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((LeadBlock) leadBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(leadOre), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((LeadOre) leadOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(zincBlock), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((ZincBlock) zincBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(zincOre), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((ZincOre) zincOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(bronzeBlock), 0, new ModelResourceLocation(RefStrings.MODIDBASE + ":" + ((BronzeBlock) bronzeBlock).getName(), "inventory"));
    }
	
}
