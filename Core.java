package TheGamersCo;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
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
	public static Block ironBlockSlab, goldBlockSlab, diamondBlockSlab, emeraldBlockSlab;
	public static CreativeTabs theGamersCoTabDeco;
@SidedProxy(clientSide = "TheGamersCo.ClientProxy", serverSide = "TheGamersCo.CommonProxy")
public static CommonProxy proxy; 
@Instance
public static Core instance; 

@Init
public void load(FMLInitializationEvent evt)
  {
  proxy.registerRenderInformation();
  test = new Item(400).setIconCoord(0, 0).setItemName("test");
  defineWoolSlabs();
  defineNewCreativeTabs();
  registerWoolSlabs();
  addNamesForWoolSlabs();
  setCreativeTabsForWoolSlabs();
  addRecipesForWoolSlabs();
  LanguageRegistry.addName(test, "Test");
  
  test.setCreativeTab(theGamersCoTabDeco);
 
  }
public void defineNewCreativeTabs() {
	theGamersCoTabDeco = new Tab(CreativeTabs.getNextID(), "deco", 0, whiteWoolSlab.blockID);
}
public void defineWoolSlabs() {
	  whiteWoolSlab = new WoolSlab(3000, false, Material.cloth, 64).setBlockName("WhiteWoolSlab");
	  orangeWoolSlab = new WoolSlab(3001, false, Material.cloth, 210).setBlockName("OrangeWoolSlab");
	  magnetaWoolSlab = new WoolSlab(3002, false, Material.cloth, 194).setBlockName("MagnetaWoolSlab");
	  lightBlueWoolSlab = new WoolSlab(3003, false, Material.cloth, 178).setBlockName("LightBlueWoolSlab");
	  yellowWoolSlab = new WoolSlab(3004, false, Material.cloth, 162).setBlockName("YellowWoolSlab");
	  limeWoolSlab = new WoolSlab(3005, false, Material.cloth, 146).setBlockName("LimeWoolSlab");
	  pinkWoolSlab = new WoolSlab(3006, false, Material.cloth, 130).setBlockName("PinkWoolSlab");
	  greyWoolSlab = new WoolSlab(3007, false, Material.cloth, 114).setBlockName("GreyWoolSlab");
	  lightGreyWoolSlab = new WoolSlab(3008, false, Material.cloth, 225).setBlockName("LightGreyWoolSlab");
	  cyanWoolSlab = new WoolSlab(3009, false, Material.cloth, 209).setBlockName("CyanWoolSlab");
	  purpleWoolSlab = new WoolSlab(3010, false, Material.cloth, 193).setBlockName("PurpleWoolSlab");
	  blueWoolSlab = new WoolSlab(3011, false, Material.cloth, 177).setBlockName("BlueWoolSlab");
	  brownWoolSlab = new WoolSlab(3012, false, Material.cloth, 161).setBlockName("BrownWoolSlab");
	  greenWoolSlab = new WoolSlab(3013, false, Material.cloth, 145).setBlockName("GreenWoolSlab");
	  redWoolSlab = new WoolSlab(3014, false, Material.cloth, 129).setBlockName("RedWoolSlab");
	  blackWoolSlab = new WoolSlab(3015, false, Material.cloth, 113).setBlockName("BlackWoolSlab");
}
public void defineOreBlockSlabs() {
	
}
public void setCreativeTabsForWoolSlabs() {
	 whiteWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  orangeWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  magnetaWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  lightBlueWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  yellowWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  limeWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  pinkWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  greyWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  lightGreyWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  cyanWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  purpleWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  blueWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  brownWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  greenWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  redWoolSlab.setCreativeTab(theGamersCoTabDeco);
	  blackWoolSlab.setCreativeTab(theGamersCoTabDeco);
}
public void registerWoolSlabs() {
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
}
public void addNamesForWoolSlabs() {
	LanguageRegistry.addName(whiteWoolSlab, "White Wool Slab");
	LanguageRegistry.addName(orangeWoolSlab, "Orange Wool Slab");
	LanguageRegistry.addName(magnetaWoolSlab, "Magneta Wool Slab");
	LanguageRegistry.addName(lightBlueWoolSlab, "Light Blue Wool Slab");
	LanguageRegistry.addName(yellowWoolSlab, "Yellow Wool Slab");
	LanguageRegistry.addName(limeWoolSlab, "Lime Wool Slab");
	LanguageRegistry.addName(pinkWoolSlab, "Pink Wool Slab");
	LanguageRegistry.addName(greyWoolSlab, "Grey Wool Slab");
	LanguageRegistry.addName(lightGreyWoolSlab, "Light Grey Wool Slab");
	LanguageRegistry.addName(cyanWoolSlab, "Cyan Wool Slab");
	LanguageRegistry.addName(purpleWoolSlab, "Purple Wool Slab");
	LanguageRegistry.addName(blueWoolSlab, "Blue Wool Slab");
	LanguageRegistry.addName(brownWoolSlab, "Brown Wool Slab");
	LanguageRegistry.addName(greenWoolSlab, "Green Wool Slab");
	LanguageRegistry.addName(redWoolSlab, "Red Wool Slab");
	LanguageRegistry.addName(blackWoolSlab, "Black Wool Slab");
}
public void addRecipesForWoolSlabs() {
	GameRegistry.addRecipe(new ItemStack(whiteWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 0)});
	GameRegistry.addRecipe(new ItemStack(orangeWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 1)});
	GameRegistry.addRecipe(new ItemStack(magnetaWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 2)});
	GameRegistry.addRecipe(new ItemStack(lightBlueWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 3)});
	GameRegistry.addRecipe(new ItemStack(yellowWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 4)});
	GameRegistry.addRecipe(new ItemStack(limeWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 5)});
	GameRegistry.addRecipe(new ItemStack(pinkWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 6)});
	GameRegistry.addRecipe(new ItemStack(greyWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 7)});
	GameRegistry.addRecipe(new ItemStack(lightGreyWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 8)});
	GameRegistry.addRecipe(new ItemStack(cyanWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 9)});
	GameRegistry.addRecipe(new ItemStack(purpleWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 10)});
	GameRegistry.addRecipe(new ItemStack(blueWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 11)});
	GameRegistry.addRecipe(new ItemStack(brownWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 12)});
	GameRegistry.addRecipe(new ItemStack(greenWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 13)});
	GameRegistry.addRecipe(new ItemStack(redWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 14)});
	GameRegistry.addRecipe(new ItemStack(blackWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 152)});
}
}