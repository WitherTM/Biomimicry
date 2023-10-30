package tm.wither.biomimicry;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import tm.wither.biomimicry.core.init.ModBlocks;
import tm.wither.biomimicry.core.init.ModEntities;
import tm.wither.biomimicry.core.init.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Biomimicry.MOD_ID)
public class Biomimicry {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "biomimicry";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Biomimicry() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CACTUS_FIBER);
            event.accept(ModItems.CACTUS_PULP);
            event.accept(ModItems.RAW_LEATHER);
            event.accept(ModItems.DRIED_CACTUS_PULP);
            event.accept(ModItems.DULL_CACTUS_SPIKE);
            event.accept(ModItems.LONELY_SWEET_BERRY);
            event.accept(ModItems.BROKEN_STICK);
            event.accept(ModItems.MEAT_COMPOUND);
            event.accept(ModItems.CARROT_PASTE);

        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.CACTUS_SPEAR);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.WASHED_CACTUS);
            event.accept(ModBlocks.WHEAT_GRASS);
        }
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.LONELY_SWEET_BERRY);
            event.accept(ModItems.CHOPPED_CARROTS);
            event.accept(ModItems.WHEAT_RICE_MIX);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
