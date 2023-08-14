package tm.wither.biomimicry.block.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import tm.wither.biomimicry.item.ModItems;

public class CactusSpikeItem extends SwordItem {
    public CactusSpikeItem(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);

    }
    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack stack1) {
        super.isValidRepairItem(stack, stack1);
        return stack.getItem().equals(ModItems.DULL_CACTUS_SPIKE.get());

    }
}
