package TheGamersCo;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageRegister {
	public static void registerWoolSlabNames() {
		LanguageRegistry.addName(Core.whiteWoolSlab, "White Wool Slab");
		LanguageRegistry.addName(Core.orangeWoolSlab, "Orange Wool Slab");
		LanguageRegistry.addName(Core.magnetaWoolSlab, "Magneta Wool Slab");
		LanguageRegistry.addName(Core.lightBlueWoolSlab, "Light Blue Wool Slab");
		LanguageRegistry.addName(Core.yellowWoolSlab, "Yellow Wool Slab");
		LanguageRegistry.addName(Core.limeWoolSlab, "Lime Wool Slab");
		LanguageRegistry.addName(Core.pinkWoolSlab, "Pink Wool Slab");
		LanguageRegistry.addName(Core.greyWoolSlab, "Grey Wool Slab");
		LanguageRegistry.addName(Core.lightGreyWoolSlab, "Light Grey Wool Slab");
		LanguageRegistry.addName(Core.cyanWoolSlab, "Cyan Wool Slab");
		LanguageRegistry.addName(Core.purpleWoolSlab, "Purple Wool Slab");
		LanguageRegistry.addName(Core.blueWoolSlab, "Blue Wool Slab");
		LanguageRegistry.addName(Core.brownWoolSlab, "Brown Wool Slab");
		LanguageRegistry.addName(Core.greenWoolSlab, "Green Wool Slab");
		LanguageRegistry.addName(Core.redWoolSlab, "Red Wool Slab");
		LanguageRegistry.addName(Core.blackWoolSlab, "Black Wool Slab");
	}
	public static void registerOreBlockSlabNames() {
		LanguageRegistry.addName(Core.ironBlockSlab, "Iron Block Slab");
		LanguageRegistry.addName(Core.goldBlockSlab, "Gold Block Slab");
		LanguageRegistry.addName(Core.diamondBlockSlab, "Diamond Block Slab");
		LanguageRegistry.addName(Core.emeraldBlockSlab, "Emerald Block Slab");
		LanguageRegistry.addName(Core.lapizBlockSlab, "Lapis Block Slab");
	}
	public static void registerGeneralBlockNames() {
		LanguageRegistry.addName(Core.invisBlock, "Invisible Block [Block Form]");
	}
	public static void registerGeneralItemNames() {
		LanguageRegistry.addName(Core.invisBlockItem, "Invisible Block");
	}
	public static void registerAllNames() {
		registerWoolSlabNames();
		registerOreBlockSlabNames();
		registerGeneralBlockNames();
		registerGeneralItemNames();
	}
}
