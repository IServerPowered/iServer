package com.iserver;

import java.util.logging.Logger;

public interface Server {

	public Logger getLogger();
	
	public String getName();
	
	public String getVersion();
	
	public void startServer();
	
	public void shutDown();
}
