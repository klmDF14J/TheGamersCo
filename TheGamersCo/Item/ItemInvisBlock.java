package TheGamersCo.Item;

import TheGamersCo.Block.Blocks;
import TheGamersCo.Core.Core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class ItemInvisBlock extends Item
{
    public ItemInvisBlock(int par1)
    {
        super(par1);
        this.maxStackSize = 64;
        this.setMaxDamage(1);
        this.setIconIndex(1);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            int var11 = par3World.getBlockId(par4, par5, par6);

            if (var11 == 0)
            {
                par3World.setBlockWithNotify(par4, par5, par6, Blocks.invisBlock.blockID);
                System.out.println("Invisible Block Placed At: " + "X: " + par4 + " Y: " + par5 + " Z: " + par6);
            }

            par1ItemStack.damageItem(2, par2EntityPlayer);
            return true;
        }
    }
    public String getTextureFile() {
    	return "/TheGamersCoImages/HDTextures.png";
    }
}
