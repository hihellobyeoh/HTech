package com.htech.items.armor;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BronzeArmor extends ItemArmor {
	
	public BronzeArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
		
	}
}