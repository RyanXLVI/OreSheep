package ryanxlvi.oresheep;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import ryanxlvi.oresheep.proxy.CommonProxy;

@Mod(modid = OreSheep.MODID, name = OreSheep.MODNAME, version =
        OreSheep.MODVERSION,
        dependencies = "required-after:forge@[14.23.5.2775,)", useMetadata =
        true)
public class OreSheep {

    public static final String MODID = "oresheep";
    public static final String MODNAME = "Ore Sheep";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "ryanxlvi.oresheep.proxy.ClientProxy", serverSide = "ryanxlvi.oresheep.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static OreSheep instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
