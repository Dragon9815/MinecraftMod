package net.stegr.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.stegr.testmod.block.BlockFlag;
import net.stegr.testmod.block.BlockTM;
import net.stegr.testmod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
