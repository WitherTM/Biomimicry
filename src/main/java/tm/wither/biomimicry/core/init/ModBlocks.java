package tm.wither.biomimicry.core.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.block.WashedCactusBlock;
import tm.wither.biomimicry.block.WheatGrassBlock;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(BuiltInRegistries.BLOCK, Biomimicry.MOD_ID);
    public static final DeferredHolder<Block, WashedCactusBlock> WASHED_CACTUS = BLOCKS.register("washed_cactus",
            () -> new WashedCactusBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));
    public static final DeferredHolder<Block, WheatGrassBlock> WHEAT_GRASS = BLOCKS.register("wheat_grass",
            () -> new WheatGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS)));


    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> DeferredHolder<Item, BlockItem> registerBlockItem(String name, Supplier<T> block) {
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));

    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
