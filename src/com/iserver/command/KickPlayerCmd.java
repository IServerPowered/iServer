package com.iserver.command;

import com.iserver.ChatColor;
import com.iserver.IServer;
import com.iserver.entity.Player;

public class KickPlayerCmd extends Command {

	public KickPlayerCmd() {
		super("kick", true);
	}

	@Override
	public boolean execute(CommandSender sender, String[] args) {
		
		if(args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Please specify a player !");
		}
		
		Player target = null;
		
		if(args.length >= 1) {
			//target = IServer.getServer().getPlayer(args[0]);
			
			for(int i = 1; i < args.length; i++) {
				if(args[i] != null) {
					//target.kickPlayer(args[i]);
				}
			}
		}
		
		return true;
	}
}
