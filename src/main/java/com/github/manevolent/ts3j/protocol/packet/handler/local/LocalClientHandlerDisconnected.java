package com.github.manevolent.ts3j.protocol.packet.handler.local;

import com.github.manevolent.ts3j.protocol.socket.client.LocalTeamspeakClientSocket;

public class LocalClientHandlerDisconnected extends LocalClientHandler {
    public LocalClientHandlerDisconnected(LocalTeamspeakClientSocket client) {
        super(client);
    }
}
