package com.Gabrolas06.moreblocksmod.core.init;

import com.Gabrolas06.moreblocksmod.MBM;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MBM.MOD_ID);
	
	//Slabs
	public static final RegistryObject<SlabBlock> GRASS_SLAB = BLOCKS.register("grass_slab",
			() -> new SlabBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.GRASS).randomTicks().strength(0, 6f).sound(SoundType.GRASS).noOcclusion()));
	public static final RegistryObject<SlabBlock> OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab",
			() -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OBSIDIAN).noOcclusion()));
	public static final RegistryObject<SlabBlock> IRON_SLAB = BLOCKS.register("iron_slab",
			() -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
	public static final RegistryObject<SlabBlock> GOLD_SLAB = BLOCKS.register("gold_slab",
			() -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion()));
	public static final RegistryObject<SlabBlock> DIAMOND_SLAB = BLOCKS.register("diamond_slab",
			() -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion()));
	public static final RegistryObject<SlabBlock> EMERALD_SLAB = BLOCKS.register("emerald_slab",
			() -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.EMERALD_BLOCK).noOcclusion()));
	
	//Stairs
	public static final RegistryObject<StairsBlock> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs",
			() -> new StairsBlock(Blocks.OBSIDIAN.defaultBlockState(), Block.Properties.copy(Blocks.OBSIDIAN).noOcclusion()));
	public static final RegistryObject<StairsBlock> IRON_STAIRS = BLOCKS.register("iron_stairs",
			() -> new StairsBlock(Blocks.IRON_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
	public static final RegistryObject<StairsBlock> GOLD_STAIRS = BLOCKS.register("gold_stairs",
			() -> new StairsBlock(Blocks.GOLD_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion()));
	public static final RegistryObject<StairsBlock> DIAMOND_STAIRS = BLOCKS.register("diamond_stairs",
			() -> new StairsBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion()));
	public static final RegistryObject<StairsBlock> EMERALD_STAIRS = BLOCKS.register("emerald_stairs",
			() -> new StairsBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.EMERALD_BLOCK).noOcclusion()));
	
	//Walls
	public static final RegistryObject<WallBlock> PURPUR_WALL = BLOCKS.register("purpur_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.PURPUR_BLOCK).noOcclusion()));
	public static final RegistryObject<WallBlock> OAK_PLANKS_WALL = BLOCKS.register("oak_planks_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
	public static final RegistryObject<WallBlock> SPRUCE_PLANKS_WALL = BLOCKS.register("spruce_planks_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));
	public static final RegistryObject<WallBlock> BIRCH_PLANKS_WALL = BLOCKS.register("birch_planks_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()));
	public static final RegistryObject<WallBlock> JUNGLE_PLANKS_WALL = BLOCKS.register("jungle_planks_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));
	public static final RegistryObject<WallBlock> ACACIA_PLANKS_WALL = BLOCKS.register("acacia_planks_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));
	public static final RegistryObject<WallBlock> DARK_OAK_PLANKS_WALL = BLOCKS.register("dark_oak_planks_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
	public static final RegistryObject<WallBlock> STONE_WALL = BLOCKS.register("stone_wall",
			() -> new WallBlock(AbstractBlock.Properties.copy(Blocks.STONE).noOcclusion()));
	
	//Fence Gates
	public static final RegistryObject<FenceGateBlock> NETHER_BRICK_FENCE_GATE = BLOCKS.register("nether_brick_fence_gate",
			() -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.NETHER_BRICKS).noOcclusion()));
	public static final RegistryObject<FenceGateBlock> STONE_FENCE_GATE = BLOCKS.register("stone_fence_gate",
			() -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.STONE).noOcclusion()));
	
	//Fences
	public static final RegistryObject<FenceBlock> STONE_FENCE = BLOCKS.register("stone_fence",
			() -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.STONE).noOcclusion()));
	
	//Doors
	public static final RegistryObject<DoorBlock> STONE_DOOR = BLOCKS.register("stone_door",
			() -> new DoorBlock(AbstractBlock.Properties.copy(Blocks.STONE).noOcclusion()));
	
}