package com.iserver.plugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class PluginDescriptor {

	private String name, version, main, author;
	
	public PluginDescriptor(File file) throws IOException {
		JarFile jfile = new JarFile(file);
		JarEntry jentry = (JarEntry) jfile.getEntry("plugin.yml");
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File(jentry.getName())));
		
		this.name = properties.getProperty("name");
		this.version = properties.getProperty("version");
		this.main = properties.getProperty("version");
		this.author = properties.getProperty("author");
		
		if(file == null) {
			jfile.close();
		}
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
