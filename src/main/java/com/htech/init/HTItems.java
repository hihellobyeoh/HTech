package com.htech.init;

import com.htech.items.*;
import com.htech.items.armor.*;
import com.htech.items.tools.*;
import com.htech.lib.HTechMats;
import com.htech.lib.RefStrings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.entity.RenderItem;


public class HTItems {

	public static void preInit(){
		registerItems();
	}
	
	public static void init(){
		registerOreDict();
	}
	
	public static void postInit(){
		renderItems();
	}
	
	//ingots
    public static Item copperIngot;
    public static Item tinIngot;
    public static Item zincIngot;
    public static Item leadIngot;
    public static Item bronzeIngot;
    
    //tools
    public static Item bronzeSword;
    public static Item bronzePickaxe;
    public static Item bronzeSpade;
    public static Item bronzeAxe;
    public static Item bronzeHoe;
    
    //armor
    public static Item bronzeHelmet;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;
    
    public static void registerItems(){
    	
    	//ingots
        copperIngot = new ItemCopperIngot();
        tinIngot = new ItemTinIngot();
        leadIngot = new ItemLeadIngot();
        zincIngot = new ItemZincIngot();
        bronzeIngot = new ItemBronzeIngot();
    	    
        //tools
        GameRegistry.registerItem(bronzeSword = new ToolBronzeSword(RefStrings.MODID + "_" + "bronzesword", HTechMats.BronzeTool), "bronzesword");
        GameRegistry.registerItem(bronzePickaxe = new ToolBronzePickaxe(RefStrings.MODID + "_" + "bronzepickaxe", HTechMats.BronzeTool), "bronzepickaxe");
        GameRegistry.registerItem(bronzeAxe = new ToolBronzeAxe(RefStrings.MODID + "_" + "bronzeaxe", HTechMats.BronzeTool), "bronzeaxe");
        GameRegistry.registerItem(bronzeSpade = new ToolBronzeSpade(RefStrings.MODID + "_" + "bronzespade", HTechMats.BronzeTool), "bronzespade");
        GameRegistry.registerItem(bronzeHoe = new ToolBronzeHoe(RefStrings.MODID + "_" + "bronzehoe", HTechMats.BronzeTool), "bronzehoe");
         
        //armor
        GameRegistry.registerItem(bronzeHelmet = new BronzeArmor("bronzehelmet", HTechMats.BronzeArmor, 1, 0), "bronzehelmet");
        GameRegistry.registerItem(bronzeChestplate = new BronzeArmor("bronzechestplate", HTechMats.BronzeArmor, 1, 1), "bronzechestplate");
        GameRegistry.registerItem(bronzeLeggings = new BronzeArmor("bronzeleggings", HTechMats.BronzeArmor, 2, 2), "bronzeleggings");
        GameRegistry.registerItem(bronzeBoots = new BronzeArmor("bronzeboots", HTechMats.BronzeArmor, 1, 3), "bronzeboots");
    }
    
    public static void registerOreDict(){
    	
    }
	
    public static void renderItems(){
    	
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	
    	//items
    	renderItem.getItemModelMesher().register(leadIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ItemLeadIngot) leadIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(copperIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ItemCopperIngot) copperIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(tinIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ItemTinIngot) tinIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(zincIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ItemZincIngot) zincIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ItemBronzeIngot) bronzeIngot).getName(), "inventory"));
    	
    	//tools
    	renderItem.getItemModelMesher().register(bronzeSword, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzesword", "inventory"));
    	renderItem.getItemModelMesher().register(bronzePickaxe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzepickaxe", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeSpade, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzespade", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeAxe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeaxe", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeHoe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzehoe", "inventory"));
    	
    	//armor
    	renderItem.getItemModelMesher().register(bronzeHelmet, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzehelmet", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeChestplate, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzechestplate", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeLeggings, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeleggings", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeBoots, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeboots", "inventory"));
    }
	
}
