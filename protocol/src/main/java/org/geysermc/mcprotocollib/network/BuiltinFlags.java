package org.geysermc.mcprotocollib.network;

import java.net.InetSocketAddress;

/**
 * Built-in PacketLib session flags.
 */
public class BuiltinFlags {
    /**
     * When set to true, enables printing internal debug messages.
     */
    public static final Flag<Boolean> PRINT_DEBUG = new Flag<>("print-packetlib-debug", Boolean.class);

    public static final Flag<Boolean> ENABLE_CLIENT_PROXY_PROTOCOL = new Flag<>("enable-client-proxy-protocol", Boolean.class);

    public static final Flag<InetSocketAddress> CLIENT_PROXIED_ADDRESS = new Flag<>("client-proxied-address", InetSocketAddress.class);

    /**
     * When set to false, an SRV record resolve is not attempted.
     */
    public static final Flag<Boolean> ATTEMPT_SRV_RESOLVE = new Flag<>("attempt-srv-resolve", Boolean.class);

    private BuiltinFlags() {
    }
}