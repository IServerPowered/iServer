package net.minecraft.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

class ServerConnectionChannel extends ChannelInitializer {

    final ServerConnection a;

    ServerConnectionChannel(ServerConnection serverconnection) {
        this.a = serverconnection;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
        } catch (ChannelException channelexception) {
            ;
        }

        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
        } catch (ChannelException channelexception1) {
            ;
        }

        channel.pipeline().addLast("timeout", (ChannelHandler) (new ReadTimeoutHandler(30))).addLast("legacy_query", (ChannelHandler) (new LegacyPingHandler(this.a))).addLast("splitter", (ChannelHandler) (new PacketSplitter())).addLast("decoder", (ChannelHandler) (new PacketDecoder(EnumProtocolDirection.SERVERBOUND))).addLast("prepender", (ChannelHandler) (new PacketPrepender())).addLast("encoder", (ChannelHandler) (new PacketEncoder(EnumProtocolDirection.CLIENTBOUND)));
        NetworkManager networkmanager = new NetworkManager(EnumProtocolDirection.SERVERBOUND);

        ServerConnection.a(this.a).add(networkmanager);
        channel.pipeline().addLast("packet_handler", (ChannelHandler) networkmanager);
        networkmanager.a((PacketListener) (new HandshakeListener(ServerConnection.b(this.a), networkmanager)));
    }
}
