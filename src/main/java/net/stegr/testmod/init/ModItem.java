package net.stegr.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.stegr.testmod.item.ItemMapleLeaf;
import net.stegr.testmod.item.ItemTM;
import net.stegr.testmod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItem
{
    public static final ItemTM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "");
    }
}
