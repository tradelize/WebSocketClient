package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;
import com.tradelize.websocket.client.enums.NotificationEvent;
import com.tradelize.websocket.client.enums.SupportedStores;

public class ServerNotificationDTO<T> {
    @SerializedName("exchange")
    private SupportedStores exchange;
    @SerializedName("event")
    private NotificationEvent event;
    @SerializedName("market")
    private String market;
    @SerializedName("data")
    private T data;
    @SerializedName("server_sent_timestamp")
    private long serverSendTimestamp;

    public ServerNotificationDTO() {
        this.serverSendTimestamp = System.currentTimeMillis();
    }

    public ServerNotificationDTO(SupportedStores exchange, NotificationEvent event, String market) {
        this();
        this.exchange = exchange;
        this.event = event;
        this.market = market;
    }

    public ServerNotificationDTO(SupportedStores exchange, NotificationEvent event) {
        this();
        this.exchange = exchange;
        this.event = event;
    }

    public ServerNotificationDTO(NotificationEvent event, String market) {
        this();
        this.event = event;
        this.market = market;
    }

    public SupportedStores getExchange() {
        return exchange;
    }

    public void setExchange(SupportedStores exchange) {
        this.exchange = exchange;
    }

    public NotificationEvent getEvent() {
        return event;
    }

    public void setEvent(NotificationEvent event) {
        this.event = event;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getServerSendTimestamp() {
        return serverSendTimestamp;
    }

    public void setServerSendTimestamp(long serverSendTimestamp) {
        this.serverSendTimestamp = serverSendTimestamp;
    }

    @Override
    public String toString() {
        return "ServerNotificationDTO{" +
                "exchange=" + exchange +
                ", event=" + event +
                ", market='" + market + '\'' +
                ", data='" + data + '\'' +
                ", serverSendTimestamp=" + serverSendTimestamp +
                '}';
    }
}
