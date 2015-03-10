package com.htech.base.init;

import com.htech.base.items.*;
import com.htech.base.items.armor.*;
import com.htech.base.items.tools.*;
import com.htech.base.lib.BaseMaterials;
import com.htech.base.lib.RefStringsBase;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.SidedProxy;
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
        bronzeSword = new ToolBronzeSword(BaseMaterials.BronzeTool);
        bronzePickaxe = new ToolBronzePickaxe(BaseMaterials.BronzeTool);
        bronzeSpade = new ToolBronzeSpade(BaseMaterials.BronzeTool);
        bronzeAxe = new ToolBronzeAxe(BaseMaterials.BronzeTool);
        bronzeHoe = new ToolBronzeHoe(BaseMaterials.BronzeTool);
    	    
        //armor
        bronzeHelmet = new BronzeArmor(BaseMaterials.BronzeArmor, 0, "bronzehelmet");
        bronzeChestplate = new BronzeArmor(BaseMaterials.BronzeArmor, 1, "bronzechestplate");
        bronzeLeggings = new BronzeArmor(BaseMaterials.BronzeArmor, 2, "bronzeleggings");
        bronzeBoots = new BronzeArmor(BaseMaterials.BronzeArmor, 3, "bronzeboots");
    }
    
    public static void registerOreDict(){
    	
    }
	
    public static void renderItems(){
    	
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	
    	//items
    	renderItem.getItemModelMesher().register(leadIngot, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ItemLeadIngot) leadIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(copperIngot, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ItemCopperIngot) copperIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(tinIngot, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ItemTinIngot) tinIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(zincIngot, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ItemZincIngot) zincIngot).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeIngot, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ItemBronzeIngot) bronzeIngot).getName(), "inventory"));
    	
    	//tools
    	renderItem.getItemModelMesher().register(bronzeSword, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ToolBronzeSword) bronzeSword).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzePickaxe, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ToolBronzePickaxe) bronzePickaxe).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeSpade, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ToolBronzeSpade) bronzeSpade).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeAxe, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ToolBronzeAxe) bronzeAxe).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeHoe, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + ((ToolBronzeHoe) bronzeHoe).getName(), "inventory"));
    	
    	//armor
    	renderItem.getItemModelMesher().register(bronzeHelmet, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + "bronzehelmet", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeChestplate, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + "bronzechestplate", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeLeggings, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + "bronzeleggings", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeBoots, 0, new ModelResourceLocation(RefStringsBase.MODIDBASE + ":" + "bronzeboots", "inventory"));
    }
	
}