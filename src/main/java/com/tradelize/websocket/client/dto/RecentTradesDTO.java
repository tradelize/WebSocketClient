package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;
import com.tradelize.websocket.client.enums.OrderType;

public class RecentTradesDTO {
    @SerializedName("price")
    private double price;
    @SerializedName("volume")
    private double volume;
    @SerializedName("type")
    private OrderType type;
    @SerializedName("timestamp")
    private int timestamp;
    @SerializedName("date")
    private String date;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RecentTradesDTO{" +
                "price=" + price +
                ", volume=" + volume +
                ", type=" + type +
                ", timestamp=" + timestamp +
                ", date='" + date + '\'' +
                '}';
    }
}
