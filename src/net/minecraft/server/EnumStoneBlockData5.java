package net.minecraft.server;

enum EnumStoneBlockData5 {;
    EnumStoneBlockData5(int i, String s, String s1) {}

    public IBlockData d() {
        return Blocks.STONEBRICK.getBlockData().set(BlockSmoothBrick.VARIANT, EnumStonebrickType.CRACKED);
    }
}
