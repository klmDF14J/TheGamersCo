package TheGamersCo;

public class CreativeTabRegister {
	public static void setCreativeTabsForWoolSlabs() {
		 Core.whiteWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.orangeWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.magnetaWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.lightBlueWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.yellowWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.limeWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.pinkWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.greyWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.lightGreyWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.cyanWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.purpleWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.blueWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.brownWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.greenWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.redWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
		 Core.blackWoolSlab.setCreativeTab(Core.theGamersCoTabDeco);
	}
	public static void setCreativeTabsForOreBlockSlabs() {
		Core.ironBlockSlab.setCreativeTab(Core.theGamersCoTabDeco);
		Core.goldBlockSlab.setCreativeTab(Core.theGamersCoTabDeco);
		Core.diamondBlockSlab.setCreativeTab(Core.theGamersCoTabDeco);
		Core.emeraldBlockSlab.setCreativeTab(Core.theGamersCoTabDeco);
		Core.lapizBlockSlab.setCreativeTab(Core.theGamersCoTabDeco);
	}
	public static void setCreativeTabsForGeneralBlocks() {
		
	}
	public static void setCreativeTabsForGeneralItems() {
		Core.invisBlockItem.setCreativeTab(Core.theGamersCoTabDeco);
	}
	public static void setAllCreativeTabs() {
		setCreativeTabsForOreBlockSlabs();
		setCreativeTabsForWoolSlabs();
		setCreativeTabsForGeneralBlocks();
		setCreativeTabsForGeneralItems();
	}
}
