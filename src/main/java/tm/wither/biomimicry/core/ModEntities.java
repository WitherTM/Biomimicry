package tm.wither.biomimicry.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.common.entity.TestEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Biomimicry.MOD_ID);

    public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY =  ENTITIES.register("test_entity",
            () -> EntityType.Builder.of(TestEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 1.0f)
                    .fireImmune()
                    .build(new ResourceLocation(Biomimicry.MOD_ID, "test_entity").toString())
    );
}
