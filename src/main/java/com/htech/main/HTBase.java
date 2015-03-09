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
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
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
import com.htech.items.armor.BronzeArmor;
import com.htech.items.blocks.*;
import com.htech.items.tools.ToolBronzeAxe;
import com.htech.items.tools.ToolBronzeHoe;
import com.htech.items.tools.ToolBronzePickaxe;
import com.htech.items.tools.ToolBronzeSpade;
import com.htech.items.tools.ToolBronzeSword;
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
    
    //materials
    static ToolMaterial hTBronzeToolMaterial = EnumHelper.addToolMaterial("htbronzetoolmaterial", 2, 180, 5.0F, 1.5F, 17);
    /*static ArmorMaterial hTBronzeArmorMaterial = EnumHelper.addArmorMaterial("htbronzearmormaterial", null, 10, new int[]{2, 5, 4, 2}, 12);*/
    
    //blocks
    public static Block copperOre = new CopperOre();
    public static Block tinOre = new TinOre();
    public static Block leadOre = new LeadOre();
    public static Block zincOre = new ZincOre();
    
    public static Block copperBlock = new CopperBlock();
    public static Block tinBlock = new TinBlock();
    public static Block leadBlock = new LeadBlock();
    public static Block zincBlock = new ZincBlock();
    public static Block bronzeBlock = new BronzeBlock();
    
    //items
    public static Item copperIngot = new ItemCopperIngot();
    public static Item tinIngot = new ItemTinIngot();
    public static Item zincIngot = new ItemZincIngot();
    public static Item leadIngot = new ItemLeadIngot();
    public static Item bronzeIngot = new ItemBronzeIngot();
    
    //tools
    public static Item bronzeSword = new ToolBronzeSword(hTBronzeToolMaterial);
    public static Item bronzePickaxe = new ToolBronzePickaxe(hTBronzeToolMaterial);
    public static Item bronzeSpade = new ToolBronzeSpade(hTBronzeToolMaterial);
    public static Item bronzeAxe = new ToolBronzeAxe(hTBronzeToolMaterial);
    public static Item bronzeHoe = new ToolBronzeHoe(hTBronzeToolMaterial);
    
    //armor
   /* public static Item bronzeHelmet = new BronzeArmor(hTBronzeArmorMaterial, 0, "bronzehelmet");
    public static Item bronzeChestplate = new BronzeArmor(hTBronzeArmorMaterial, 1, "bronzechestplate");
    public static Item bronzeLeggings = new BronzeArmor(hTBronzeArmorMaterial, 2, "bronzeleggings");
    public static Item bronzeBoots = new BronzeArmor(hTBronzeArmorMaterial, 3, "bronzeboots");*/
    
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
    	/*renderItem.getItemModelMesher().register(bronzeHelmet, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzehelmet", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeChestplate, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzechestplate", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeLeggings, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeleggings", "inventory"));
    	renderItem.getItemModelMesher().register(bronzeBoots, 0, new ModelResourceLocation(RefStrings.MODID + ":" + "bronzeboots", "inventory"));
    	*/
    	//blocks
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperBlock) copperBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperOre) copperOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tinBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((TinBlock) tinBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tinOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((TinOre) tinOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(leadBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((LeadBlock) leadBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(leadOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((LeadOre) leadOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(zincBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ZincBlock) zincBlock).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(zincOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((ZincOre) zincOre).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(bronzeBlock), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((BronzeBlock) bronzeBlock).getName(), "inventory"));

    }
    
    
    
    public static void oreDictRegistry(){
    	//later
    }
    
}
