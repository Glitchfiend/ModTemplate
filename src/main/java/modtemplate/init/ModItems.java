package modtemplate.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static modtemplate.api.MTItems.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
    	// MT Creative Tab Icon
        mt_icon = registerItem(new Item(new Item.Properties()), "mt_icon");
    }

    public static Item registerItem(Item item, String name)
    {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
