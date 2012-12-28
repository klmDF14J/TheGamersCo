package TheGamersCo.Registers;

import TheGamersCo.Block.Blocks;
import TheGamersCo.Item.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegister {
	public static void addRecipesForWoolSlabs() {
		GameRegistry.addRecipe(new ItemStack(Blocks.whiteWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(Blocks.orangeWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Blocks.magnetaWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(Blocks.lightBlueWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Blocks.yellowWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(Blocks.limeWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Blocks.pinkWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(Blocks.greyWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(Blocks.lightGreyWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(Blocks.cyanWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 9)});
		GameRegistry.addRecipe(new ItemStack(Blocks.purpleWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 10)});
		GameRegistry.addRecipe(new ItemStack(Blocks.blueWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(Blocks.brownWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 12)});
		GameRegistry.addRecipe(new ItemStack(Blocks.greenWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 13)});
		GameRegistry.addRecipe(new ItemStack(Blocks.redWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 14)});
		GameRegistry.addRecipe(new ItemStack(Blocks.blackWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 15)});
	}
	public static void addRecipesForOreBlockSlabs() {
		GameRegistry.addRecipe(new ItemStack(Blocks.ironBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockSteel});
		GameRegistry.addRecipe(new ItemStack(Blocks.goldBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(Blocks.diamondBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockDiamond});
		GameRegistry.addRecipe(new ItemStack(Blocks.emeraldBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockEmerald});
		GameRegistry.addRecipe(new ItemStack(Blocks.lapizBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockLapis});
	}
	public static void addRecipesForMiscSlabs() {
		GameRegistry.addRecipe(new ItemStack(Blocks.glowstoneSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.glowStone});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidianSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.obsidian});
		GameRegistry.addRecipe(new ItemStack(Blocks.netherrackSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.netherrack});
		GameRegistry.addRecipe(new ItemStack(Blocks.snowSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockSnow});
		GameRegistry.addRecipe(new ItemStack(Blocks.mossyCobbleSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.cobblestoneMossy});
		GameRegistry.addRecipe(new ItemStack(Blocks.soulSandSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.slowSand});
		GameRegistry.addRecipe(new ItemStack(Blocks.claySlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockClay});
	}
	public static void addGeneralRecipes() {
		GameRegistry.addRecipe(new ItemStack(Items.invisBlockItem, 4), new Object[] {"x","y",Character.valueOf('x'), new ItemStack(Item.dyePowder,1,4), Character.valueOf('y'), Block.glass});
	}
	public static void addAllRecipes() {
		addRecipesForWoolSlabs();
		addRecipesForOreBlockSlabs();
		addRecipesForMiscSlabs();
		addGeneralRecipes();
	}
}
