package TheGamersCo.Core;

import TheGamersCo.Block.Blocks;
import TheGamersCo.Block.GamersCoLogoBlock;
import TheGamersCo.Block.InvisBlock;
import TheGamersCo.Block.OreBlockSlab;
import TheGamersCo.Block.StandardSlab;
import TheGamersCo.Block.WoolSlab;
import TheGamersCo.Gui.StandardTab;
import TheGamersCo.Handlers.ConfigHandler;
import TheGamersCo.Handlers.GUIHandler;
import TheGamersCo.Item.ItemInvisBlock;
import TheGamersCo.Item.Items;
import TheGamersCo.Proxys.CommonProxy;
import TheGamersCo.Registers.BlockRegister;
import TheGamersCo.Registers.CreativeTabRegister;
import TheGamersCo.Registers.LanguageRegister;
import TheGamersCo.Registers.RecipeRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.IPlayerTracker;
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
	
	
	
	public static CreativeTabs theGamersCoTab;
	
	
	
	
	
	public static GUIHandler guiHandler = new GUIHandler();
	
	//public static final Achievement invisAchievement = new Achievement(2001, "Shhh Don't Tell Anyone!", 1, -2, invisBlockItem, AchievementList.buildWorkBench);
	public static AchievementPage theGamersCoPage = new AchievementPage("The Gamers Co");
@SidedProxy(clientSide = "TheGamersCo.Proxys.ClientProxy", serverSide = "TheGamersCo.Proxys.CommonProxy")
public static CommonProxy proxy; 
@Instance
public static Core instance; 
@PreInit
public void preInit(FMLPreInitializationEvent event) {
	ConfigHandler.config(event);
}
@Init
public void load(FMLInitializationEvent evt) {
  AchievementPage.registerAchievementPage(theGamersCoPage);
  NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
  instance = this;
  proxy.registerRenderInformation();
  VersionChecker.isVersionUpToDate("0.8");
  Blocks.defineAll();
  Items.defineAll();
  BlockRegister.registerAllBlocks();
  LanguageRegister.registerAllNames();
  CreativeTabRegister.setAllCreativeTabs();
  RecipeRegister.addAllRecipes();
  
  }











}