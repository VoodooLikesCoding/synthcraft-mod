package net.iamvoodoo.synthcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iamvoodoo.synthcraft.Synthcraft;
import net.iamvoodoo.synthcraft.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DUMMY_ITEM = registerItem("dummy_item",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Synthcraft.MOD_ID,"dummy_item")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Synthcraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Synthcraft.LOGGER.info("Registering Mod Item for" + Synthcraft.MOD_ID);
    }

    public static final ItemGroup SYNTHCRAFT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Synthcraft.MOD_ID, "synthcraft_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.synthcraft_item_group"))
                    .icon(() -> new ItemStack(Items.NOTE_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SYNTH_RACK);
                        entries.add(ModBlocks.DUMMY_BLOCK);
                        entries.add(DUMMY_ITEM);
                    }).build());
}
