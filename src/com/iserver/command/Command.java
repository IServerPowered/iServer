package com.iserver.command;

public abstract class Command {

	private String cmd;
	private boolean useCmd;
	
	public Command(String cmd, boolean useCmd) {
		this.cmd = cmd;
		this.useCmd = useCmd;
	}

	public String getCmd() {
		return cmd;
	}

	public boolean isUseCmd() {
		return useCmd;
	}
	
	public abstract boolean execute(CommandSender sender, String[] args);
}
