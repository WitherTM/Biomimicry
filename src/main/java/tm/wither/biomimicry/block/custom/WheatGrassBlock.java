package tm.wither.biomimicry.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class WheatGrassBlock extends BushBlock {
    public WheatGrassBlock(Properties p_57318_) {
        super(p_57318_);

    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockState blockstate1 = levelReader.getBlockState(blockPos.below());
        return (blockstate1.is(BlockTags.DIRT)) && !levelReader.getBlockState(blockPos.above()).liquid();
    }
}
