package com.htech.base.lib;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BaseMaterials {

	//tools
	public static ToolMaterial BronzeTool = EnumHelper.addToolMaterial("bronzetool", 2, 180, 5.0F, 1.5F, 17);
	
	//armor
    public static ArmorMaterial BronzeArmor = EnumHelper.addArmorMaterial("bronzearmor", "bronzearmor", 10, new int[]{2, 5, 4, 2}, 12);
	
}
