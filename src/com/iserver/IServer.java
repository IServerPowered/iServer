package com.iserver;

public class IServer {

	private static Server server = null;
	
	public static void setServer(Server server) {
		if(IServer.server != null)
			System.err.println("Server already exist");
		
		IServer.server = server;
	}
	
	public static Server getServer() {
		return server;
	}
	
	public static void main(String[] args) {
		System.out.println("The IServer loading the librairies... Please wait.");
	}
}
