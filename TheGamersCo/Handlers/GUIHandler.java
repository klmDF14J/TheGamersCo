package TheGamersCo.Handlers;


import TheGamersCo.Gui.GamersCoLogoBlankGui;
import TheGamersCo.Gui.GamersCoLogoGui;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.*;
import net.minecraft.world.World;


public class GUIHandler implements IGuiHandler{

@Override
public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
return null;
}

@Override
public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
	switch(id) {
	case 0 : return new GamersCoLogoGui();
	case 1 : return new GamersCoLogoBlankGui();
	default: return null; 
	}
}
}