package tm.wither.biomimicry.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;

public class WashedCactusBlock extends CactusBlock {
    public WashedCactusBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return super.canSurvive(blockState, levelReader, blockPos);
    }
}

