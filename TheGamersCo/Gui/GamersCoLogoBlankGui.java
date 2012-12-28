package TheGamersCo.Gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import org.lwjgl.opengl.GL11;


public class GamersCoLogoBlankGui extends GuiScreen {
	
	public void initGui() {
		controlList.clear();
		controlList.add(new ParchmentButton(4, width / 2 - 57, height / 2 - 100, 60, 20, "Hiccup3"));
		controlList.add(new ParchmentButton(5, width / 2 - 32, height / 2 - 100, 65, 20, "Roboyobo"));
		controlList.add(new ParchmentButton(6, width / 2 - 7, height / 2 - 100, 75, 20, "OllieTheCool"));
	}
	public boolean doesGuiPauseGame()
    {
            return false;
    }

	
	public void drawScreen(int i, int j, float f) {
		drawDefaultBackground();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int k = mc.renderEngine.getTexture("/TheGamersCoImages/Gui/BlankPage.png");
		mc.renderEngine.bindTexture(k);
		drawTexturedModalRect(width / 2 - 85, height / 2 - 110, 0, 0, 256, 256);
		super.drawScreen(i, j, f);
	}
	
	public void actionPerformed(GuiButton guibutton) {
		
	}
}
