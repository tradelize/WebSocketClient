package com.tradelize.websocket.client;

import org.glassfish.tyrus.client.ClientManager;

import javax.websocket.ClientEndpointConfig;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

import static java.util.Collections.singletonList;

public class Main {
    private static final String ACCESS_KEY = "24a98797-1090-491e-a25c-796ab116a672";
    private static final String SERVER_URL = "95.216.149.105:8080";

    public static void main(String[] args) {
        try {
            URI serverURI = new URI("ws://" + SERVER_URL + "/tradelize-api/ws/" + ACCESS_KEY);
            CountDownLatch messageLatch = new CountDownLatch(1);
            final ClientEndpointConfig config = ClientEndpointConfig.Builder
                    .create()
                    .decoders(singletonList(MessageDecoder.class))
                    .build();

            ClientManager client = ClientManager.createClient();
            client.connectToServer(new TradelizeClient(messageLatch), config, serverURI);
            while (true) {
                messageLatch.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
