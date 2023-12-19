package tm.wither.biomimicry.core.init;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.entity.ThrownCactusSpear;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Biomimicry.MOD_ID);
    public static final RegistryObject<EntityType<ThrownCactusSpear>> THROWN_CACTUS_SPEAR =
            ENTITY_TYPES.register("thrown_cactus_spear", () -> EntityType.Builder.<ThrownCactusSpear>of(ThrownCactusSpear::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F).build("thrown_cactus_spear"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
