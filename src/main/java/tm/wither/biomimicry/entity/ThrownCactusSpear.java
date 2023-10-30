package tm.wither.biomimicry.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import tm.wither.biomimicry.core.init.ModItems;

public class ThrownCactusSpear extends AbstractArrow {
    private ItemStack cactusSpearItem = new ItemStack(ModItems.CACTUS_SPEAR.get());
    public ThrownCactusSpear(EntityType<? extends ThrownCactusSpear> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ThrownCactusSpear(Level pLevel, LivingEntity pShooter, ItemStack pStack) {
        super(EntityType.TRIDENT, pShooter, pLevel);
        this.cactusSpearItem = pStack.copy();


    }

    public ItemStack getPickupItem() {
        return this.cactusSpearItem.copy();
    }
}