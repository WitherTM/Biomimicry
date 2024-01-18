package tm.wither.biomimicry.core.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Biomimicry.MOD_ID);
    public static final RegistryObject<CreativeModeTab> BIOMIMICRY_TAB = CREATIVE_MODE_TABS.register("biomimicry_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_LEATHER.get()))
                    .title(Component.translatable("creativetab.biomimicry_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModBlocks.WASHED_CACTUS.get());
                      output.accept(ModItems.CACTUS_PULP.get());
                      output.accept(ModItems.DRIED_CACTUS_PULP.get());
                      output.accept(ModItems.CACTUS_SPINE.get());
                      output.accept(ModItems.CACTUS_FIBER.get());
                      output.accept(ModItems.RAW_LEATHER.get());
                      output.accept(ModItems.CHOPPED_ONIONS.get());
                      output.accept(ModItems.BREADCRUMBS.get());
                      output.accept(ModItems.CHEESE.get());
                      output.accept(ModItems.LONELY_SWEET_BERRY.get());
                      output.accept(ModItems.BROKEN_STICK.get());
                      output.accept(ModItems.RAW_MEATBALL.get());
                      output.accept(ModItems.MEATBALL.get());
                      output.accept(ModBlocks.CHEESE_WHEEL.get());
                      output.accept(ModBlocks.WHEAT_GRASS.get());
                      output.accept(ModItems.WHEAT_RICE_MIX.get());
                      output.accept(ModItems.CHOPPED_CARROTS.get());
                      output.accept(ModItems.CACTUS_SPEARHEAD.get());
                      output.accept(ModItems.CACTUS_SPEAR.get());
                      output.accept(ModItems.EMPTY_SAC.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
