package tm.wither.biomimicry.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;
import tm.wither.biomimicry.item.ModItems;

public class CactusSpikeItem extends SwordItem {
    public CactusSpikeItem(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);

    }
    @Override
    public boolean isValidRepairItem(@NotNull ItemStack stack, @NotNull ItemStack repairStack) {
        super.isValidRepairItem(stack, repairStack);
        return repairStack.getItem().equals(ModItems.DULL_CACTUS_SPIKE.get());

    }
}
