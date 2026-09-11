package com.ender_v1;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.*;

@Mod(EnderV1.MODID)
public class EnderV1 {
 public static final String MODID="ender_v1";
 public static final DeferredRegister.Blocks B=DeferredRegister.createBlocks(MODID);
 public static final DeferredRegister.Items I=DeferredRegister.createItems(MODID);
 private static BlockBehaviour.Properties wood(){return BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(2.0f);}
 public static final DeferredBlock<Block> ENDER_LOG=B.registerSimpleBlock("ender_log",wood().strength(2.5f));
 public static final DeferredBlock<Block> STRIPPED_ENDER_LOG=B.registerSimpleBlock("stripped_ender_log",wood());
 public static final DeferredBlock<Block> ENDER_PLANKS=B.registerSimpleBlock("ender_planks",wood());
 public static final DeferredBlock<Block> ENDER_LEAVES=B.registerSimpleBlock("ender_leaves",BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(.2f).noOcclusion());
 public static final DeferredBlock<Block> ENDER_GLOW=B.registerSimpleBlock("ender_glow",BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(.3f).lightLevel(s->15));
 public static final DeferredBlock<Block> ENDER_VINES=B.registerSimpleBlock("ender_vines",BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollision().strength(.2f).lightLevel(s->5));
 public static final DeferredBlock<Block> ENDERRITE_ORE=B.registerSimpleBlock("enderrite_ore",BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(50f,1200f).requiresCorrectToolForDrops());
 public static final DeferredBlock<Block> ENDERRITE_BLOCK=B.registerSimpleBlock("enderrite_block",BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(8f,1200f));
 public static final DeferredItem<Item> ENDER_FRUIT=I.registerSimpleItem("ender_fruit",new Item.Properties().food(new net.minecraft.world.food.FoodProperties.Builder().nutrition(4).saturationModifier(.4f).build()));
 public static final DeferredItem<Item> ENDERRITE=I.registerSimpleItem("enderrite");
 public EnderV1(IEventBus bus){B.register(bus);I.register(bus);}
}
