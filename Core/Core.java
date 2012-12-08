package TheGamersCo;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod( modid = "TheGamersCo", name="The Gamers Co Mod", version="0.1")
@NetworkMod(clientSideRequired = true,serverSideRequired = false)
public class Core
{       
	public static Item test;
	public static Block whiteWoolSlab, orangeWoolSlab, magnetaWoolSlab, lightBlueWoolSlab, yellowWoolSlab, limeWoolSlab, pinkWoolSlab, greyWoolSlab, lightGreyWoolSlab, cyanWoolSlab, purpleWoolSlab, blueWoolSlab, brownWoolSlab, greenWoolSlab, redWoolSlab, blackWoolSlab;

@SidedProxy(clientSide = "TheGamersCo.ClientProxy", serverSide = "TheGamersCo.CommonProxy")
public static CommonProxy proxy; 
@Instance
public static Core instance; 

@Init
public void load(FMLInitializationEvent evt)
  {
  proxy.registerRenderInformation();
  test = new Item(400).setIconCoord(0, 0).setItemName("test");
  whiteWoolSlab = new WoolSlab(3000, false, Material.cloth, 64).setBlockName("WhiteWoolSlab");
  orangeWoolSlab = new WoolSlab(3001, false, Material.cloth, 210).setBlockName("WhiteWoolSlab");
  magnetaWoolSlab = new WoolSlab(3002, false, Material.cloth, 194).setBlockName("WhiteWoolSlab");
  lightBlueWoolSlab = new WoolSlab(3003, false, Material.cloth, 178).setBlockName("WhiteWoolSlab");
  yellowWoolSlab = new WoolSlab(3004, false, Material.cloth, 162).setBlockName("WhiteWoolSlab");
  limeWoolSlab = new WoolSlab(3005, false, Material.cloth, 146).setBlockName("WhiteWoolSlab");
  pinkWoolSlab = new WoolSlab(3006, false, Material.cloth, 130).setBlockName("WhiteWoolSlab");
  greyWoolSlab = new WoolSlab(3007, false, Material.cloth, 114).setBlockName("WhiteWoolSlab");
  lightGreyWoolSlab = new WoolSlab(3008, false, Material.cloth, 225).setBlockName("WhiteWoolSlab");
  cyanWoolSlab = new WoolSlab(3009, false, Material.cloth, 209).setBlockName("WhiteWoolSlab");
  purpleWoolSlab = new WoolSlab(3010, false, Material.cloth, 193).setBlockName("WhiteWoolSlab");
  blueWoolSlab = new WoolSlab(3011, false, Material.cloth, 177).setBlockName("WhiteWoolSlab");
  brownWoolSlab = new WoolSlab(3012, false, Material.cloth, 161).setBlockName("WhiteWoolSlab");
  greenWoolSlab = new WoolSlab(3013, false, Material.cloth, 145).setBlockName("WhiteWoolSlab");
  redWoolSlab = new WoolSlab(3014, false, Material.cloth, 129).setBlockName("WhiteWoolSlab");
  blackWoolSlab = new WoolSlab(3015, false, Material.cloth, 113).setBlockName("WhiteWoolSlab");
  GameRegistry.registerBlock(whiteWoolSlab);
  GameRegistry.registerBlock(orangeWoolSlab);
  GameRegistry.registerBlock(magnetaWoolSlab);
  GameRegistry.registerBlock(lightBlueWoolSlab);
  GameRegistry.registerBlock(yellowWoolSlab);
  GameRegistry.registerBlock(limeWoolSlab);
  GameRegistry.registerBlock(pinkWoolSlab);
  GameRegistry.registerBlock(greyWoolSlab);
  GameRegistry.registerBlock(lightGreyWoolSlab);
  GameRegistry.registerBlock(cyanWoolSlab);
  GameRegistry.registerBlock(purpleWoolSlab);
  GameRegistry.registerBlock(blueWoolSlab);
  GameRegistry.registerBlock(brownWoolSlab);
  GameRegistry.registerBlock(greenWoolSlab);
  GameRegistry.registerBlock(redWoolSlab);
  GameRegistry.registerBlock(blackWoolSlab);
  LanguageRegistry.addName(test, "Test");
  LanguageRegistry.addName(whiteWoolSlab, "White Wool Slab");
  test.setCreativeTab(CreativeTabs.tabDecorations);
  whiteWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  orangeWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  magnetaWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  lightBlueWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  yellowWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  limeWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  pinkWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  greyWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  lightGreyWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  cyanWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  purpleWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  blueWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  brownWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  greenWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  redWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  blackWoolSlab.setCreativeTab(CreativeTabs.tabDecorations);
  }
}