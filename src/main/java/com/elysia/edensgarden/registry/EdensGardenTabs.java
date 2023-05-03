package com.elysia.edensgarden.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EdensGardenTabs {
    public static final CreativeModeTab EDENS_GARDEN = new CreativeModeTab("edens_garden") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(EdensGardenItems.POGGALOTLE.get());
        }
    };
}
