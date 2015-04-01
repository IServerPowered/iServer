package com.iserver;

import java.util.UUID;
import java.util.logging.Logger;

import com.iserver.entity.Player;

public interface Server {

	public Logger getLogger();
	
	public String getName();
	
	public String getVersion();
	
	public void startServer();
	
	public void shutDown();
	
	public Player getPlayer(UUID uuid);
	
	public Player getPlayer(String name);
}
