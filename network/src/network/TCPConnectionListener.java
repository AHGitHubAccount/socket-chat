package network;

import sun.rmi.transport.tcp.TCPConnection;

public interface TCPConnectionListener {

    void onConnectionReady(network.TCPConnection tcpConnection);
    void onReceiveString(network.TCPConnection tcpConnection, String value);
    void onDisconnect(network.TCPConnection tcpConnection);
    void onException(network.TCPConnection tcpConnection, Exception e);


}
