package ryanxlvi.oresheep.furnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ryanxlvi.oresheep.OreSheep;

public class BlockFastFurnace extends Block {

    public static final ResourceLocation FAST_FURNACE =
            new ResourceLocation(OreSheep.MODID, "fast_furnace");

    public BlockFastFurnace() {
        super(Material.IRON);
        setRegistryName("fast_furnace");
        setTranslationKey(OreSheep.MODID + ".fast_furnace");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(OreSheep.tabOreSheep);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
