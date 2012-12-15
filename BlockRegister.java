package TheGamersCo;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister {
	public static void registerWoolSlabs() {
		  GameRegistry.registerBlock(Core.whiteWoolSlab);
		  GameRegistry.registerBlock(Core.orangeWoolSlab);
		  GameRegistry.registerBlock(Core.magnetaWoolSlab);
		  GameRegistry.registerBlock(Core.lightBlueWoolSlab);
		  GameRegistry.registerBlock(Core.yellowWoolSlab);
		  GameRegistry.registerBlock(Core.limeWoolSlab);
		  GameRegistry.registerBlock(Core.pinkWoolSlab);
		  GameRegistry.registerBlock(Core.greyWoolSlab);
		  GameRegistry.registerBlock(Core.lightGreyWoolSlab);
		  GameRegistry.registerBlock(Core.cyanWoolSlab);
		  GameRegistry.registerBlock(Core.purpleWoolSlab);
		  GameRegistry.registerBlock(Core.blueWoolSlab);
		  GameRegistry.registerBlock(Core.brownWoolSlab);
		  GameRegistry.registerBlock(Core.greenWoolSlab);
		  GameRegistry.registerBlock(Core.redWoolSlab);
		  GameRegistry.registerBlock(Core.blackWoolSlab);
	}
	public static void registerAllBlocks() {
		registerWoolSlabs();
	}
}
