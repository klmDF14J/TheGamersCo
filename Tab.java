package TheGamersCo;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;


public final class Tab extends CreativeTabs
{
		int TabID;
		int TabIconID;
		String[] tabNames = {"The Gamers Co Decoration"};
        public Tab(int par1, String par2Str, int tabID, int tabIconID)
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