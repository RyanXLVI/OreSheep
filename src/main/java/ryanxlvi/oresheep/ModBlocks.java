package ryanxlvi.oresheep;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ryanxlvi.oresheep.furnace.BlockFastFurnace;

public class ModBlocks {

    @GameRegistry.ObjectHolder("oresheep:fast_furnace")
    public static BlockFastFurnace blockFastFurnace;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockFastFurnace.initModel();
    }
}
