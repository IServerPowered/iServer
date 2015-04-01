package com.iserver.entity;

import java.util.UUID;

import com.iserver.command.CommandSender;

public interface Player extends LivingEntity, CommandSender {

	public UUID getUniqueId();
	
	public void setDisplayName(String newName);
	
	public String getDisplayName();
	
	public void kickPlayer(String why);
	
	public void setBanned(boolean banned);
	
	public boolean isBanned();
}
