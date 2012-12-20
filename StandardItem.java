package TheGamersCo;

import net.minecraft.item.Item;

public class StandardItem extends Item
{
	public static String textureFile;
    public StandardItem(int par1,int par2, String texFile)
    {
        super(par1);
        this.setMaxStackSize(1);
        setIconIndex(par2);
        textureFile = texFile;
    }


    public String getTextureFile() {
    	return textureFile;
    }
}
