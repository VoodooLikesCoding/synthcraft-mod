package net.iamvoodoo.synthcraft.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.iamvoodoo.synthcraft.Synthcraft;
import net.iamvoodoo.synthcraft.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntityTypes {
    // Initializes Block Entity Types
    public static final BlockEntityType<SynthRackBlockEntity> SYNTH_RACK_BLOCK_ENTITY = register(
            "demo_block", FabricBlockEntityTypeBuilder.create(SynthRackBlockEntity::new, ModBlocks.SYNTH_RACK)
                    .build()
    );

    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Synthcraft.MOD_ID, path), blockEntityType);
    }

    public static void initialize() {
        // Dummy method
    }
}
