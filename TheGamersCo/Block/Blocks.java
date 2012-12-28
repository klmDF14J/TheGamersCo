package TheGamersCo.Block;

import TheGamersCo.Handlers.ConfigHandler;
import TheGamersCo.Item.ItemInvisBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Blocks {

	public static Block whiteWoolSlab, orangeWoolSlab, magnetaWoolSlab, lightBlueWoolSlab, yellowWoolSlab, limeWoolSlab, pinkWoolSlab, greyWoolSlab, lightGreyWoolSlab, cyanWoolSlab, purpleWoolSlab, blueWoolSlab, brownWoolSlab, greenWoolSlab, redWoolSlab, blackWoolSlab;
	public static Block whiteWoolDoubleSlab;
	public static Block ironBlockSlab, goldBlockSlab, diamondBlockSlab, emeraldBlockSlab, lapizBlockSlab;
	public static Block glowstoneSlab, obsidianSlab, netherrackSlab, snowSlab, mossyCobbleSlab, soulSandSlab, claySlab;
	public static Block invisBlock, GamersCoLogo;
	
	
	public static void defineWoolSlabs() {
		  whiteWoolSlab = new WoolSlab(ConfigHandler.whiteWoolSlabID, false, Material.cloth, 64).setBlockName("WhiteWoolSlab");
		  orangeWoolSlab = new WoolSlab(ConfigHandler.orangeWoolSlabID, false, Material.cloth, 210).setBlockName("OrangeWoolSlab");
		  magnetaWoolSlab = new WoolSlab(ConfigHandler.magnetaWoolSlabID, false, Material.cloth, 194).setBlockName("MagnetaWoolSlab");
		  lightBlueWoolSlab = new WoolSlab(ConfigHandler.lightBlueWoolSlabID, false, Material.cloth, 178).setBlockName("LightBlueWoolSlab");
		  yellowWoolSlab = new WoolSlab(ConfigHandler.yellowWoolSlabID, false, Material.cloth, 162).setBlockName("YellowWoolSlab");
		  limeWoolSlab = new WoolSlab(ConfigHandler.limeWoolSlabID, false, Material.cloth, 146).setBlockName("LimeWoolSlab");
		  pinkWoolSlab = new WoolSlab(ConfigHandler.pinkWoolSlabID, false, Material.cloth, 130).setBlockName("PinkWoolSlab");
		  greyWoolSlab = new WoolSlab(ConfigHandler.greyWoolSlabID, false, Material.cloth, 114).setBlockName("GreyWoolSlab");
		  lightGreyWoolSlab = new WoolSlab(ConfigHandler.lightGreyWoolSlabID, false, Material.cloth, 225).setBlockName("LightGreyWoolSlab");
		  cyanWoolSlab = new WoolSlab(ConfigHandler.cyanWoolSlabID, false, Material.cloth, 209).setBlockName("CyanWoolSlab");
		  purpleWoolSlab = new WoolSlab(ConfigHandler.purpleWoolSlabID, false, Material.cloth, 193).setBlockName("PurpleWoolSlab");
		  blueWoolSlab = new WoolSlab(ConfigHandler.blueWoolSlabID, false, Material.cloth, 177).setBlockName("BlueWoolSlab");
		  brownWoolSlab = new WoolSlab(ConfigHandler.brownWoolSlabID, false, Material.cloth, 161).setBlockName("BrownWoolSlab");
		  greenWoolSlab = new WoolSlab(ConfigHandler.greenWoolSlabID, false, Material.cloth, 145).setBlockName("GreenWoolSlab");
		  redWoolSlab = new WoolSlab(ConfigHandler.redWoolSlabID, false, Material.cloth, 129).setBlockName("RedWoolSlab");
		  blackWoolSlab = new WoolSlab(ConfigHandler.blackWoolSlabID, false, Material.cloth, 113).setBlockName("BlackWoolSlab");
	}
	public static void defineMiscSlabs() {
		glowstoneSlab = new StandardSlab(ConfigHandler.glowstoneSlabID, false, Material.rock, 105, true, false, false).setBlockName("glowstoneSlab");
		obsidianSlab = new StandardSlab(ConfigHandler.obsidianSlabID, false, Material.rock, 37, false, false, false).setBlockName("obsidianSlab");
		netherrackSlab = new StandardSlab(ConfigHandler.netherrackSlabID, false, Material.rock, 103, false, false, false).setBlockName("netherrackSlab");
		snowSlab = new StandardSlab(ConfigHandler.snowSlabID, false, Material.snow, 66, false, false, false).setBlockName("snowSlab");
		mossyCobbleSlab = new StandardSlab(ConfigHandler.mossyCobbleSlabID, false, Material.rock, 36, false, false, false).setBlockName("mossyCobbleSlab");
		soulSandSlab = new StandardSlab(ConfigHandler.soulSandSlabID, false, Material.grass, 104, false, true, false).setBlockName("soulSandSlab");
		claySlab = new StandardSlab(ConfigHandler.claySlabID, false, Material.clay, 72, false, false, false).setBlockName("claySlab");
	}
	public static void defineOreBlockSlabs() {
		ironBlockSlab = new OreBlockSlab(ConfigHandler.ironBlockSlabID, false, Material.rock, 22).setBlockName("IronBlockSlab");
		goldBlockSlab = new OreBlockSlab(ConfigHandler.goldBlockSlabID, false, Material.rock, 23).setBlockName("GoldBlockSlab");
		diamondBlockSlab = new OreBlockSlab(ConfigHandler.diamondBlockSlabID, false, Material.rock, 24).setBlockName("DiamondBlockSlab");
		emeraldBlockSlab = new OreBlockSlab(ConfigHandler.emeraldBlockSlabID, false, Material.rock, 25).setBlockName("EmeraldBlockSlab");
		lapizBlockSlab = new OreBlockSlab(ConfigHandler.lapizBlockSlabID, false, Material.rock, 144).setBlockName("LapizBlockSlab");
	}
	public static void defineGeneralThings() {
		GamersCoLogo = new GamersCoLogoBlock(ConfigHandler.gamersCoLogoID, 0, Material.rock).setBlockName("GamersCoLogo");
		invisBlock = new InvisBlock(ConfigHandler.invisBlockID, 0, Material.glass, "/TheGamersCoImages/Block.png", false).setBlockName("InvisBlock");
	}
	public static void defineAll() {
		  defineWoolSlabs();
		  defineOreBlockSlabs();
		  defineMiscSlabs();
		  defineGeneralThings();
	}
}
