package TheGamersCo.Gui;

import java.awt.Color;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import TheGamersCo.Core.Core;
import TheGamersCo.Core.VersionChecker;


public class GamersCoLogoGui extends GuiScreen {
	public static int guiXSize = 256;
	public static int guiYSize = 256;
	public static String pageTitle = "";
	public static String pageDescLine1 = "";
	public static String pageDescLine2 = "";
	public static String pageDescLine3 = "";
	public static String pageDescLine4 = "";
	public static String pageDescLine5 = "";
	public static String pageDescLine6 = "";
	public static String pageDescLine7 = "";
	public static String pageDescLine8 = "";
	public void initGui() {
		controlList.clear();
		controlList.add(new ParchmentButton(1, width / 2 - 92, height / 2 - 3, 60, 20, "Hiccup3"));
		controlList.add(new ParchmentButton(2, width / 2 - 30, height / 2 - 35, 75, 20, "OllieTheCool"));
		controlList.add(new ParchmentButton(3, width / 2 + 45, height / 2 - 15, 65, 20, "Roboyobo"));
		controlList.add(new StandardButton(4, width / 2 + 135, height / 2 - 80, 75, 20, "Changelog"));
	}
	public boolean doesGuiPauseGame()
    {
            return false;
    }

	
	public void drawScreen(int i, int j, float f) {
		drawDefaultBackground();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		int k = mc.renderEngine.getTexture("/TheGamersCoImages/Gui/GamersCoLogo.png");
		mc.renderEngine.bindTexture(k);
		drawTexturedModalRect(width / 2 - 120, height / 2 - 115, 0, 0, 256, 256);
		
		
		int l = mc.renderEngine.getTexture("/TheGamersCoImages/Gui/DescriptionPane.png");
		mc.renderEngine.bindTexture(l);
		drawTexturedModalRect(width / 2 - 325, height / 2 - 95, 0, 0, 256, 256);
		
		
		int m = mc.renderEngine.getTexture("/TheGamersCoImages/Gui/ButtonPane.png");
		mc.renderEngine.bindTexture(m);
		drawTexturedModalRect(width / 2 + 125, height / 2 - 95, 0, 0, 256, 256);
		super.drawScreen(i, j, f);
		this.drawCenteredString(fontRenderer,pageTitle, width / 2 - 220, height /2 - 90, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine1, width / 2 - 220, height /2 - 45, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine2, width / 2 - 220, height /2 - 30, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine3, width / 2 - 220, height /2 - 15, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine4, width / 2 - 220, height /2 - 0, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine5, width / 2 - 220, height /2 + 15, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine6, width / 2 - 220, height /2 + 30, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine7, width / 2 - 220, height /2 + 45, Color.WHITE.getRGB());
		this.drawCenteredString(fontRenderer,pageDescLine8, width / 2 - 220, height /2 + 60, Color.WHITE.getRGB());
	}
	@Override
	public void keyTyped(char par1, int par2)
	{
	if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.keyCode)
	{
	this.mc.thePlayer.closeScreen();
	}
	}
	
	public void actionPerformed(GuiButton guibutton) {
		if(guibutton.id == 1) {
			pageTitle = "Hiccup3";
			pageDescLine1 = "A";
			pageDescLine2 = "Description";
			pageDescLine3 = "Is";
			pageDescLine4 = "Coming";
			pageDescLine5 = "Soon";
			pageDescLine6 = "Wait";
			pageDescLine7 = "And";
			pageDescLine8 = "See";
		}
		if(guibutton.id == 2) {
			pageTitle = "OllieTheCool";
			pageDescLine1 = "A";
			pageDescLine2 = "Description";
			pageDescLine3 = "Is";
			pageDescLine4 = "Coming";
			pageDescLine5 = "Soon";
			pageDescLine6 = "Wait";
			pageDescLine7 = "And";
			pageDescLine8 = "See";
		}
		if(guibutton.id == 3) {
			pageTitle = "Roboyobo";
			pageDescLine1 = "A";
			pageDescLine2 = "Description";
			pageDescLine3 = "Is";
			pageDescLine4 = "Coming";
			pageDescLine5 = "Soon";
			pageDescLine6 = "Wait";
			pageDescLine7 = "And";
			pageDescLine8 = "See";
		}
		if(guibutton.id == 4) {
			pageTitle = "Changelog";
			pageDescLine1 = "Latest Version: " + VersionChecker.getVersion();
			pageDescLine2 = "- Added New Texture To";
			pageDescLine3 = "  The Information Panel";
			pageDescLine4 = "- Improved Slab Code";
			pageDescLine5 = "- Added More Config Options";
			pageDescLine6 = "- Added Version Checker";
			pageDescLine7 = "- Added A ModInfo File";
			pageDescLine8 = "- Many Minor Code Changes";
		}
	}
}
