package net.minecraft.server;

import java.util.Arrays;
import java.util.Collection;

public enum EnumFlowerPotContents implements Comparable<EnumFlowerPotContents>, INamable, IBlockState<EnumFlowerPotContents> {

    EMPTY("empty"), POPPY("rose"), BLUE_ORCHID("blue_orchid"), ALLIUM("allium"), HOUSTONIA("houstonia"), RED_TULIP("red_tulip"), ORANGE_TULIP("orange_tulip"), WHITE_TULIP("white_tulip"), PINK_TULIP("pink_tulip"), OXEYE_DAISY("oxeye_daisy"), DANDELION("dandelion"), OAK_SAPLING("oak_sapling"), SPRUCE_SAPLING("spruce_sapling"), BIRCH_SAPLING("birch_sapling"), JUNGLE_SAPLING("jungle_sapling"), ACACIA_SAPLING("acacia_sapling"), DARK_OAK_SAPLING("dark_oak_sapling"), MUSHROOM_RED("mushroom_red"), MUSHROOM_BROWN("mushroom_brown"), DEAD_BUSH("dead_bush"), FERN("fern"), CACTUS("cactus");

    private final String w;

    private EnumFlowerPotContents(String s) {
        this.w = s;
    }

    public String toString() {
        return this.w;
    }

    public String getName() {
        return this.w;
    }

	@Override
	public String a() {
		return this.w != null ? w : "";
	}

	@Override
	public String a(EnumFlowerPotContents t0) {
		return t0.w;
	}

	@Override
	public Collection<EnumFlowerPotContents> c() {
		return Arrays.asList(EnumFlowerPotContents.values());
	}

	@Override
	public Class<EnumFlowerPotContents> b() {
		return EnumFlowerPotContents.class;
	}
}
