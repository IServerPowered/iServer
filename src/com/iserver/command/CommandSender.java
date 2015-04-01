package com.iserver.command;

public interface CommandSender {

	public String getName();
	
	public void sendMessage(String message);
	
	public void sendMessage(String[] message);
}
