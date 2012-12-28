package TheGamersCo.Item;

import TheGamersCo.Handlers.ConfigHandler;
import net.minecraft.item.Item;

public class Items {
	public static Item invisBlockItem;
	public static void defineItems() {
		invisBlockItem = new ItemInvisBlock(ConfigHandler.invisBlockItemID).setItemName("ItemInvisBlock");
	}
	public static void defineAll() {
		defineItems();
	}
}
