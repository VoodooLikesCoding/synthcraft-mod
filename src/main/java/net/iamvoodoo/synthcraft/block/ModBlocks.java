package net.iamvoodoo.synthcraft.block;

import net.iamvoodoo.synthcraft.Synthcraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DUMMY_BLOCK = registerBlock("dummy_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Synthcraft.MOD_ID, "dummy_block")))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Synthcraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Synthcraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Synthcraft.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Synthcraft.LOGGER.info("Registering Mod Blocks for " + Synthcraft.MOD_ID);
    }
}
