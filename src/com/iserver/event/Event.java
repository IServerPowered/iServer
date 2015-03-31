package com.iserver.event;

public abstract class Event {

	private boolean cancelled = false;
	
	public abstract String getName();
	
	public void setCancelled(boolean cancelled){
		this.cancelled = cancelled;
	}
	
	public boolean isCancelled() {
		return cancelled;
	}
}
