package TheGamersCo.Proxys;

import TheGamersCo.Gui.GamersCoLogoGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{
public void registerRenderInformation() {
	  
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
return new GamersCoLogoGui();
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
return null;
}
}