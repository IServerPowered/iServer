package com.iserver.command;

import java.util.HashMap;

import com.iserver.ChatColor;

public class CommandManager {

	private HashMap<String, Command> commands = new HashMap<>();
	private static CommandManager instance = new CommandManager();

	public CommandManager() {
		this.registerCommand(new KickPlayerCmd());
	}

	public void handleCommand(CommandSender sender, String commandLabel) {

		String[] args = commandLabel.split(" ");
		String label = args[0];
		Command target = commands.get(label);

		if (!target.isUseCmd() && sender instanceof ConsoleCommandSender) {
			sender.sendMessage(ChatColor.RED + "You can't use the command " + target.getCmd());
		}

		if (!target.execute(sender, args)) {
			sender.sendMessage(ChatColor.RED + "Command doesn't exist if you wanna see all the command make" + ChatColor.BLUE + "/help");
		}

		target.execute(sender, args);
	}

	public void registerCommand(Command command) {
		synchronized (commands) {
			commands.put(command.getCmd(), command);
		}
	}

	public static CommandManager getCommandManager() {
		return instance;
	}
}
