package com.Gabrolas06.moreblocksmod.core.init;

import com.Gabrolas06.moreblocksmod.MBM;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MBM.MOD_ID);
	
	//Slabs
	public static final RegistryObject<BlockItem> GRASS_SLAB = ITEMS.register("grass_slab",
			() -> new BlockItem(BlockInit.GRASS_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> OBSIDIAN_SLAB = ITEMS.register("obsidian_slab",
			() -> new BlockItem(BlockInit.OBSIDIAN_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> IRON_SLAB = ITEMS.register("iron_slab",
			() -> new BlockItem(BlockInit.IRON_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> GOLD_SLAB = ITEMS.register("gold_slab",
			() -> new BlockItem(BlockInit.GOLD_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIAMOND_SLAB = ITEMS.register("diamond_slab",
			() -> new BlockItem(BlockInit.DIAMOND_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> EMERALD_SLAB = ITEMS.register("emerald_slab",
			() -> new BlockItem(BlockInit.EMERALD_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	//Stairs
	public static final RegistryObject<BlockItem> OBSIDIAN_STAIRS = ITEMS.register("obsidian_stairs",
			() -> new BlockItem(BlockInit.OBSIDIAN_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> IRON_STAIRS = ITEMS.register("iron_stairs",
			() -> new BlockItem(BlockInit.IRON_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> GOLD_STAIRS = ITEMS.register("gold_stairs",
			() -> new BlockItem(BlockInit.GOLD_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIAMOND_STAIRS = ITEMS.register("diamond_stairs",
			() -> new BlockItem(BlockInit.DIAMOND_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> EMERALD_STAIRS = ITEMS.register("emerald_stairs",
			() -> new BlockItem(BlockInit.EMERALD_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	//Walls
	public static final RegistryObject<BlockItem> PURPUR_WALL = ITEMS.register("purpur_wall",
			() -> new BlockItem(BlockInit.PURPUR_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> OAK_PLANKS_WALL = ITEMS.register("oak_planks_wall",
			() -> new BlockItem(BlockInit.OAK_PLANKS_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> SPRUCE_PLANKS_WALL = ITEMS.register("spruce_planks_wall",
			() -> new BlockItem(BlockInit.SPRUCE_PLANKS_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> BIRCH_PLANKS_WALL = ITEMS.register("birch_planks_wall",
			() -> new BlockItem(BlockInit.BIRCH_PLANKS_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> JUNGLE_PLANKS_WALL = ITEMS.register("jungle_planks_wall",
			() -> new BlockItem(BlockInit.JUNGLE_PLANKS_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ACACIA_PLANKS_WALL = ITEMS.register("acacia_planks_wall",
			() -> new BlockItem(BlockInit.ACACIA_PLANKS_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> DARK_OAK_PLANKS_WALL = ITEMS.register("dark_oak_planks_wall",
			() -> new BlockItem(BlockInit.DARK_OAK_PLANKS_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> STONE_WALL = ITEMS.register("stone_wall",
			() -> new BlockItem(BlockInit.STONE_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	//Fence Gates
	public static final RegistryObject<BlockItem> NETHER_BRICK_FENCE_GATE = ITEMS.register("nether_brick_fence_gate",
			() -> new BlockItem(BlockInit.NETHER_BRICK_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
	public static final RegistryObject<BlockItem> STONE_FENCE_GATE = ITEMS.register("stone_fence_gate",
			() -> new BlockItem(BlockInit.STONE_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
	
	//Fences
	public static final RegistryObject<BlockItem> STONE_FENCE = ITEMS.register("stone_fence",
			() -> new BlockItem(BlockInit.STONE_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	//Doors
	public static final RegistryObject<BlockItem> STONE_DOOR = ITEMS.register("stone_door",
			() -> new BlockItem(BlockInit.STONE_DOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
}
