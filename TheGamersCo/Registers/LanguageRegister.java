package TheGamersCo.Registers;

import TheGamersCo.Block.Blocks;
import TheGamersCo.Item.Items;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageRegister {
	public static void registerWoolSlabNames() {
		LanguageRegistry.addName(Blocks.whiteWoolSlab, "White Wool Slab");
		LanguageRegistry.addName(Blocks.orangeWoolSlab, "Orange Wool Slab");
		LanguageRegistry.addName(Blocks.magnetaWoolSlab, "Magneta Wool Slab");
		LanguageRegistry.addName(Blocks.lightBlueWoolSlab, "Light Blue Wool Slab");
		LanguageRegistry.addName(Blocks.yellowWoolSlab, "Yellow Wool Slab");
		LanguageRegistry.addName(Blocks.limeWoolSlab, "Lime Wool Slab");
		LanguageRegistry.addName(Blocks.pinkWoolSlab, "Pink Wool Slab");
		LanguageRegistry.addName(Blocks.greyWoolSlab, "Grey Wool Slab");
		LanguageRegistry.addName(Blocks.lightGreyWoolSlab, "Light Grey Wool Slab");
		LanguageRegistry.addName(Blocks.cyanWoolSlab, "Cyan Wool Slab");
		LanguageRegistry.addName(Blocks.purpleWoolSlab, "Purple Wool Slab");
		LanguageRegistry.addName(Blocks.blueWoolSlab, "Blue Wool Slab");
		LanguageRegistry.addName(Blocks.brownWoolSlab, "Brown Wool Slab");
		LanguageRegistry.addName(Blocks.greenWoolSlab, "Green Wool Slab");
		LanguageRegistry.addName(Blocks.redWoolSlab, "Red Wool Slab");
		LanguageRegistry.addName(Blocks.blackWoolSlab, "Black Wool Slab");
	}
	public static void registerOreBlockSlabNames() {
		LanguageRegistry.addName(Blocks.ironBlockSlab, "Iron Block Slab");
		LanguageRegistry.addName(Blocks.goldBlockSlab, "Gold Block Slab");
		LanguageRegistry.addName(Blocks.diamondBlockSlab, "Diamond Block Slab");
		LanguageRegistry.addName(Blocks.emeraldBlockSlab, "Emerald Block Slab");
		LanguageRegistry.addName(Blocks.lapizBlockSlab, "Lapis Block Slab");
	}
	public static void registerGeneralBlockNames() {
		LanguageRegistry.addName(Blocks.invisBlock, "Invisible Block [Block Form]");
	}
	public static void registerMiscSlabNames() {
		LanguageRegistry.addName(Blocks.glowstoneSlab, "Glowstone Slab");
		LanguageRegistry.addName(Blocks.obsidianSlab, "Obsidian Slab");
		LanguageRegistry.addName(Blocks.netherrackSlab, "Netherrack Slab");
		LanguageRegistry.addName(Blocks.snowSlab, "Snow Slab");
		LanguageRegistry.addName(Blocks.mossyCobbleSlab, "Mossy Cobblestone Slab");
		LanguageRegistry.addName(Blocks.soulSandSlab, "Soulsand Slab");
		LanguageRegistry.addName(Blocks.claySlab, "Clay Slab");
	}
	public static void registerGeneralItemNames() {
		LanguageRegistry.addName(Items.invisBlockItem, "Invisible Block");
		LanguageRegistry.addName(Blocks.GamersCoLogo, "The Gamers Co Information Panel");
	}
	public static void registerAllNames() {
		registerWoolSlabNames();
		registerOreBlockSlabNames();
		registerMiscSlabNames();
		registerGeneralBlockNames();
		registerGeneralItemNames();
	}
}
