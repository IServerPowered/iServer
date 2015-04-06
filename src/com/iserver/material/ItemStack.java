package com.iserver.material;

public class ItemStack {

	private int type = 0;
	private int amount = 0;
	private short durability = 0;

	private ItemMeta meta;

	protected ItemStack() {
	}

	public ItemStack(int type) {
		this(type, 1);
	}

	public ItemStack(int type, int amount) {
		this(type, amount, (short) 0);
	}

	public ItemStack(int type, int amount, short damage) {
		this.type = type;
		this.amount = amount;
		this.durability = damage;
	}

	public int getType() {
		return type;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public short getDurability() {
		return durability;
	}
	
	public ItemMeta getItemMeta() {
		return meta;
	}
	
	public void setItemMeta(ItemMeta meta) {
		this.meta = meta;
	}
}
