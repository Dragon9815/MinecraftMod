package net.stegr.testmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.stegr.testmod.init.ModItem;
import net.stegr.testmod.reference.Reference;

public class CreativeTabTM
{
    public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItem.mapleLeaf;
        }
    };
}
