package TheGamersCo;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import org.lwjgl.opengl.GL11;

public class GamersCoLogoGui extends GuiScreen {
	
	public void initGui() {
		controlList.clear();
		controlList.add(new Button(1, width / 2 - 57, height / 2 + 2, 60, 20, "Hiccup3"));
		controlList.add(new Button(1, width / 2 + 80, height / 2 - 10, 65, 20, "Roboyobo"));
		controlList.add(new Button(1, width / 2 + 5, height / 2 - 30, 75, 20, "OllieTheCool"));
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
		drawTexturedModalRect(width / 2 - 85, height / 2 - 110, 0, 0, 256, 256);
		super.drawScreen(i, j, f);
	}
	
	public void actionPerformed(GuiButton guibutton) {
		
	}
}
