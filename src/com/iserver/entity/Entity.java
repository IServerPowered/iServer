package com.iserver.entity;

import com.iserver.Position;
import com.iserver.World;

public interface Entity {

	public String getName();
	
	public int getID();
	
	public Position getPosition();
	
	public void teleport(Position pos);
	
	public World getWorld();
}
