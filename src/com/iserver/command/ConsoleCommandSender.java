package com.iserver.command;

public class ConsoleCommandSender implements CommandSender {
	
	@Override
	public String getName() {
		return "Console";
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void sendMessage(String[] message) {
		for(String m : message) sendMessage(m);
	}
}
