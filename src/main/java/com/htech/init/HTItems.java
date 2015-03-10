package com.htech.init;

import com.htech.items.ItemBronzeIngot;
import com.htech.items.ItemCopperIngot;
import com.htech.items.ItemLeadIngot;
import com.htech.items.ItemTinIngot;
import com.htech.items.ItemZincIngot;
import com.htech.items.armor.BronzeArmor;
import com.htech.items.tools.ToolBronzeAxe;
import com.htech.items.tools.ToolBronzeHoe;
import com.htech.items.tools.ToolBronzePickaxe;
import com.htech.items.tools.ToolBronzeSpade;
import com.htech.items.tools.ToolBronzeSword;
import com.htech.lib.Materials;
import com.htech.lib.RefStrings;

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
        bronzeSword = new ToolBronzeSword(Materials.BronzeTool);
        bronzePickaxe = new ToolBronzePickaxe(Materials.BronzeTool);
        bronzeSpade = new ToolBronzeSpade(Materials.BronzeTool);
        bronzeAxe = new ToolBronzeAxe(Materials.BronzeTool);
        bronzeHoe = new ToolBronzeHoe(Materials.BronzeTool);
    	    
        //armor
        bronzeHelmet = new BronzeArmor(Materials.BronzeArmor, 0, "bronzehelmet");
        bronzeChestplate = new BronzeArmor(Materials.BronzeArmor, 1, "bronzechestplate");
        bronzeLeggings = new BronzeArmor(Materials.BronzeArmor, 2, "bronzeleggings");
        bronzeBoots = new BronzeArmor(Materials.BronzeArmor, 3, "bronzeboots");
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
    	renderItem.getItemModelMesher().register(bronzeSword, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ToolBronzeSword) bronzeSword).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzePickaxe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ToolBronzePickaxe) bronzePickaxe).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeSpade, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ToolBronzeSpade) bronzeSpade).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeAxe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ToolBronzeAxe) bronzeAxe).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(bronzeHoe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ToolBronzeHoe) bronzeHoe).getName(), "inventory"));
    	
    	//armor
    	renderItem.getItemModelMesher().register(bronzeHelmet, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzehelmet", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeChestplate, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzechestplate", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeLeggings, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeleggings", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeBoots, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeboots", "inventory"));
    }
	
}
