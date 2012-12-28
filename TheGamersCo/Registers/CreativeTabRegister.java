package TheGamersCo.Registers;

import TheGamersCo.Block.Blocks;
import TheGamersCo.Gui.Tabs;
import TheGamersCo.Item.Items;

public class CreativeTabRegister {
	public static void setCreativeTabsForWoolSlabs() {
		 Blocks.whiteWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.orangeWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.magnetaWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.lightBlueWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.yellowWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.limeWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.pinkWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.greyWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.lightGreyWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.cyanWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.purpleWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.blueWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.brownWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.greenWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.redWoolSlab.setCreativeTab(Tabs.tabDeco);
		 Blocks.blackWoolSlab.setCreativeTab(Tabs.tabDeco);
	}
	public static void setCreativeTabsForOreBlockSlabs() {
		Blocks.ironBlockSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.goldBlockSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.diamondBlockSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.emeraldBlockSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.lapizBlockSlab.setCreativeTab(Tabs.tabDeco);
	}
	public static void setCreativeTabsForMiscSlabs() {
		Blocks.glowstoneSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.obsidianSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.netherrackSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.snowSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.mossyCobbleSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.soulSandSlab.setCreativeTab(Tabs.tabDeco);
		Blocks.claySlab.setCreativeTab(Tabs.tabDeco);
	}
	public static void setCreativeTabsForGeneralBlocks() {
		Blocks.GamersCoLogo.setCreativeTab(Tabs.tabDeco);
	}
	public static void setCreativeTabsForGeneralItems() {
		
		Items.invisBlockItem.setCreativeTab(Tabs.tabDeco);
	}
	public static void setAllCreativeTabs() {
		setCreativeTabsForOreBlockSlabs();
		setCreativeTabsForWoolSlabs();
		setCreativeTabsForMiscSlabs();
		setCreativeTabsForGeneralBlocks();
		setCreativeTabsForGeneralItems();
	}
}
