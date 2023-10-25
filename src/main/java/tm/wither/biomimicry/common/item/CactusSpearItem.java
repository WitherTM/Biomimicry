package tm.wither.biomimicry.common.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import tm.wither.biomimicry.core.init.ModItems;

public class CactusSpearItem extends SwordItem {

    public CactusSpearItem(Tier tier, int pDamage, float attackSpeed, Properties properties) {
        super(tier, pDamage, attackSpeed, properties);

    }
    @Override
    public boolean isValidRepairItem(@NotNull ItemStack stack, @NotNull ItemStack repairStack) {
        super.isValidRepairItem(stack, repairStack);
        return repairStack.getItem().equals(ModItems.DULL_CACTUS_SPIKE.get());

    }

    @Override
    public void releaseUsing(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntityLiving, int pTimeLeft) {
        super.releaseUsing(pStack, pLevel, pEntityLiving, pTimeLeft);
    }
}
