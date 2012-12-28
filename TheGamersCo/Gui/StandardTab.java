package TheGamersCo.Gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;


public final class StandardTab extends CreativeTabs
{
		int TabID;
		int TabIconID;
		String[] tabNames = {"The Gamers Co"};
        public StandardTab(int par1, String par2Str, int tabID, int tabIconID)
        {
                super(par1, par2Str);
                TabID = tabID;
                TabIconID = tabIconID;
        }
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
                return TabIconID;
                		
        }
        
   
        public String getTranslatedTabLabel()
        {
         return tabNames[TabID];
        }
}