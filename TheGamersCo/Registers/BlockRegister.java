package TheGamersCo.Registers;

import TheGamersCo.Block.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister {
	public static void registerWoolSlabs() {
		  GameRegistry.registerBlock(Blocks.whiteWoolSlab,"whiteWoolSlab");
		  GameRegistry.registerBlock(Blocks.orangeWoolSlab,"orangeWoolSlab");
		  GameRegistry.registerBlock(Blocks.magnetaWoolSlab,"magnetaWoolSlab");
		  GameRegistry.registerBlock(Blocks.lightBlueWoolSlab,"lightBlueWoolSlab");
		  GameRegistry.registerBlock(Blocks.yellowWoolSlab,"yellowWoolSlab");
		  GameRegistry.registerBlock(Blocks.limeWoolSlab,"limeWoolSlab");
		  GameRegistry.registerBlock(Blocks.pinkWoolSlab,"pinkWoolSlab");
		  GameRegistry.registerBlock(Blocks.greyWoolSlab,"greyWoolSlab");
		  GameRegistry.registerBlock(Blocks.lightGreyWoolSlab,"lightGreyWoolSlab");
		  GameRegistry.registerBlock(Blocks.cyanWoolSlab,"cyanWoolSlab");
		  GameRegistry.registerBlock(Blocks.purpleWoolSlab,"purpleWoolSlab");
		  GameRegistry.registerBlock(Blocks.blueWoolSlab,"blueWoolSlab");
		  GameRegistry.registerBlock(Blocks.brownWoolSlab,"brownWoolSlab");
		  GameRegistry.registerBlock(Blocks.greenWoolSlab,"greenWoolSlab");
		  GameRegistry.registerBlock(Blocks.redWoolSlab,"redWoolSlab");
		  GameRegistry.registerBlock(Blocks.blackWoolSlab,"blackWoolSlab");
	}
	public static void registerOreBlockSlabs() {
		GameRegistry.registerBlock(Blocks.ironBlockSlab,"ironBlockSlab");
		GameRegistry.registerBlock(Blocks.goldBlockSlab,"goldBlockSlab");
		GameRegistry.registerBlock(Blocks.diamondBlockSlab,"diamondBlockSlab");
		GameRegistry.registerBlock(Blocks.emeraldBlockSlab,"emeraldBlockSlab");
		GameRegistry.registerBlock(Blocks.lapizBlockSlab,"lapizBlockSlab");
	}
	public static void registerMiscSlabs() {
		GameRegistry.registerBlock(Blocks.glowstoneSlab, "glowstoneSlab");
		GameRegistry.registerBlock(Blocks.obsidianSlab, "obsidianSlab");
		GameRegistry.registerBlock(Blocks.netherrackSlab, "netherrackSlab");
		GameRegistry.registerBlock(Blocks.snowSlab, "snowSlab");
		GameRegistry.registerBlock(Blocks.mossyCobbleSlab, "mossyCobbleSlab");
		GameRegistry.registerBlock(Blocks.soulSandSlab, "soulSandSlab");
		GameRegistry.registerBlock(Blocks.claySlab, "claySlab");
	}
	public static void registerGeneralBlocks() {
		GameRegistry.registerBlock(Blocks.invisBlock,"invisBlock");
		GameRegistry.registerBlock(Blocks.GamersCoLogo,"gamersCoLogo");
	}
	public static void registerAllBlocks() {
		registerWoolSlabs();
		registerOreBlockSlabs();
		registerMiscSlabs();
		registerGeneralBlocks();
	}
}
