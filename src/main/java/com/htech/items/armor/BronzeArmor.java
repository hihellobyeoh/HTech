package com.htech.items.armor;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BronzeArmor extends ItemArmor {
	
	public BronzeArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
		
		
	}
		
	/*@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == HTBase.bronzeHelmet)
		{
			return RefStrings.MODID + ":models/armor/bronze_layer_1";
		}else if(stack.getItem() == HTBase.bronzeChestplate)
		{
			return RefStrings.MODID + ":models/armor/bronze_layer_1";
		}else if(stack.getItem() == HTBase.bronzeBoots)
		{
			return RefStrings.MODID + ":models/armor/bronze_layer_1";
		}else if(stack.getItem() == HTBase.bronzeLeggings)
		{
			return RefStrings.MODID + ":models/armor/bronze_layer_2";
		}
		else{
			System.out.println(stack.getItem() + " has a missing texture.");
			return null;
		}
	}*/
}