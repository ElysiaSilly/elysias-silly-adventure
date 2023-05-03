package com.elysia.edensgarden.registry;

import com.elysia.edensgarden.EdensGarden;
import com.elysia.edensgarden.registry.EdensGardenBlocks;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EdensGardenItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EdensGarden.MODID);

    public static final RegistryObject<Item> POGGALOTLE = ITEMS.register("poggalotle", () ->
            new BlockItem(EdensGardenBlocks.BLOCK_POGGALOTLE.get(), new Item.Properties().tab(EdensGardenTabs.EDENS_GARDEN)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}