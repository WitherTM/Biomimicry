package tm.wither.biomimicry.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import tm.wither.biomimicry.core.init.ModBlockStateProperties;
import tm.wither.biomimicry.core.init.ModItems;

public class CheeseWheelBlock extends Block {
    public CheeseWheelBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(SLICES, Integer.valueOf(0)));
    }
        public static final int MAX_SLICES = 7;
        public static final IntegerProperty SLICES = ModBlockStateProperties.SLICES;
        public static final int FULL_CHEESE_WHEEL_SIGNAL = getOutputSignal(0);
        protected static final VoxelShape[] SHAPE_BY_SLICE = new VoxelShape[]{Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D),Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D) };

    
            

        public VoxelShape getShape (BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext){
            return SHAPE_BY_SLICE[pState.getValue(SLICES)];
        }

        public InteractionResult use (BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand
        pHand, BlockHitResult pHit){
            ItemStack itemstack = pPlayer.getItemInHand(pHand);
            if (pLevel.isClientSide) {
                if (click(pLevel, pPos, pState, pPlayer).consumesAction()) {
                    return InteractionResult.SUCCESS;
                }
            }

            return click(pLevel, pPos, pState, pPlayer);
        }

        protected static InteractionResult click (LevelAccessor pLevel, BlockPos pPos, BlockState pState, Player pPlayer){
                pPlayer.addItem(new ItemStack(ModItems.CHEESE.get()));
                int i = pState.getValue(SLICES);
                pLevel.gameEvent(pPlayer, GameEvent.EAT, pPos);
                if (i < MAX_SLICES) {
                    pLevel.setBlock(pPos, pState.setValue(SLICES, Integer.valueOf(i + 1)), 3);
                } else {
                    pLevel.removeBlock(pPos, false);
                    pLevel.gameEvent(pPlayer, GameEvent.BLOCK_DESTROY, pPos);
                }

                return InteractionResult.SUCCESS;
        }

        /**
         * Update the provided state given the provided neighbor direction and neighbor state, returning a new state.
         * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
         * returns its solidified counterpart.
         * Note that this method should ideally consider only the specific direction passed in.
         */
        public BlockState updateShape (BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor
        pLevel, BlockPos pCurrentPos, BlockPos pFacingPos){
            return pFacing == Direction.DOWN && !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }

        public boolean canSurvive (BlockState pState, LevelReader pLevel, BlockPos pPos){
            return pLevel.getBlockState(pPos.below()).isSolid();
        }

        protected void createBlockStateDefinition (StateDefinition.Builder < Block, BlockState > pBuilder){
            pBuilder.add(SLICES);
        }

        /**
         * Returns the analog signal this block emits. This is the signal a comparator can read from it.
         *
         * @deprecated call via {@link
         * net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase#getAnalogOutputSignal} whenever possible.
         * Implementing/overriding is fine.
         */
        public int getAnalogOutputSignal (BlockState pBlockState, Level pLevel, BlockPos pPos){
            return getOutputSignal(pBlockState.getValue(SLICES));
        }

        public static int getOutputSignal ( int pEaten){
            return (7 - pEaten) * 2;
        }

        /**
         * @deprecated call via {@link
         * net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase#hasAnalogOutputSignal} whenever possible.
         * Implementing/overriding is fine.
         */
        public boolean hasAnalogOutputSignal (BlockState pState){
            return true;
        }

        public boolean isPathfindable (BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType){
            return false;
        }
    }
