package TheGamersCo.Core;

import TheGamersCo.Block.GamersCoLogoBlock;
import TheGamersCo.Block.InvisBlock;
import TheGamersCo.Block.OreBlockSlab;
import TheGamersCo.Block.StandardSlab;
import TheGamersCo.Block.WoolSlab;
import TheGamersCo.Gui.Tab;
import TheGamersCo.Handlers.GUIHandler;
import TheGamersCo.Item.ItemInvisBlock;
import TheGamersCo.Proxys.CommonProxy;
import TheGamersCo.Registers.BlockRegister;
import TheGamersCo.Registers.CreativeTabRegister;
import TheGamersCo.Registers.LanguageRegister;
import TheGamersCo.Registers.RecipeRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod( modid = "TheGamersCo", name="The Gamers Co Mod", version = "0.9")
@NetworkMod(clientSideRequired = true,serverSideRequired = false)

public class Core
{   
	
	public static Block whiteWoolSlab, orangeWoolSlab, magnetaWoolSlab, lightBlueWoolSlab, yellowWoolSlab, limeWoolSlab, pinkWoolSlab, greyWoolSlab, lightGreyWoolSlab, cyanWoolSlab, purpleWoolSlab, blueWoolSlab, brownWoolSlab, greenWoolSlab, redWoolSlab, blackWoolSlab;
	public static Block whiteWoolDoubleSlab;
	public static Block ironBlockSlab, goldBlockSlab, diamondBlockSlab, emeraldBlockSlab, lapizBlockSlab;
	public static Block glowstoneSlab, obsidianSlab, netherrackSlab, snowSlab, mossyCobbleSlab, soulSandSlab, claySlab;
	public static Block invisBlock, GamersCoLogo;
	
	public static Item invisBlockItem;
	public static CreativeTabs theGamersCoTab;
	
	public static int whiteWoolSlabID, orangeWoolSlabID, magnetaWoolSlabID, lightBlueWoolSlabID, yellowWoolSlabID, limeWoolSlabID, pinkWoolSlabID, greyWoolSlabID, lightGreyWoolSlabID, cyanWoolSlabID, purpleWoolSlabID, blueWoolSlabID, brownWoolSlabID, greenWoolSlabID, redWoolSlabID, blackWoolSlabID;
	public static int ironBlockSlabID, goldBlockSlabID, diamondBlockSlabID, emeraldBlockSlabID, lapizBlockSlabID; 
	public static int glowstoneSlabID, obsidianSlabID, netherrackSlabID, snowSlabID, mossyCobbleSlabID, soulSandSlabID, claySlabID;
	
	public static int invisBlockID, invisBlockItemID, gamersCoLogoID;
	
	public static GUIHandler guiHandler = new GUIHandler();
	
	//public static final Achievement invisAchievement = new Achievement(2001, "Shhh Don't Tell Anyone!", 1, -2, invisBlockItem, AchievementList.buildWorkBench);
	public static AchievementPage theGamersCoPage = new AchievementPage("The Gamers Co");
@SidedProxy(clientSide = "TheGamersCo.Proxys.ClientProxy", serverSide = "TheGamersCo.Proxys.CommonProxy")
public static CommonProxy proxy; 
@Instance
public static Core instance; 
@PreInit
public void preInit(FMLPreInitializationEvent event) {
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	config.load();
	whiteWoolSlabID = config.getBlock("White Wool Slab", 2800).getInt();
	orangeWoolSlabID = config.getBlock("Orange Wool Slab", 2801).getInt();
	magnetaWoolSlabID = config.getBlock("Magneta Wool Slab", 2802).getInt();
	lightBlueWoolSlabID = config.getBlock("Light Blue Wool Slab", 2803).getInt();
	yellowWoolSlabID = config.getBlock("Yellow Wool Slab", 2804).getInt();
	limeWoolSlabID = config.getBlock("Lime Wool Slab", 2805).getInt();
	pinkWoolSlabID = config.getBlock("Pink Wool Slab", 2806).getInt();
	greyWoolSlabID = config.getBlock("Grey Wool Slab", 2807).getInt();
	lightGreyWoolSlabID = config.getBlock("Light Grey Wool Slab", 2808).getInt();
	cyanWoolSlabID = config.getBlock("Cyan Wool Slab", 2809).getInt();
	purpleWoolSlabID = config.getBlock("Purple Wool Slab", 2810).getInt();
	blueWoolSlabID = config.getBlock("Blue Wool Slab", 2811).getInt();
	brownWoolSlabID = config.getBlock("Brown Wool Slab", 2812).getInt();
	greenWoolSlabID = config.getBlock("Green Wool Slab", 2813).getInt();
	redWoolSlabID = config.getBlock("Red Wool Slab", 2814).getInt();
	blackWoolSlabID = config.getBlock("Black Wool Slab", 2815).getInt();
	
	ironBlockSlabID = config.getBlock("Iron Block Slab", 2816).getInt();
	goldBlockSlabID = config.getBlock("Gold Block Slab", 2817).getInt();
	diamondBlockSlabID = config.getBlock("Diamond Block Slab", 2818).getInt();
	emeraldBlockSlabID = config.getBlock("Emerald Block Slab", 2819).getInt();
	lapizBlockSlabID = config.getBlock("Lapiz Block Slab", 2820).getInt();
	
	glowstoneSlabID = config.getBlock("Glowstone Slab", 2823).getInt();
	obsidianSlabID = config.getBlock("Obsidian Slab", 2824).getInt();
	netherrackSlabID = config.getBlock("Netherrack Slab", 2825).getInt();
	snowSlabID = config.getBlock("Snow Slab", 2826).getInt();
	mossyCobbleSlabID = config.getBlock("Mossy Cobblestone Slab", 2827).getInt();
	soulSandSlabID = config.getBlock("Soulsand Slab", 2828).getInt();
	claySlabID = config.getBlock("Clay Slab", 2829).getInt();
	
	invisBlockID = config.getBlock("Invisible Block", 2821).getInt();
	invisBlockItemID = config.getItem("Invisible Block Item", 3000).getInt();
	gamersCoLogoID = config.getBlock("Gamers Co Manual", 2822).getInt();
	config.save();
	System.out.println("[TheGamersCo] Successfully loaded Config File For The Gamers Co Mod");
}
@Init
public void load(FMLInitializationEvent evt) {
  AchievementPage.registerAchievementPage(theGamersCoPage);
  NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
  instance = this;
  proxy.registerRenderInformation();
  defineWoolSlabs();
  defineOreBlockSlabs();
  defineMiscSlabs();
  defineNewCreativeTabs();
  defineGeneralThings();
  BlockRegister.registerAllBlocks();
  LanguageRegister.registerAllNames();
  CreativeTabRegister.setAllCreativeTabs();
  RecipeRegister.addAllRecipes();
 
  }
public void defineNewCreativeTabs() {
	theGamersCoTab = new Tab(CreativeTabs.getNextID(), "deco", 0, whiteWoolSlab.blockID);
}
public void defineWoolSlabs() {
	whiteWoolDoubleSlab = new WoolSlab(2799, true, Material.cloth, 64).setBlockName("WhiteWoolSlab");
	  whiteWoolSlab = new WoolSlab(whiteWoolSlabID, false, Material.cloth, 64).setBlockName("WhiteWoolSlab");
	  orangeWoolSlab = new WoolSlab(orangeWoolSlabID, false, Material.cloth, 210).setBlockName("OrangeWoolSlab");
	  magnetaWoolSlab = new WoolSlab(magnetaWoolSlabID, false, Material.cloth, 194).setBlockName("MagnetaWoolSlab");
	  lightBlueWoolSlab = new WoolSlab(lightBlueWoolSlabID, false, Material.cloth, 178).setBlockName("LightBlueWoolSlab");
	  yellowWoolSlab = new WoolSlab(yellowWoolSlabID, false, Material.cloth, 162).setBlockName("YellowWoolSlab");
	  limeWoolSlab = new WoolSlab(limeWoolSlabID, false, Material.cloth, 146).setBlockName("LimeWoolSlab");
	  pinkWoolSlab = new WoolSlab(pinkWoolSlabID, false, Material.cloth, 130).setBlockName("PinkWoolSlab");
	  greyWoolSlab = new WoolSlab(greyWoolSlabID, false, Material.cloth, 114).setBlockName("GreyWoolSlab");
	  lightGreyWoolSlab = new WoolSlab(lightGreyWoolSlabID, false, Material.cloth, 225).setBlockName("LightGreyWoolSlab");
	  cyanWoolSlab = new WoolSlab(cyanWoolSlabID, false, Material.cloth, 209).setBlockName("CyanWoolSlab");
	  purpleWoolSlab = new WoolSlab(purpleWoolSlabID, false, Material.cloth, 193).setBlockName("PurpleWoolSlab");
	  blueWoolSlab = new WoolSlab(blueWoolSlabID, false, Material.cloth, 177).setBlockName("BlueWoolSlab");
	  brownWoolSlab = new WoolSlab(brownWoolSlabID, false, Material.cloth, 161).setBlockName("BrownWoolSlab");
	  greenWoolSlab = new WoolSlab(greenWoolSlabID, false, Material.cloth, 145).setBlockName("GreenWoolSlab");
	  redWoolSlab = new WoolSlab(redWoolSlabID, false, Material.cloth, 129).setBlockName("RedWoolSlab");
	  blackWoolSlab = new WoolSlab(blackWoolSlabID, false, Material.cloth, 113).setBlockName("BlackWoolSlab");
}
public void defineOreBlockSlabs() {
	ironBlockSlab = new OreBlockSlab(ironBlockSlabID, false, Material.rock, 22).setBlockName("IronBlockSlab");
	goldBlockSlab = new OreBlockSlab(goldBlockSlabID, false, Material.rock, 23).setBlockName("GoldBlockSlab");
	diamondBlockSlab = new OreBlockSlab(diamondBlockSlabID, false, Material.rock, 24).setBlockName("DiamondBlockSlab");
	emeraldBlockSlab = new OreBlockSlab(emeraldBlockSlabID, false, Material.rock, 25).setBlockName("EmeraldBlockSlab");
	lapizBlockSlab = new OreBlockSlab(lapizBlockSlabID, false, Material.rock, 144).setBlockName("LapizBlockSlab");
}
public void defineMiscSlabs() {
	glowstoneSlab = new StandardSlab(glowstoneSlabID, false, Material.rock, 105, true, false, false).setBlockName("glowstoneSlab");
	obsidianSlab = new StandardSlab(obsidianSlabID, false, Material.rock, 37, false, false, false).setBlockName("obsidianSlab");
	netherrackSlab = new StandardSlab(netherrackSlabID, false, Material.rock, 103, false, false, false).setBlockName("netherrackSlab");
	snowSlab = new StandardSlab(snowSlabID, false, Material.snow, 66, false, false, false).setBlockName("snowSlab");
	mossyCobbleSlab = new StandardSlab(mossyCobbleSlabID, false, Material.rock, 36, false, false, false).setBlockName("mossyCobbleSlab");
	soulSandSlab = new StandardSlab(soulSandSlabID, false, Material.grass, 104, false, true, false).setBlockName("soulSandSlab");
	claySlab = new StandardSlab(claySlabID, false, Material.clay, 72, false, false, false).setBlockName("claySlab");
}
public void defineGeneralThings() {
	invisBlockItem = new ItemInvisBlock(invisBlockItemID).setItemName("ItemInvisBlock");
	GamersCoLogo = new GamersCoLogoBlock(gamersCoLogoID, 0, Material.rock).setBlockName("GamersCoLogo");
	invisBlock = new InvisBlock(invisBlockID, 0, Material.glass, "/TheGamersCoImages/Block.png", false).setBlockName("InvisBlock");
}




}