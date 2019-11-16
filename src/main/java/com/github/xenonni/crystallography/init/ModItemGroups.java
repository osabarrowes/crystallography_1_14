package com.github.xenonni.crystallography.init;

import com.github.xenonni.crystallography.Crystallography;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups {

    // TODO: The use of the light blue banner is a temporary placeholder
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Crystallography.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM));

    /*
    Helper class to correctly order initialization events.
    When item stacks are created, items are null and so need a placeholder (Supplier<T>) in order to prevent
    the game from crashing. When the to be the ItemGroup's icon actually needs to be rendered, createIcon() is called and
    the now existing item can be accessed by the Supplier.
     */
    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }

}

