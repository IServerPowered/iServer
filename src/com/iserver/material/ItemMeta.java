package com.iserver.material;

import java.util.List;

public interface ItemMeta {

	public String getDisplayName();
	
	public void setDisplayName(String display);
	
	public boolean hasDisplayName();
	
	public List<String> getLore();
	
	public void setLore(List<String> lore);
	
	public boolean hasLore();
}
