package me.melonboy10.midi2building;

import java.util.ArrayList;
import java.util.List;

public enum SoundAtlas {
  HONEY(0, "HONEY_BLOCK"),
  CANDLE(1,
      "CANDLE",
      "WHITE_CANDLE",
      "ORANGE_CANDLE",
      "MAGENTA_CANDLE",
      "LIGHT_BLUE_CANDLE",
      "YELLOW_CANDLE",
      "LIME_CANDLE",
      "PINK_CANDLE",
      "GRAY_CANDLE",
      "LIGHT_GRAY_CANDLE",
      "CYAN_CANDLE",
      "PURPLE_CANDLE",
      "BLUE_CANDLE",
      "BROWN_CANDLE",
      "GREEN_CANDLE",
      "RED_CANDLE",
      "BLACK_CANDLE"),
  VINE(2, "VINE"),
  DRIPSTONE_BLOCK(3, "DRIPSTONE_BLOCK"),
  HANGING_ROOTS(4, "HANGING_ROOTS"),
  NYLIUM(5, "WARPED_NYLIUM", "CRIMSON_NYLIUM"),
  WOOD(6,
      "OAK_PLANKS",
      "SPRUCE_PLANKS",
      "BIRCH_PLANKS",
      "JUNGLE_PLANKS",
      "ACACIA_PLANKS",
      "DARK_OAK_PLANKS",
      "OAK_LOG",
      "SPRUCE_LOG",
      "BIRCH_LOG",
      "JUNGLE_LOG",
      "ACACIA_LOG",
      "DARK_OAK_LOG",
      "STRIPPED_SPRUCE_LOG",
      "STRIPPED_BIRCH_LOG",
      "STRIPPED_JUNGLE_LOG",
      "STRIPPED_ACACIA_LOG",
      "STRIPPED_DARK_OAK_LOG",
      "STRIPPED_OAK_LOG",
      "OAK_WOOD",
      "SPRUCE_WOOD",
      "BIRCH_WOOD",
      "JUNGLE_WOOD",
      "ACACIA_WOOD",
      "DARK_OAK_WOOD",
      "STRIPPED_OAK_WOOD",
      "STRIPPED_SPRUCE_WOOD",
      "STRIPPED_BIRCH_WOOD",
      "STRIPPED_JUNGLE_WOOD",
      "STRIPPED_ACACIA_WOOD",
      "STRIPPED_DARK_OAK_WOOD",
      "NOTE_BLOCK",
      "WHITE_BED",
      "ORANGE_BED",
      "MAGENTA_BED",
      "LIGHT_BLUE_BED",
      "YELLOW_BED",
      "LIME_BED",
      "PINK_BED",
      "GRAY_BED",
      "LIGHT_GRAY_BED",
      "CYAN_BED",
      "PURPLE_BED",
      "BLUE_BED",
      "BROWN_BED",
      "GREEN_BED",
      "RED_BED",
      "BLACK_BED",
      "PISTON_HEAD",
      "BOOKSHELF",
      "TORCH",
      "WALL_TORCH",
      "OAK_STAIRS",
      "CHEST",
      "CRAFTING_TABLE",
      "OAK_SIGN",
      "SPRUCE_SIGN",
      "BIRCH_SIGN",
      "ACACIA_SIGN",
      "JUNGLE_SIGN",
      "DARK_OAK_SIGN",
      "OAK_DOOR",
      "OAK_WALL_SIGN",
      "SPRUCE_WALL_SIGN",
      "BIRCH_WALL_SIGN",
      "ACACIA_WALL_SIGN",
      "JUNGLE_WALL_SIGN",
      "DARK_OAK_WALL_SIGN",
      "LEVER",
      "OAK_PRESSURE_PLATE",
      "SPRUCE_PRESSURE_PLATE",
      "BIRCH_PRESSURE_PLATE",
      "JUNGLE_PRESSURE_PLATE",
      "ACACIA_PRESSURE_PLATE",
      "DARK_OAK_PRESSURE_PLATE",
      "REDSTONE_TORCH",
      "REDSTONE_WALL_TORCH",
      "JUKEBOX",
      "OAK_FENCE",
      "PUMPKIN",
      "SOUL_TORCH",
      "SOUL_WALL_TORCH",
      "CARVED_PUMPKIN",
      "JACK_O_LANTERN",
      "REPEATER",
      "OAK_TRAPDOOR",
      "SPRUCE_TRAPDOOR",
      "BIRCH_TRAPDOOR",
      "JUNGLE_TRAPDOOR",
      "ACACIA_TRAPDOOR",
      "DARK_OAK_TRAPDOOR",
      "BROWN_MUSHROOM_BLOCK",
      "RED_MUSHROOM_BLOCK",
      "MUSHROOM_STEM",
      "MELON",
      "ATTACHED_PUMPKIN_STEM",
      "ATTACHED_MELON_STEM",
      "OAK_FENCE_GATE",
      "COCOA",
      "SPRUCE_STAIRS",
      "BIRCH_STAIRS",
      "JUNGLE_STAIRS",
      "OAK_BUTTON",
      "SPRUCE_BUTTON",
      "BIRCH_BUTTON",
      "JUNGLE_BUTTON",
      "ACACIA_BUTTON",
      "DARK_OAK_BUTTON",
      "TRAPPED_CHEST",
      "LIGHT_WEIGHTED_PRESSURE_PLATE",
      "HEAVY_WEIGHTED_PRESSURE_PLATE",
      "COMPARATOR",
      "DAYLIGHT_DETECTOR",
      "ACACIA_STAIRS",
      "DARK_OAK_STAIRS",
      "WHITE_BANNER",
      "ORANGE_BANNER",
      "MAGENTA_BANNER",
      "LIGHT_BLUE_BANNER",
      "YELLOW_BANNER",
      "LIME_BANNER",
      "PINK_BANNER",
      "GRAY_BANNER",
      "LIGHT_GRAY_BANNER",
      "CYAN_BANNER",
      "PURPLE_BANNER",
      "BLUE_BANNER",
      "BROWN_BANNER",
      "GREEN_BANNER",
      "RED_BANNER",
      "BLACK_BANNER",
      "WHITE_WALL_BANNER",
      "ORANGE_WALL_BANNER",
      "MAGENTA_WALL_BANNER",
      "LIGHT_BLUE_WALL_BANNER",
      "YELLOW_WALL_BANNER",
      "LIME_WALL_BANNER",
      "PINK_WALL_BANNER",
      "GRAY_WALL_BANNER",
      "LIGHT_GRAY_WALL_BANNER",
      "CYAN_WALL_BANNER",
      "PURPLE_WALL_BANNER",
      "BLUE_WALL_BANNER",
      "BROWN_WALL_BANNER",
      "GREEN_WALL_BANNER",
      "RED_WALL_BANNER",
      "BLACK_WALL_BANNER",
      "OAK_SLAB",
      "SPRUCE_SLAB",
      "BIRCH_SLAB",
      "JUNGLE_SLAB",
      "ACACIA_SLAB",
      "DARK_OAK_SLAB",
      "SPRUCE_FENCE_GATE",
      "BIRCH_FENCE_GATE",
      "JUNGLE_FENCE_GATE",
      "ACACIA_FENCE_GATE",
      "DARK_OAK_FENCE_GATE",
      "SPRUCE_FENCE",
      "BIRCH_FENCE",
      "JUNGLE_FENCE",
      "ACACIA_FENCE",
      "DARK_OAK_FENCE",
      "SPRUCE_DOOR",
      "BIRCH_DOOR",
      "JUNGLE_DOOR",
      "ACACIA_DOOR",
      "DARK_OAK_DOOR",
      "END_ROD",
      "CHORUS_PLANT",
      "CHORUS_FLOWER",
      "LOOM",
      "BARREL",
      "CARTOGRAPHY_TABLE",
      "FLETCHING_TABLE",
      "LECTERN",
      "SMITHING_TABLE",
      "CAMPFIRE",
      "SOUL_CAMPFIRE",
      "CRIMSON_PLANKS",
      "WARPED_PLANKS",
      "CRIMSON_SLAB",
      "WARPED_SLAB",
      "CRIMSON_PRESSURE_PLATE",
      "WARPED_PRESSURE_PLATE",
      "CRIMSON_FENCE",
      "WARPED_FENCE",
      "CRIMSON_TRAPDOOR",
      "WARPED_TRAPDOOR",
      "CRIMSON_FENCE_GATE",
      "WARPED_FENCE_GATE",
      "CRIMSON_STAIRS",
      "WARPED_STAIRS",
      "CRIMSON_BUTTON",
      "WARPED_BUTTON",
      "CRIMSON_DOOR",
      "WARPED_DOOR",
      "CRIMSON_SIGN",
      "WARPED_SIGN",
      "CRIMSON_WALL_SIGN",
      "WARPED_WALL_SIGN",
      "COMPOSTER",
      "BEE_NEST",
      "BEEHIVE"),
  NETHER_SPROUTS(7, "NETHER_SPROUTS"),
  NETHER_BRICK(
      8,
      "RED_NETHER_BRICK_STAIRS",
      "RED_NETHER_BRICK_SLAB",
      "NETHER_BRICK_WALL",
      "RED_NETHER_BRICK_WALL"),
  MOSS_CARPET(9, "MOSS_CARPET"),
  SMALL_AMETHYST_BUD(10, "SMALL_AMETHYST_BUD"),
  CROP(11, "WHEAT", "CARROTS", "POTATOES", "BEETROOTS"),
  ANVIL(12, "ANVIL", "CHIPPED_ANVIL", "DAMAGED_ANVIL", "BELL"),
  GRASS(
      13,
      "GRASS_BLOCK",
      "OAK_SAPLING",
      "SPRUCE_SAPLING",
      "BIRCH_SAPLING",
      "JUNGLE_SAPLING",
      "ACACIA_SAPLING",
      "DARK_OAK_SAPLING",
      "OAK_LEAVES",
      "SPRUCE_LEAVES",
      "BIRCH_LEAVES",
      "JUNGLE_LEAVES",
      "ACACIA_LEAVES",
      "DARK_OAK_LEAVES",
      "SPONGE",
      "WET_SPONGE",
      "GRASS",
      "FERN",
      "DEAD_BUSH",
      "DANDELION",
      "POPPY",
      "BLUE_ORCHID",
      "ALLIUM",
      "AZURE_BLUET",
      "RED_TULIP",
      "ORANGE_TULIP",
      "WHITE_TULIP",
      "PINK_TULIP",
      "OXEYE_DAISY",
      "CORNFLOWER",
      "WITHER_ROSE",
      "LILY_OF_THE_VALLEY",
      "BROWN_MUSHROOM",
      "RED_MUSHROOM",
      "TNT",
      "SUGAR_CANE",
      "MYCELIUM",
      "HAY_BLOCK",
      "SUNFLOWER",
      "LILAC",
      "ROSE_BUSH",
      "PEONY",
      "TALL_GRASS",
      "LARGE_FERN",
      "DIRT_PATH",
      "DRIED_KELP_BLOCK",
      "TARGET"),
  GLOW_LICHEN(14, "GLOW_LICHEN"),
  WART_BLOCK(15, "NETHER_WART_BLOCK", "WARPED_WART_BLOCK"),
  ROOTS(16, "WARPED_ROOTS", "CRIMSON_ROOTS"),
  WOOL(
      17,
      "WHITE_WOOL",
      "ORANGE_WOOL",
      "MAGENTA_WOOL",
      "LIGHT_BLUE_WOOL",
      "YELLOW_WOOL",
      "LIME_WOOL",
      "PINK_WOOL",
      "GRAY_WOOL",
      "LIGHT_GRAY_WOOL",
      "CYAN_WOOL",
      "PURPLE_WOOL",
      "BLUE_WOOL",
      "BROWN_WOOL",
      "GREEN_WOOL",
      "RED_WOOL",
      "BLACK_WOOL",
      "FIRE",
      "SOUL_FIRE",
      "CACTUS",
      "CAKE",
      "WHITE_CARPET",
      "ORANGE_CARPET",
      "MAGENTA_CARPET",
      "LIGHT_BLUE_CARPET",
      "YELLOW_CARPET",
      "LIME_CARPET",
      "PINK_CARPET",
      "GRAY_CARPET",
      "LIGHT_GRAY_CARPET",
      "CYAN_CARPET",
      "PURPLE_CARPET",
      "BLUE_CARPET",
      "BROWN_CARPET",
      "GREEN_CARPET",
      "RED_CARPET",
      "BLACK_CARPET",
      "CANDLE_CAKE",
      "WHITE_CANDLE_CAKE",
      "ORANGE_CANDLE_CAKE",
      "MAGENTA_CANDLE_CAKE",
      "LIGHT_BLUE_CANDLE_CAKE",
      "YELLOW_CANDLE_CAKE",
      "LIME_CANDLE_CAKE",
      "PINK_CANDLE_CAKE",
      "GRAY_CANDLE_CAKE",
      "LIGHT_GRAY_CANDLE_CAKE",
      "CYAN_CANDLE_CAKE",
      "PURPLE_CANDLE_CAKE",
      "BLUE_CANDLE_CAKE",
      "BROWN_CANDLE_CAKE",
      "GREEN_CANDLE_CAKE",
      "RED_CANDLE_CAKE",
      "BLACK_CANDLE_CAKE"),
  SLIME(18, "SLIME_BLOCK", "SEA_PICKLE"),
  LARGE_AMETHYST_BUD(19, "MEDIUM_AMETHYST_BUD"),
  SAND(
      20,
      "SAND",
      "RED_SAND",
      "WHITE_CONCRETE_POWDER",
      "ORANGE_CONCRETE_POWDER",
      "MAGENTA_CONCRETE_POWDER",
      "LIGHT_BLUE_CONCRETE_POWDER",
      "YELLOW_CONCRETE_POWDER",
      "LIME_CONCRETE_POWDER",
      "PINK_CONCRETE_POWDER",
      "GRAY_CONCRETE_POWDER",
      "LIGHT_GRAY_CONCRETE_POWDER",
      "CYAN_CONCRETE_POWDER",
      "PURPLE_CONCRETE_POWDER",
      "BLUE_CONCRETE_POWDER",
      "BROWN_CONCRETE_POWDER",
      "GREEN_CONCRETE_POWDER",
      "RED_CONCRETE_POWDER",
      "BLACK_CONCRETE_POWDER"),
  BAMBOO(21, "BAMBOO"),
  FUNGUS(22, "WARPED_FUNGUS", "CRIMSON_FUNGUS"),
  SNOW(23, "SNOW", "SNOW_BLOCK"),
  TUFF(24, "TUFF"),
  BAMBOO_SAPLING(25, "BAMBOO_SAPLING"),
  WEEPING_VINES(
      26, "WEEPING_VINES", "WEEPING_VINES_PLANT", "TWISTING_VINES", "TWISTING_VINES_PLANT"),
  DEEPSLATE(
      27,
      "DEEPSLATE_GOLD_ORE",
      "DEEPSLATE_IRON_ORE",
      "DEEPSLATE_COAL_ORE",
      "DEEPSLATE_LAPIS_ORE",
      "DEEPSLATE_DIAMOND_ORE",
      "DEEPSLATE_REDSTONE_ORE",
      "DEEPSLATE_EMERALD_ORE",
      "DEEPSLATE_COPPER_ORE",
      "DEEPSLATE",
      "COBBLED_DEEPSLATE",
      "COBBLED_DEEPSLATE_STAIRS",
      "COBBLED_DEEPSLATE_SLAB",
      "COBBLED_DEEPSLATE_WALL",
      "INFESTED_DEEPSLATE"),
  NETHER_GOLD_ORE(28, "NETHER_GOLD_ORE"),
  SPORE_BLOSSOM(29, "SPORE_BLOSSOM"),
  NETHER_WART(30, "NETHER_WART"),
  FLOWERING_AZALEA(31, "FLOWERING_AZALEA"),
  DEEPSLATE_TILES(
      32,
      "DEEPSLATE_TILES",
      "DEEPSLATE_TILE_STAIRS",
      "DEEPSLATE_TILE_SLAB",
      "DEEPSLATE_TILE_WALL",
      "CRACKED_DEEPSLATE_TILES"),
  SCULK_SENSOR(33, "SCULK_SENSOR"),
  AZALEA_LEAVES(34, "AZALEA_LEAVES", "FLOWERING_AZALEA_LEAVES"),
  METAL(
      35,
      "POWERED_RAIL",
      "DETECTOR_RAIL",
      "GOLD_BLOCK",
      "IRON_BLOCK",
      "SPAWNER",
      "DIAMOND_BLOCK",
      "RAIL",
      "IRON_DOOR",
      "IRON_BARS",
      "EMERALD_BLOCK",
      "REDSTONE_BLOCK",
      "HOPPER",
      "ACTIVATOR_RAIL",
      "IRON_TRAPDOOR",
      "TURTLE_EGG"),
  LILY_PAD(36, "LILY_PAD"),
  AMETHYST_BLOCK(37, "AMETHYST_BLOCK", "BUDDING_AMETHYST"),
  AZALEA(38, "AZALEA"),
  SHROOMLIGHT(39, "SHROOMLIGHT"),
  NETHER_ORE(40, "NETHER_QUARTZ_ORE"),
  MEDIUM_AMETHYST_BUD(41, "LARGE_AMETHYST_BUD"),
  CORAL(
      42,
      "TUBE_CORAL_BLOCK",
      "BRAIN_CORAL_BLOCK",
      "BUBBLE_CORAL_BLOCK",
      "FIRE_CORAL_BLOCK",
      "HORN_CORAL_BLOCK",
      "HONEYCOMB_BLOCK"),
  NETHERITE(43, "NETHERITE_BLOCK"),
  SMALL_DRIPLEAF(44, "SMALL_DRIPLEAF"),
  LADDER(45, "LADDER"),
  AMETHYST_CLUSTER(46, "AMETHYST_CLUSTER"),
  COPPER(
      47,
      "OXIDIZED_COPPER",
      "WEATHERED_COPPER",
      "EXPOSED_COPPER",
      "COPPER_BLOCK",
      "OXIDIZED_CUT_COPPER",
      "WEATHERED_CUT_COPPER",
      "EXPOSED_CUT_COPPER",
      "CUT_COPPER",
      "OXIDIZED_CUT_COPPER_STAIRS",
      "WEATHERED_CUT_COPPER_STAIRS",
      "EXPOSED_CUT_COPPER_STAIRS",
      "CUT_COPPER_STAIRS",
      "OXIDIZED_CUT_COPPER_SLAB",
      "WEATHERED_CUT_COPPER_SLAB",
      "EXPOSED_CUT_COPPER_SLAB",
      "CUT_COPPER_SLAB",
      "WAXED_COPPER_BLOCK",
      "WAXED_WEATHERED_COPPER",
      "WAXED_EXPOSED_COPPER",
      "WAXED_OXIDIZED_COPPER",
      "WAXED_OXIDIZED_CUT_COPPER",
      "WAXED_WEATHERED_CUT_COPPER",
      "WAXED_EXPOSED_CUT_COPPER",
      "WAXED_CUT_COPPER",
      "WAXED_OXIDIZED_CUT_COPPER_STAIRS",
      "WAXED_WEATHERED_CUT_COPPER_STAIRS",
      "WAXED_EXPOSED_CUT_COPPER_STAIRS",
      "WAXED_CUT_COPPER_STAIRS",
      "WAXED_OXIDIZED_CUT_COPPER_SLAB",
      "WAXED_WEATHERED_CUT_COPPER_SLAB",
      "WAXED_EXPOSED_CUT_COPPER_SLAB",
      "WAXED_CUT_COPPER_SLAB",
      "LIGHTNING_ROD"),
  GRAVEL(48, "DIRT", "COARSE_DIRT", "PODZOL", "GRAVEL", "FARMLAND", "CLAY"),
  MOSS_BLOCK(49, "MOSS_BLOCK"),
  BASALT(50, "BASALT", "POLISHED_BASALT", "SMOOTH_BASALT"),
  GILDED_BLACKSTONE(51, "GILDED_BLACKSTONE"),
  POINTED_DRIPSTONE(52, "POINTED_DRIPSTONE"),
  GLASS(
      53,
      "GLASS",
      "ICE",
      "GLOWSTONE",
      "NETHER_PORTAL",
      "WHITE_STAINED_GLASS",
      "ORANGE_STAINED_GLASS",
      "MAGENTA_STAINED_GLASS",
      "LIGHT_BLUE_STAINED_GLASS",
      "YELLOW_STAINED_GLASS",
      "LIME_STAINED_GLASS",
      "PINK_STAINED_GLASS",
      "GRAY_STAINED_GLASS",
      "LIGHT_GRAY_STAINED_GLASS",
      "CYAN_STAINED_GLASS",
      "PURPLE_STAINED_GLASS",
      "BLUE_STAINED_GLASS",
      "BROWN_STAINED_GLASS",
      "GREEN_STAINED_GLASS",
      "RED_STAINED_GLASS",
      "BLACK_STAINED_GLASS",
      "GLASS_PANE",
      "END_PORTAL_FRAME",
      "REDSTONE_LAMP",
      "WHITE_STAINED_GLASS_PANE",
      "ORANGE_STAINED_GLASS_PANE",
      "MAGENTA_STAINED_GLASS_PANE",
      "LIGHT_BLUE_STAINED_GLASS_PANE",
      "YELLOW_STAINED_GLASS_PANE",
      "LIME_STAINED_GLASS_PANE",
      "PINK_STAINED_GLASS_PANE",
      "GRAY_STAINED_GLASS_PANE",
      "LIGHT_GRAY_STAINED_GLASS_PANE",
      "CYAN_STAINED_GLASS_PANE",
      "PURPLE_STAINED_GLASS_PANE",
      "BLUE_STAINED_GLASS_PANE",
      "BROWN_STAINED_GLASS_PANE",
      "GREEN_STAINED_GLASS_PANE",
      "RED_STAINED_GLASS_PANE",
      "BLACK_STAINED_GLASS_PANE",
      "SEA_LANTERN",
      "PACKED_ICE",
      "FROSTED_ICE",
      "BLUE_ICE"),
  LANTERN(54, "LANTERN", "SOUL_LANTERN"),
  POLISHED_DEEPSLATE(
      55,
      "POLISHED_DEEPSLATE",
      "POLISHED_DEEPSLATE_STAIRS",
      "POLISHED_DEEPSLATE_SLAB",
      "POLISHED_DEEPSLATE_WALL"),
  POWDER_SNOW(56, "POWDER_SNOW"),
  BONE(57, "BONE_BLOCK"),
  ROOTED_DIRT(58, "ROOTED_DIRT"),
  ANCIENT_DEBRIS(59, "ANCIENT_DEBRIS"),
  NETHER_BRICKS(
      60,
      "NETHER_BRICKS",
      "NETHER_BRICK_FENCE",
      "NETHER_BRICK_STAIRS",
      "NETHER_BRICK_SLAB",
      "RED_NETHER_BRICKS",
      "CHISELED_NETHER_BRICKS",
      "CRACKED_NETHER_BRICKS"),
  DEEPSLATE_BRICKS(
      61,
      "DEEPSLATE_BRICKS",
      "DEEPSLATE_BRICK_STAIRS",
      "DEEPSLATE_BRICK_SLAB",
      "DEEPSLATE_BRICK_WALL",
      "CHISELED_DEEPSLATE",
      "CRACKED_DEEPSLATE_BRICKS"),
  SOUL_SAND(62, "SOUL_SAND"),
  BIG_DRIPLEAF(63, "BIG_DRIPLEAF", "BIG_DRIPLEAF_STEM"),
  LODESTONE(64, "LODESTONE"),
  STEM(65, "PUMPKIN_STEM", "MELON_STEM"),
  SCAFFOLDING(66, "SCAFFOLDING"),
  CHAIN(67, "CHAIN"),
  NETHER_STEM(
      68,
      "WARPED_STEM",
      "STRIPPED_WARPED_STEM",
      "WARPED_HYPHAE",
      "STRIPPED_WARPED_HYPHAE",
      "CRIMSON_STEM",
      "STRIPPED_CRIMSON_STEM",
      "CRIMSON_HYPHAE",
      "STRIPPED_CRIMSON_HYPHAE"),
  CAVE_VINES(69, "CAVE_VINES", "CAVE_VINES_PLANT"),
  NETHERRACK(70, "NETHERRACK"),
  WET_GRASS(
      71,
      "SEAGRASS",
      "TALL_SEAGRASS",
      "KELP",
      "KELP_PLANT",
      "TUBE_CORAL",
      "BRAIN_CORAL",
      "BUBBLE_CORAL",
      "FIRE_CORAL",
      "HORN_CORAL",
      "TUBE_CORAL_FAN",
      "BRAIN_CORAL_FAN",
      "BUBBLE_CORAL_FAN",
      "FIRE_CORAL_FAN",
      "HORN_CORAL_FAN",
      "TUBE_CORAL_WALL_FAN",
      "BRAIN_CORAL_WALL_FAN",
      "BUBBLE_CORAL_WALL_FAN",
      "FIRE_CORAL_WALL_FAN",
      "HORN_CORAL_WALL_FAN"),
  SWEET_BERRY_BUSH(72, "SWEET_BERRY_BUSH"),
  SOUL_SOIL(73, "SOUL_SOIL"),
  STONE(
      74,
      "AIR",
      "STONE",
      "GRANITE",
      "POLISHED_GRANITE",
      "DIORITE",
      "POLISHED_DIORITE",
      "ANDESITE",
      "POLISHED_ANDESITE",
      "COBBLESTONE",
      "BEDROCK",
      "WATER",
      "LAVA",
      "GOLD_ORE",
      "IRON_ORE",
      "COAL_ORE",
      "LAPIS_ORE",
      "LAPIS_BLOCK",
      "DISPENSER",
      "SANDSTONE",
      "CHISELED_SANDSTONE",
      "CUT_SANDSTONE",
      "STICKY_PISTON",
      "COBWEB",
      "PISTON",
      "MOVING_PISTON",
      "BRICKS",
      "MOSSY_COBBLESTONE",
      "OBSIDIAN",
      "REDSTONE_WIRE",
      "DIAMOND_ORE",
      "FURNACE",
      "COBBLESTONE_STAIRS",
      "STONE_PRESSURE_PLATE",
      "REDSTONE_ORE",
      "STONE_BUTTON",
      "STONE_BRICKS",
      "MOSSY_STONE_BRICKS",
      "CRACKED_STONE_BRICKS",
      "CHISELED_STONE_BRICKS",
      "INFESTED_STONE",
      "INFESTED_COBBLESTONE",
      "INFESTED_STONE_BRICKS",
      "INFESTED_MOSSY_STONE_BRICKS",
      "INFESTED_CRACKED_STONE_BRICKS",
      "INFESTED_CHISELED_STONE_BRICKS",
      "BRICK_STAIRS",
      "STONE_BRICK_STAIRS",
      "ENCHANTING_TABLE",
      "BREWING_STAND",
      "CAULDRON",
      "WATER_CAULDRON",
      "LAVA_CAULDRON",
      "POWDER_SNOW_CAULDRON",
      "END_PORTAL",
      "END_STONE",
      "DRAGON_EGG",
      "SANDSTONE_STAIRS",
      "EMERALD_ORE",
      "ENDER_CHEST",
      "TRIPWIRE_HOOK",
      "TRIPWIRE",
      "COMMAND_BLOCK",
      "BEACON",
      "COBBLESTONE_WALL",
      "MOSSY_COBBLESTONE_WALL",
      "FLOWER_POT",
      "POTTED_OAK_SAPLING",
      "POTTED_SPRUCE_SAPLING",
      "POTTED_BIRCH_SAPLING",
      "POTTED_JUNGLE_SAPLING",
      "POTTED_ACACIA_SAPLING",
      "POTTED_DARK_OAK_SAPLING",
      "POTTED_FERN",
      "POTTED_DANDELION",
      "POTTED_POPPY",
      "POTTED_BLUE_ORCHID",
      "POTTED_ALLIUM",
      "POTTED_AZURE_BLUET",
      "POTTED_RED_TULIP",
      "POTTED_ORANGE_TULIP",
      "POTTED_WHITE_TULIP",
      "POTTED_PINK_TULIP",
      "POTTED_OXEYE_DAISY",
      "POTTED_CORNFLOWER",
      "POTTED_LILY_OF_THE_VALLEY",
      "POTTED_WITHER_ROSE",
      "POTTED_RED_MUSHROOM",
      "POTTED_BROWN_MUSHROOM",
      "POTTED_DEAD_BUSH",
      "POTTED_CACTUS",
      "SKELETON_SKULL",
      "SKELETON_WALL_SKULL",
      "WITHER_SKELETON_SKULL",
      "WITHER_SKELETON_WALL_SKULL",
      "ZOMBIE_HEAD",
      "ZOMBIE_WALL_HEAD",
      "PLAYER_HEAD",
      "PLAYER_WALL_HEAD",
      "CREEPER_HEAD",
      "CREEPER_WALL_HEAD",
      "DRAGON_HEAD",
      "DRAGON_WALL_HEAD",
      "QUARTZ_BLOCK",
      "CHISELED_QUARTZ_BLOCK",
      "QUARTZ_PILLAR",
      "QUARTZ_STAIRS",
      "DROPPER",
      "WHITE_TERRACOTTA",
      "ORANGE_TERRACOTTA",
      "MAGENTA_TERRACOTTA",
      "LIGHT_BLUE_TERRACOTTA",
      "YELLOW_TERRACOTTA",
      "LIME_TERRACOTTA",
      "PINK_TERRACOTTA",
      "GRAY_TERRACOTTA",
      "LIGHT_GRAY_TERRACOTTA",
      "CYAN_TERRACOTTA",
      "PURPLE_TERRACOTTA",
      "BLUE_TERRACOTTA",
      "BROWN_TERRACOTTA",
      "GREEN_TERRACOTTA",
      "RED_TERRACOTTA",
      "BLACK_TERRACOTTA",
      "BARRIER",
      "LIGHT",
      "PRISMARINE",
      "PRISMARINE_BRICKS",
      "DARK_PRISMARINE",
      "PRISMARINE_STAIRS",
      "PRISMARINE_BRICK_STAIRS",
      "DARK_PRISMARINE_STAIRS",
      "PRISMARINE_SLAB",
      "PRISMARINE_BRICK_SLAB",
      "DARK_PRISMARINE_SLAB",
      "TERRACOTTA",
      "COAL_BLOCK",
      "RED_SANDSTONE",
      "CHISELED_RED_SANDSTONE",
      "CUT_RED_SANDSTONE",
      "RED_SANDSTONE_STAIRS",
      "STONE_SLAB",
      "SMOOTH_STONE_SLAB",
      "SANDSTONE_SLAB",
      "CUT_SANDSTONE_SLAB",
      "PETRIFIED_OAK_SLAB",
      "COBBLESTONE_SLAB",
      "BRICK_SLAB",
      "STONE_BRICK_SLAB",
      "QUARTZ_SLAB",
      "RED_SANDSTONE_SLAB",
      "CUT_RED_SANDSTONE_SLAB",
      "PURPUR_SLAB",
      "SMOOTH_STONE",
      "SMOOTH_SANDSTONE",
      "SMOOTH_QUARTZ",
      "SMOOTH_RED_SANDSTONE",
      "PURPUR_BLOCK",
      "PURPUR_PILLAR",
      "PURPUR_STAIRS",
      "END_STONE_BRICKS",
      "END_GATEWAY",
      "REPEATING_COMMAND_BLOCK",
      "CHAIN_COMMAND_BLOCK",
      "MAGMA_BLOCK",
      "STRUCTURE_VOID",
      "OBSERVER",
      "SHULKER_BOX",
      "WHITE_SHULKER_BOX",
      "ORANGE_SHULKER_BOX",
      "MAGENTA_SHULKER_BOX",
      "LIGHT_BLUE_SHULKER_BOX",
      "YELLOW_SHULKER_BOX",
      "LIME_SHULKER_BOX",
      "PINK_SHULKER_BOX",
      "GRAY_SHULKER_BOX",
      "LIGHT_GRAY_SHULKER_BOX",
      "CYAN_SHULKER_BOX",
      "PURPLE_SHULKER_BOX",
      "BLUE_SHULKER_BOX",
      "BROWN_SHULKER_BOX",
      "GREEN_SHULKER_BOX",
      "RED_SHULKER_BOX",
      "BLACK_SHULKER_BOX",
      "WHITE_GLAZED_TERRACOTTA",
      "ORANGE_GLAZED_TERRACOTTA",
      "MAGENTA_GLAZED_TERRACOTTA",
      "LIGHT_BLUE_GLAZED_TERRACOTTA",
      "YELLOW_GLAZED_TERRACOTTA",
      "LIME_GLAZED_TERRACOTTA",
      "PINK_GLAZED_TERRACOTTA",
      "GRAY_GLAZED_TERRACOTTA",
      "LIGHT_GRAY_GLAZED_TERRACOTTA",
      "CYAN_GLAZED_TERRACOTTA",
      "PURPLE_GLAZED_TERRACOTTA",
      "BLUE_GLAZED_TERRACOTTA",
      "BROWN_GLAZED_TERRACOTTA",
      "GREEN_GLAZED_TERRACOTTA",
      "RED_GLAZED_TERRACOTTA",
      "BLACK_GLAZED_TERRACOTTA",
      "WHITE_CONCRETE",
      "ORANGE_CONCRETE",
      "MAGENTA_CONCRETE",
      "LIGHT_BLUE_CONCRETE",
      "YELLOW_CONCRETE",
      "LIME_CONCRETE",
      "PINK_CONCRETE",
      "GRAY_CONCRETE",
      "LIGHT_GRAY_CONCRETE",
      "CYAN_CONCRETE",
      "PURPLE_CONCRETE",
      "BLUE_CONCRETE",
      "BROWN_CONCRETE",
      "GREEN_CONCRETE",
      "RED_CONCRETE",
      "BLACK_CONCRETE",
      "DEAD_TUBE_CORAL_BLOCK",
      "DEAD_BRAIN_CORAL_BLOCK",
      "DEAD_BUBBLE_CORAL_BLOCK",
      "DEAD_FIRE_CORAL_BLOCK",
      "DEAD_HORN_CORAL_BLOCK",
      "DEAD_TUBE_CORAL",
      "DEAD_BRAIN_CORAL",
      "DEAD_BUBBLE_CORAL",
      "DEAD_FIRE_CORAL",
      "DEAD_HORN_CORAL",
      "DEAD_TUBE_CORAL_FAN",
      "DEAD_BRAIN_CORAL_FAN",
      "DEAD_BUBBLE_CORAL_FAN",
      "DEAD_FIRE_CORAL_FAN",
      "DEAD_HORN_CORAL_FAN",
      "DEAD_TUBE_CORAL_WALL_FAN",
      "DEAD_BRAIN_CORAL_WALL_FAN",
      "DEAD_BUBBLE_CORAL_WALL_FAN",
      "DEAD_FIRE_CORAL_WALL_FAN",
      "DEAD_HORN_CORAL_WALL_FAN",
      "CONDUIT",
      "POTTED_BAMBOO",
      "VOID_AIR",
      "CAVE_AIR",
      "BUBBLE_COLUMN",
      "POLISHED_GRANITE_STAIRS",
      "SMOOTH_RED_SANDSTONE_STAIRS",
      "MOSSY_STONE_BRICK_STAIRS",
      "POLISHED_DIORITE_STAIRS",
      "MOSSY_COBBLESTONE_STAIRS",
      "END_STONE_BRICK_STAIRS",
      "STONE_STAIRS",
      "SMOOTH_SANDSTONE_STAIRS",
      "SMOOTH_QUARTZ_STAIRS",
      "GRANITE_STAIRS",
      "ANDESITE_STAIRS",
      "POLISHED_ANDESITE_STAIRS",
      "DIORITE_STAIRS",
      "POLISHED_GRANITE_SLAB",
      "SMOOTH_RED_SANDSTONE_SLAB",
      "MOSSY_STONE_BRICK_SLAB",
      "POLISHED_DIORITE_SLAB",
      "MOSSY_COBBLESTONE_SLAB",
      "END_STONE_BRICK_SLAB",
      "SMOOTH_SANDSTONE_SLAB",
      "SMOOTH_QUARTZ_SLAB",
      "GRANITE_SLAB",
      "ANDESITE_SLAB",
      "POLISHED_ANDESITE_SLAB",
      "DIORITE_SLAB",
      "BRICK_WALL",
      "PRISMARINE_WALL",
      "RED_SANDSTONE_WALL",
      "MOSSY_STONE_BRICK_WALL",
      "GRANITE_WALL",
      "STONE_BRICK_WALL",
      "ANDESITE_WALL",
      "SANDSTONE_WALL",
      "END_STONE_BRICK_WALL",
      "DIORITE_WALL",
      "SMOKER",
      "BLAST_FURNACE",
      "GRINDSTONE",
      "STONECUTTER",
      "STRUCTURE_BLOCK",
      "JIGSAW",
      "CRYING_OBSIDIAN",
      "RESPAWN_ANCHOR",
      "POTTED_CRIMSON_FUNGUS",
      "POTTED_WARPED_FUNGUS",
      "POTTED_CRIMSON_ROOTS",
      "POTTED_WARPED_ROOTS",
      "BLACKSTONE",
      "BLACKSTONE_STAIRS",
      "BLACKSTONE_WALL",
      "BLACKSTONE_SLAB",
      "POLISHED_BLACKSTONE",
      "POLISHED_BLACKSTONE_BRICKS",
      "CRACKED_POLISHED_BLACKSTONE_BRICKS",
      "CHISELED_POLISHED_BLACKSTONE",
      "POLISHED_BLACKSTONE_BRICK_SLAB",
      "POLISHED_BLACKSTONE_BRICK_STAIRS",
      "POLISHED_BLACKSTONE_BRICK_WALL",
      "POLISHED_BLACKSTONE_STAIRS",
      "POLISHED_BLACKSTONE_SLAB",
      "POLISHED_BLACKSTONE_PRESSURE_PLATE",
      "POLISHED_BLACKSTONE_BUTTON",
      "POLISHED_BLACKSTONE_WALL",
      "QUARTZ_BRICKS",
      "TINTED_GLASS",
      "COPPER_ORE",
      "RAW_IRON_BLOCK",
      "RAW_COPPER_BLOCK",
      "RAW_GOLD_BLOCK",
      "POTTED_AZALEA_BUSH",
      "POTTED_FLOWERING_AZALEA_BUSH"),
  CALCITE(75, "CALCITE");

  public final ArrayList<String> blocks;
  public int textureID;

  SoundAtlas(int textureID, String... block) {
    this.textureID = textureID;
    this.blocks = new ArrayList<>(List.of(block));
  }
}
