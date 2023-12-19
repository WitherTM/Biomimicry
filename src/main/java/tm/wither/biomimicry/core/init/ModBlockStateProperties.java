package tm.wither.biomimicry.core.init;

import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class ModBlockStateProperties extends BlockStateProperties {
    public static final IntegerProperty SLICES = IntegerProperty.create("slices",0,8);
}
