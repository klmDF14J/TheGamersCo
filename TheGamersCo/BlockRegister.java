package TheGamersCo;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister {
	public static void registerWoolSlabs() {
		  GameRegistry.registerBlock(Core.whiteWoolSlab,"whiteWoolSlab");
		  GameRegistry.registerBlock(Core.orangeWoolSlab,"orangeWoolSlab");
		  GameRegistry.registerBlock(Core.magnetaWoolSlab,"magnetaWoolSlab");
		  GameRegistry.registerBlock(Core.lightBlueWoolSlab,"lightBlueWoolSlab");
		  GameRegistry.registerBlock(Core.yellowWoolSlab,"yellowWoolSlab");
		  GameRegistry.registerBlock(Core.limeWoolSlab,"limeWoolSlab");
		  GameRegistry.registerBlock(Core.pinkWoolSlab,"pinkWoolSlab");
		  GameRegistry.registerBlock(Core.greyWoolSlab,"greyWoolSlab");
		  GameRegistry.registerBlock(Core.lightGreyWoolSlab,"lightGreyWoolSlab");
		  GameRegistry.registerBlock(Core.cyanWoolSlab,"cyanWoolSlab");
		  GameRegistry.registerBlock(Core.purpleWoolSlab,"purpleWoolSlab");
		  GameRegistry.registerBlock(Core.blueWoolSlab,"blueWoolSlab");
		  GameRegistry.registerBlock(Core.brownWoolSlab,"brownWoolSlab");
		  GameRegistry.registerBlock(Core.greenWoolSlab,"greenWoolSlab");
		  GameRegistry.registerBlock(Core.redWoolSlab,"redWoolSlab");
		  GameRegistry.registerBlock(Core.blackWoolSlab,"blackWoolSlab");
	}
	public static void registerOreBlockSlabs() {
		GameRegistry.registerBlock(Core.ironBlockSlab,"ironBlockSlab");
		GameRegistry.registerBlock(Core.goldBlockSlab,"goldBlockSlab");
		GameRegistry.registerBlock(Core.diamondBlockSlab,"diamondBlockSlab");
		GameRegistry.registerBlock(Core.emeraldBlockSlab,"emeraldBlockSlab");
		GameRegistry.registerBlock(Core.lapizBlockSlab,"lapizBlockSlab");
	}
	public static void registerMiscSlabs() {
		GameRegistry.registerBlock(Core.glowstoneSlab, "glowstoneSlab");
		GameRegistry.registerBlock(Core.obsidianSlab, "obsidianSlab");
		GameRegistry.registerBlock(Core.netherrackSlab, "netherrackSlab");
		GameRegistry.registerBlock(Core.snowSlab, "snowSlab");
		GameRegistry.registerBlock(Core.mossyCobbleSlab, "mossyCobbleSlab");
		GameRegistry.registerBlock(Core.soulSandSlab, "soulSandSlab");
		GameRegistry.registerBlock(Core.claySlab, "claySlab");
	}
	public static void registerGeneralBlocks() {
		GameRegistry.registerBlock(Core.invisBlock,"invisBlock");
		GameRegistry.registerBlock(Core.GamersCoLogo,"gamersCoLogo");
	}
	public static void registerAllBlocks() {
		registerWoolSlabs();
		registerOreBlockSlabs();
		registerMiscSlabs();
		registerGeneralBlocks();
	}
}