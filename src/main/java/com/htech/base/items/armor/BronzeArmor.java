package com.htech.base.items.armor;

import com.htech.base.lib.RefStringsBase;
import com.htech.base.main.HTBase;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BronzeArmor extends ItemArmor {

	    public BronzeArmor(String name, ArmorMaterial material, int renderIndex, int armorType) {
	        super(material, renderIndex, armorType);
	        
	        this.setCreativeTab(HTBase.tabHtech);
	        this.setUnlocalizedName(name);
	    }
}
