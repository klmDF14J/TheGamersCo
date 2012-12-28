package TheGamersCo.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StandardBlock extends Block {
	public static String textureFile;
	public static boolean blockIsNormal;
	public StandardBlock(int par1, int par2, Material par3Material, String texFile, boolean normalBlock) {
		super(par1, par2, par3Material);
		textureFile = texFile;
		blockIsNormal = normalBlock;
		setLightOpacity(0);
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
	

}
