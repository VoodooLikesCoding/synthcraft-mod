package net.iamvoodoo.synthcraft.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class SynthRackBlockEntity extends BlockEntity {
    public SynthRackBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.SYNTH_RACK_BLOCK_ENTITY, pos, state);
    }
}
