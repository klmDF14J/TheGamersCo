package TheGamersCo;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InvisBlock extends Block {
	public static String textureFile;
	public static boolean blockIsNormal;
	public InvisBlock(int par1, int par2, Material par3Material, String texFile, boolean normalBlock) {
		super(par1, par2, par3Material);
		textureFile = texFile;
		blockIsNormal = normalBlock;
		setLightOpacity(0);
		setHardness(1F);
		setResistance(3F);
	}
	public String getTextureFile() {
		return textureFile;
	}
	public boolean isOpaqueCube() {
		return blockIsNormal;
		
	}
	public int getRenderBlockPass()
    {
        return 0;
    }
	public boolean renderAsNormalBlock()
    {
        return blockIsNormal;
    }
	public int idDropped(int par1, Random par2, int par3) {
		return Core.invisBlockItem.shiftedIndex;
	}
	

}
