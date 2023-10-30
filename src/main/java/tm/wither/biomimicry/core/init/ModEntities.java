package tm.wither.biomimicry.core.init;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.entity.ThrownCactusSpear;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Biomimicry.MOD_ID);
    public static final RegistryObject<EntityType<ThrownCactusSpear>> THROWN_CACTUS_SPEAR =
            ENTITY_TYPES.register("thrown_cactus_spear", () -> EntityType.Builder.<ThrownCactusSpear>of(ThrownCactusSpear::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F).build("thrown_cactus_spear"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
