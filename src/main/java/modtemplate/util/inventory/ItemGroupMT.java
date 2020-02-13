package modtemplate.util.inventory;

import modtemplate.api.MTItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupMT extends ItemGroup
{
    public static final ItemGroupMT instance = new ItemGroupMT(ItemGroup.TABS.length, "tabModTemplate");

    private ItemGroupMT(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(MTItems.mt_icon);
    }
}
