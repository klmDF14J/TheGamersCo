package TheGamersCo.Handlers;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static int whiteWoolSlabID, orangeWoolSlabID, magnetaWoolSlabID, lightBlueWoolSlabID, yellowWoolSlabID, limeWoolSlabID, pinkWoolSlabID, greyWoolSlabID, lightGreyWoolSlabID, cyanWoolSlabID, purpleWoolSlabID, blueWoolSlabID, brownWoolSlabID, greenWoolSlabID, redWoolSlabID, blackWoolSlabID;
	public static int ironBlockSlabID, goldBlockSlabID, diamondBlockSlabID, emeraldBlockSlabID, lapizBlockSlabID; 
	public static int glowstoneSlabID, obsidianSlabID, netherrackSlabID, snowSlabID, mossyCobbleSlabID, soulSandSlabID, claySlabID;
	public static int invisBlockID, invisBlockItemID, gamersCoLogoID;
	public static boolean enableDebug;
	public static void config(FMLPreInitializationEvent event) {
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
	
	enableDebug = config.get(Configuration.CATEGORY_GENERAL, "Enable Console Debug Messages", true).getBoolean(enableDebug);
	if(enableDebug) {
		System.out.println("[TheGamersCo] Debug Is Enabled. The Console Will Recieve Debug Info");
	}
	else if(enableDebug == false) {
		System.out.println("[TheGamersCo] Debug Is Disabled. The Console Will Not Recieve Debug Info");
	}
	config.save();
	if(ConfigHandler.enableDebug)System.out.println("[TheGamersCo] Successfully loaded Config File For The Gamers Co Mod");
	}
}
