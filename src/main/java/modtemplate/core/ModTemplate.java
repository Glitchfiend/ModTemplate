package modtemplate.core;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value = ModTemplate.MOD_ID)
public class ModTemplate
{
    public static final String MOD_ID = "modtemplate";

    public static ModTemplate instance;
    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public static Logger logger = LogManager.getLogger(MOD_ID);

    public ModTemplate()
    {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.addListener(this::serverStarting);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    public void serverStarting(FMLServerStartingEvent evt)
    {

    }
}
