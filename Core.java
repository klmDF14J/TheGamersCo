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
	
	public static Block whiteWoolSlab, orangeWoolSlab, magnetaWoolSlab, lightBlueWoolSlab, yellowWoolSlab, limeWoolSlab, pinkWoolSlab, greyWoolSlab, lightGreyWoolSlab, cyanWoolSlab, purpleWoolSlab, blueWoolSlab, brownWoolSlab, greenWoolSlab, redWoolSlab, blackWoolSlab;
	public static Block ironBlockSlab, goldBlockSlab, diamondBlockSlab, emeraldBlockSlab, lapizBlockSlab;
	public static CreativeTabs theGamersCoTabDeco;
	public static int whiteWoolSlabID, orangeWoolSlabID, magnetaWoolSlabID, lightBlueWoolSlabID, yellowWoolSlabID, limeWoolSlabID, pinkWoolSlabID, greyWoolSlabID, lightGreyWoolSlabID, cyanWoolSlabID, purpleWoolSlabID, blueWoolSlabID, brownWoolSlabID, greenWoolSlabID, redWoolSlabID, blackWoolSlabID;
	public static int ironBlockSlabID, goldBlockSlabID, diamondBlockSlabID, emeraldBlockSlabID, lapizBlockSlabID; 
@SidedProxy(clientSide = "TheGamersCo.ClientProxy", serverSide = "TheGamersCo.CommonProxy")
public static CommonProxy proxy; 
@Instance
public static Core instance; 

@Init
public void load(FMLInitializationEvent evt)
  {
  proxy.registerRenderInformation();
  defineWoolSlabs();
  defineNewCreativeTabs();
  BlockRegister.registerAllBlocks();
  LanguageRegister.registerAllNames();
  CreativeTabRegister.setAllCreativeTabs();
  RecipeRegister.addAllRecipes();
 
  }
public void defineNewCreativeTabs() {
	theGamersCoTabDeco = new Tab(CreativeTabs.getNextID(), "deco", 0, whiteWoolSlab.blockID);
}
public void defineWoolSlabs() {
	  whiteWoolSlab = new WoolSlab(2800, false, Material.cloth, 64).setBlockName("WhiteWoolSlab");
	  orangeWoolSlab = new WoolSlab(2801, false, Material.cloth, 210).setBlockName("OrangeWoolSlab");
	  magnetaWoolSlab = new WoolSlab(2802, false, Material.cloth, 194).setBlockName("MagnetaWoolSlab");
	  lightBlueWoolSlab = new WoolSlab(2803, false, Material.cloth, 178).setBlockName("LightBlueWoolSlab");
	  yellowWoolSlab = new WoolSlab(2804, false, Material.cloth, 162).setBlockName("YellowWoolSlab");
	  limeWoolSlab = new WoolSlab(2805, false, Material.cloth, 146).setBlockName("LimeWoolSlab");
	  pinkWoolSlab = new WoolSlab(2806, false, Material.cloth, 130).setBlockName("PinkWoolSlab");
	  greyWoolSlab = new WoolSlab(2807, false, Material.cloth, 114).setBlockName("GreyWoolSlab");
	  lightGreyWoolSlab = new WoolSlab(2808, false, Material.cloth, 225).setBlockName("LightGreyWoolSlab");
	  cyanWoolSlab = new WoolSlab(2809, false, Material.cloth, 209).setBlockName("CyanWoolSlab");
	  purpleWoolSlab = new WoolSlab(2810, false, Material.cloth, 193).setBlockName("PurpleWoolSlab");
	  blueWoolSlab = new WoolSlab(2811, false, Material.cloth, 177).setBlockName("BlueWoolSlab");
	  brownWoolSlab = new WoolSlab(2812, false, Material.cloth, 161).setBlockName("BrownWoolSlab");
	  greenWoolSlab = new WoolSlab(2813, false, Material.cloth, 145).setBlockName("GreenWoolSlab");
	  redWoolSlab = new WoolSlab(2814, false, Material.cloth, 129).setBlockName("RedWoolSlab");
	  blackWoolSlab = new WoolSlab(2815, false, Material.cloth, 113).setBlockName("BlackWoolSlab");
}
public void defineOreBlockSlabs() {
	ironBlockSlab = new OreBlockSlab(2816, false, null, 0);
}




}