package tm.wither.biomimicry.block;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import com.simibubi.create.content.processing.basin.BasinBlock;
import com.simibubi.create.content.processing.basin.BasinBlockEntity;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.Direction;

public class BrassBasinBlock extends BasinBlock implements IBE<BasinBlockEntity>, IWrenchable {
    public BrassBasinBlock(Properties pProperties) {
        super(pProperties);
        registerDefaultState(defaultBlockState().setValue(FACING, Direction.DOWN));
    }

}
