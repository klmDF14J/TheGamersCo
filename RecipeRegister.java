package TheGamersCo;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegister {
	public static void addRecipesForWoolSlabs() {
		GameRegistry.addRecipe(new ItemStack(Core.whiteWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(Core.orangeWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Core.magnetaWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(Core.lightBlueWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Core.yellowWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(Core.limeWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Core.pinkWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(Core.greyWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(Core.lightGreyWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(Core.cyanWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 9)});
		GameRegistry.addRecipe(new ItemStack(Core.purpleWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 10)});
		GameRegistry.addRecipe(new ItemStack(Core.blueWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(Core.brownWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 12)});
		GameRegistry.addRecipe(new ItemStack(Core.greenWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 13)});
		GameRegistry.addRecipe(new ItemStack(Core.redWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 14)});
		GameRegistry.addRecipe(new ItemStack(Core.blackWoolSlab, 6), new Object[] {"xxx",Character.valueOf('x'), new ItemStack(Block.cloth, 1, 15)});
	}
	public static void addRecipesForOreBlockSlabs() {
		GameRegistry.addRecipe(new ItemStack(Core.ironBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockSteel});
		GameRegistry.addRecipe(new ItemStack(Core.goldBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(Core.diamondBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockDiamond});
		GameRegistry.addRecipe(new ItemStack(Core.emeraldBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockEmerald});
		GameRegistry.addRecipe(new ItemStack(Core.lapizBlockSlab, 6), new Object[] {"xxx",Character.valueOf('x'), Block.blockLapis});
	}
	public static void addGeneralRecipes() {
		GameRegistry.addRecipe(new ItemStack(Core.invisBlockItem, 4), new Object[] {"x","y",Character.valueOf('x'), new ItemStack(Item.dyePowder,1,4), Character.valueOf('y'), Block.glass});
	}
	public static void addAllRecipes() {
		addRecipesForWoolSlabs();
		addRecipesForOreBlockSlabs();
		addGeneralRecipes();
	}
}
