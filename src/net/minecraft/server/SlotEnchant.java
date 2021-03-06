package net.minecraft.server;

class SlotEnchant extends Slot {

    final ContainerEnchantTable index;

    SlotEnchant(ContainerEnchantTable containerenchanttable, IInventory iinventory, int i, int j, int k) {
        super(iinventory, i, j, k);
        this.index = containerenchanttable;
    }

    public boolean isAllowed(ItemStack itemstack) {
        return true;
    }

    public int getMaxStackSize() {
        return 1;
    }
}
