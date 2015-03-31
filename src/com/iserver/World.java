package com.iserver;

public interface World {

	public String getName();
	
	public long getSeed();
	
	public Position getSpawnPosition();
	
	public void setSpawnPosition(Position position);
	
	public boolean isThundering(); 
	
	public void setThundering(boolean thunder);
	
	public boolean isRaining();
	
	public void setRaining(boolean raining);
	
	public int getThunderTime();
	
	public void setThunderTime(int time);
	
	public int getTime();
	
	public void setTime(int time);
	
	public boolean createExplosion(Position position, int force);
	
	public boolean createExplosion(Position position, int force, boolean fire);
	
	public int broadcastMessageInWorld(String message);
	
	public void spawnEntity(int id, Position position);
	
	public String getWorldDirectory();
}
