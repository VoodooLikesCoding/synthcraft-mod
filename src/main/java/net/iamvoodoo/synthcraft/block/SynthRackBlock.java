package net.iamvoodoo.synthcraft.block;

import com.mojang.serialization.MapCodec;
import net.iamvoodoo.synthcraft.block.entity.ModBlockEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class SynthRackBlock extends Block implements BlockEntityProvider {
    public SynthRackBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends SynthRackBlock> getCodec() {
        return createCodec(SynthRackBlock::new);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntityTypes.SYNTH_RACK_BLOCK_ENTITY.instantiate(pos, state);
    }
}
