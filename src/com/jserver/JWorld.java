package com.jserver;

import com.iserver.IServer;
import com.iserver.Position;
import com.iserver.World;

public class JWorld implements World {

	private int time;
	private String name;
	private long seed;
	
	private Position spawn;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getSeed() {
		return seed;
	}

	@Override
	public Position getSpawnPosition() {
		return spawn;
	}

	@Override
	public void setSpawnPosition(Position position) {
		this.spawn = position;
	}

	@Override
	public boolean isThundering() {
		return false;
	}

	@Override
	public void setThundering(boolean thunder) {
		
	}

	@Override
	public boolean isRaining() {
		return false;
	}

	@Override
	public void setRaining(boolean raining) {
		
	}

	@Override
	public int getThunderTime() {
		return 0;
	}

	@Override
	public void setThunderTime(int time) {
		
	}

	@Override
	public int getTime() {
		return time;
	}

	@Override
	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public boolean createExplosion(Position position, int force) {
		return false;
	}

	@Override
	public boolean createExplosion(Position position, int force, boolean fire) {
		return false;
	}

	@Override
	public int broadcastMessageInWorld(String message) {
		return 0;
	}

	@Override
	public void spawnEntity(int id, Position position) {
		
	}

	@Override
	public String getWorldDirectory() {
		return null;
	}
}
