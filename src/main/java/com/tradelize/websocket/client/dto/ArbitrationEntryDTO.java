package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;
import com.tradelize.websocket.client.enums.SupportedStores;

public class ArbitrationEntryDTO {
    @SerializedName("exchange")
    private SupportedStores exchange;
    @SerializedName("price")
    private double price;

    public SupportedStores getExchange() {
        return exchange;
    }

    public void setExchange(SupportedStores exchange) {
        this.exchange = exchange;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ArbitrationEntryDTO{" +
                "exchange=" + exchange +
                ", price=" + price +
                '}';
    }
}
