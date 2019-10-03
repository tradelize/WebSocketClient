package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;

public class OrderBookEntryDTO {
    @SerializedName("volume")
    private double volume;
    @SerializedName("price")
    private double price;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderBookPositionDTO{" +
                "volume=" + volume +
                ", price=" + price +
                '}';
    }
}
