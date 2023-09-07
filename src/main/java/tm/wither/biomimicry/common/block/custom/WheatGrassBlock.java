package tm.wither.biomimicry.common.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class WheatGrassBlock extends BushBlock {
    public WheatGrassBlock(Properties properties) {
        super(properties);

    }

    @Override
    public boolean canSurvive(@NotNull BlockState blockState, @NotNull LevelReader levelReader, @NotNull BlockPos blockPos) {
        BlockState blockstate1 = levelReader.getBlockState(blockPos.below());
        return (blockstate1.is(BlockTags.TERRACOTTA)) || (blockstate1.is(BlockTags.SAND)) && !levelReader.getBlockState(blockPos.above()).liquid();
    }
}
