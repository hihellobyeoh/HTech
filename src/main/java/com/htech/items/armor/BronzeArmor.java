package com.htech.items.armor;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BronzeArmor extends ItemArmor {
	
	public BronzeArmor(ItemArmor.ArmorMaterial material, int armorType, String name)
	{
		
		super(material, 0, armorType);
		this.setCreativeTab(HTBase.tabHtech);
		this.setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
	}

	@Override
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type)
	{
		String textureName = String.format(RefStrings.MODID + ":textures/models/armor/%s_layer_%d%s.png",
				this.getArmorMaterial().getName(), (slot == 2 ? 2 : 1), type == null ? "" : String.format("_%s", type));
		return textureName;
	}
}