package org.geysermc.mcprotocollib.protocol.data.status.handler;

import org.geysermc.mcprotocollib.protocol.data.status.ServerStatusInfo;
import org.geysermc.mcprotocollib.network.Session;

public interface ServerInfoHandler {
    void handle(Session session, ServerStatusInfo info);
}