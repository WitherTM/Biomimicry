package tm.wither.biomimicry.common.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;
import tm.wither.biomimicry.core.init.ModItems;

public class CactusSpikeItem extends SwordItem {
    public CactusSpikeItem(Tier tier, int pDamage, float attackSpeed, Properties properties) {
        super(tier, pDamage, attackSpeed, properties);

    }
    @Override
    public boolean isValidRepairItem(@NotNull ItemStack stack, @NotNull ItemStack repairStack) {
        super.isValidRepairItem(stack, repairStack);
        return repairStack.getItem().equals(ModItems.DULL_CACTUS_SPIKE.get());

    }
}
