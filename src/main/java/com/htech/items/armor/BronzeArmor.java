package com.htech.items.armor;

import com.htech.lib.RefStrings;
import com.htech.main.HTMain;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BronzeArmor extends ItemArmor {

	    public BronzeArmor(String name, ArmorMaterial material, int renderIndex, int armorType) {
	        super(material, renderIndex, armorType);
	        
	        this.setCreativeTab(HTMain.tabHtech);
	        this.setUnlocalizedName(name);
	    }
}
