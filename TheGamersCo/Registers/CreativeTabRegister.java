package TheGamersCo.Registers;

import TheGamersCo.Core.Core;

public class CreativeTabRegister {
	public static void setCreativeTabsForWoolSlabs() {
		 Core.whiteWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.orangeWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.magnetaWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.lightBlueWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.yellowWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.limeWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.pinkWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.greyWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.lightGreyWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.cyanWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.purpleWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.blueWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.brownWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.greenWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.redWoolSlab.setCreativeTab(Core.theGamersCoTab);
		 Core.blackWoolSlab.setCreativeTab(Core.theGamersCoTab);
	}
	public static void setCreativeTabsForOreBlockSlabs() {
		Core.ironBlockSlab.setCreativeTab(Core.theGamersCoTab);
		Core.goldBlockSlab.setCreativeTab(Core.theGamersCoTab);
		Core.diamondBlockSlab.setCreativeTab(Core.theGamersCoTab);
		Core.emeraldBlockSlab.setCreativeTab(Core.theGamersCoTab);
		Core.lapizBlockSlab.setCreativeTab(Core.theGamersCoTab);
	}
	public static void setCreativeTabsForMiscSlabs() {
		Core.glowstoneSlab.setCreativeTab(Core.theGamersCoTab);
		Core.obsidianSlab.setCreativeTab(Core.theGamersCoTab);
		Core.netherrackSlab.setCreativeTab(Core.theGamersCoTab);
		Core.snowSlab.setCreativeTab(Core.theGamersCoTab);
		Core.mossyCobbleSlab.setCreativeTab(Core.theGamersCoTab);
		Core.soulSandSlab.setCreativeTab(Core.theGamersCoTab);
		Core.claySlab.setCreativeTab(Core.theGamersCoTab);
	}
	public static void setCreativeTabsForGeneralBlocks() {
		Core.GamersCoLogo.setCreativeTab(Core.theGamersCoTab);
	}
	public static void setCreativeTabsForGeneralItems() {
		
		Core.invisBlockItem.setCreativeTab(Core.theGamersCoTab);
	}
	public static void setAllCreativeTabs() {
		setCreativeTabsForOreBlockSlabs();
		setCreativeTabsForWoolSlabs();
		setCreativeTabsForMiscSlabs();
		setCreativeTabsForGeneralBlocks();
		setCreativeTabsForGeneralItems();
	}
}
