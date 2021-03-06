package net.minecraft.server;

import java.util.Iterator;

public class CommandGamemodeDefault extends CommandGamemode {

    public CommandGamemodeDefault() {}

    public String getCommand() {
        return "defaultgamemode";
    }

    public String getUsage(ICommandListener icommandlistener) {
        return "commands.defaultgamemode.usage";
    }

    public void execute(ICommandListener icommandlistener, String[] astring) throws CommandException {
        if (astring.length <= 0) {
            throw new ExceptionUsage("commands.defaultgamemode.usage", new Object[0]);
        } else {
            WorldSettings.a worldsettings_a = this.h(icommandlistener, astring[0]);

            this.a(worldsettings_a);
            a(icommandlistener, this, "commands.defaultgamemode.success", new Object[] { new ChatMessage("gameMode." + worldsettings_a.b(), new Object[0])});
        }
    }

    protected void a(WorldSettings.a worldsettings_a) {
        MinecraftServer minecraftserver = MinecraftServer.getServer();

        minecraftserver.setGamemode(worldsettings_a);
        EntityPlayer entityplayer;

        if (minecraftserver.getForceGamemode()) {
            for (Iterator iterator = MinecraftServer.getServer().getPlayerList().v().iterator(); iterator.hasNext(); entityplayer.fallDistance = 0.0F) {
                entityplayer = (EntityPlayer) iterator.next();
                entityplayer.a(worldsettings_a);
            }
        }

    }
}
