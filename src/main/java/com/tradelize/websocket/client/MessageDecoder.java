package com.tradelize.websocket.client;

import com.google.gson.Gson;
import com.tradelize.websocket.client.dto.ServerNotificationDTO;

import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<ServerNotificationDTO> {
    private final Gson gson = new Gson();

    @Override
    public ServerNotificationDTO decode(String message) {
        return gson.fromJson(message, ServerNotificationDTO.class);
    }

    @Override
    public boolean willDecode(String message) {
        return (message != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    @Override
    public void destroy() {
        // Close resources
    }
}