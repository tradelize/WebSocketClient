package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;
import com.tradelize.websocket.client.enums.SupportedStores;

public class OrderBookEntryForMarketDTO {
    @SerializedName("exchange")
    private SupportedStores exchange;
    @SerializedName("volume")
    private double volume;
    @SerializedName("price")
    private double price;
    @SerializedName("sum")
    private double sum;

    public SupportedStores getExchange() {
        return exchange;
    }

    public void setExchange(SupportedStores exchange) {
        this.exchange = exchange;
    }

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

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "OrderBookForMarketDTO{" +
                "exchange=" + exchange +
                ", volume=" + volume +
                ", price=" + price +
                ", sum=" + sum +
                '}';
    }
}
