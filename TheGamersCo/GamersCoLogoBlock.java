package TheGamersCo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class GamersCoLogoBlock extends Block {

	public GamersCoLogoBlock(int par1, int par2,Material par3) {
		super(par1, par2, par3);
		
	}
	public String getTextureFile() {
		return "/TheGamersCoImages/HDTextures.png";
		
		//this.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9)
	}
	@Override
	public boolean onBlockActivated(World par1World, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	 {
		System.out.println("[TheGamersCo] GUI Opened");
	  par5EntityPlayer.openGui(Core.instance, 0, par1World, x, y, z);
	  return true;

	 }
}
