package tm.wither.biomimicry.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import tm.wither.biomimicry.block.ModBlocks;

public class WashedCactusBlock extends CactusBlock {
    public WashedCactusBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos)
    {
        // Checks the blocks in the North, East, South, West direction.
        for(Direction direction : Direction.Plane.HORIZONTAL)
        {
            // Gets the block in its current state from the current direction.
            BlockState blockstate = levelReader.getBlockState(blockPos.relative(direction));

            // Check if the block is solid (full block like a stone or a redstone lamp)
            // Also checks if there are any lava (Lava isn't a full block that's why it has to check that specifically)
            if (blockstate.isSolid() || levelReader.getFluidState(blockPos.relative(direction)).is(FluidTags.LAVA))
            {
                return false;
            }
        }
        // Now we get the block below us.
        BlockState blockstate1 = levelReader.getBlockState(blockPos.below());

        // We check two different things here.
        // 1. Is the block below us our washed cactus or a sandblock?
        // 2. Is the block above us a liquid?
        // If there are a cactus or a sand block below us and there is no liquid we return true which means that the cactus survives!
        return (blockstate1.is(ModBlocks.WASHED_CACTUS.get()) || blockstate1.is(BlockTags.SAND)) && !levelReader.getBlockState(blockPos.above()).liquid();
    }
}

