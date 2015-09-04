package com.htech.crafting;

import com.htech.init.HTBlocks;
import com.htech.init.HTItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class HTCraftingManager {

	public static void init(){
		//Example Shaped Crafting Recipe
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.tutorialItem});
		
		
		GameRegistry.addRecipe(new ItemStack(HTBlocks.copperBlock), new Object[] {"XXX", "XXX", "XXX", 'X', HTItems.copperIngot});
		GameRegistry.addRecipe(new ItemStack(HTBlocks.tinBlock), new Object[] {"XXX", "XXX", "XXX", 'X', HTItems.tinIngot});
		GameRegistry.addRecipe(new ItemStack(HTBlocks.bronzeBlock), new Object[] {"XXX", "XXX", "XXX", 'X', HTItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(HTBlocks.leadBlock), new Object[] {"XXX", "XXX", "XXX", 'X', HTItems.leadIngot});
		GameRegistry.addRecipe(new ItemStack(HTBlocks.zincBlock), new Object[] {"XXX", "XXX", "XXX", 'X', HTItems.zincIngot});
		
		GameRegistry.addRecipe(new ItemStack(HTItems.copperIngot,9), new Object[] {"X", 'X', HTBlocks.copperBlock});
		GameRegistry.addRecipe(new ItemStack(HTItems.tinIngot,9), new Object[] {"X", 'X', HTBlocks.tinBlock});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeIngot,9), new Object[] {"X", 'X', HTBlocks.bronzeBlock});
		GameRegistry.addRecipe(new ItemStack(HTItems.leadIngot,9), new Object[] {"X", 'X', HTBlocks.leadBlock});
		GameRegistry.addRecipe(new ItemStack(HTItems.zincIngot,9), new Object[] {"X", 'X', HTBlocks.zincBlock});
		
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeHelmet), new Object[] {"XXX", "X X", 'X', HTItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeChestplate), new Object[] {"X X", "XXX", "XXX",  'X', HTItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeLeggings), new Object[] {"XXX", "X X", "X X", 'X', HTItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeBoots), new Object[] {"X X", "X X", 'X', HTItems.bronzeIngot});
		
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzePickaxe), new Object[] {"XXX", " Z ", " Z ", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeAxe), new Object[] {"XX ", "XZ ", " Z ", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeAxe), new Object[] {" XX", " ZX", " Z ", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeSpade), new Object[] {"X", "Z", "Z", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeHoe), new Object[] {"XX ", " Z ", " Z ", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeHoe), new Object[] {" XX", " Z ", " Z ", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HTItems.bronzeSword), new Object[] {"X", "X", "Z", 'X', HTItems.bronzeIngot, 'Z', Items.stick});
		
	}	
}