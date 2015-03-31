package com.iserver.plugin;

import com.iserver.event.Event;
import com.iserver.event.Listener;

public interface PluginManager {

	public Plugin getPlugin(String name);
	
	public void callEvent(Event event);
	
	public void registerEvents(Listener listener);
}
