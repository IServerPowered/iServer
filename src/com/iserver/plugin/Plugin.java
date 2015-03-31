package com.iserver.plugin;

public abstract class Plugin {

	public String name;
	public String version;
	public String main;
	public String author;
	
	private PluginDescriptor descriptor;
	
	public Plugin() {
	}
	
	public void onEnable() {
	}
	
	public void onDisable() {
	}

	public void initPlugin() {
		this.name = getDescriptor().getName();
		this.version = getDescriptor().getVersion();
		this.main = getDescriptor().getMain();
		this.author = getDescriptor().getAuthor();
	}
	
	public String dataFolder() {
		return "plugins/" + getName() + ".jar";
	}
	
	public void loadPluginDescriptor(PluginDescriptor descriptor) {
		this.descriptor = descriptor;
	}
	
	public PluginDescriptor getDescriptor() {
		return descriptor;
	}
	
	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public String getMain() {
		return main;
	}

	public String getAuthor() {
		return author;
	}
}
