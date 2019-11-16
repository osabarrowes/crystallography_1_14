package com.github.xenonni.crystallography.init;

import com.github.xenonni.crystallography.Crystallography;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Seems like this will store static references to items
 */

@ObjectHolder(Crystallography.MODID) // Forge uses this to label things
public class ModItems {
    public static final Item EXAMPLE_ITEM = null;

}
