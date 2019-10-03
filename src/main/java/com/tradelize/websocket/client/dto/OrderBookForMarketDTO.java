package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderBookForMarketDTO {
    @SerializedName("bid")
    private List<OrderBookEntryForMarketDTO> bid;
    @SerializedName("ask")
    private List<OrderBookEntryForMarketDTO> ask;

    public List<OrderBookEntryForMarketDTO> getBid() {
        return bid;
    }

    public void setBid(List<OrderBookEntryForMarketDTO> bid) {
        this.bid = bid;
    }

    public List<OrderBookEntryForMarketDTO> getAsk() {
        return ask;
    }

    public void setAsk(List<OrderBookEntryForMarketDTO> ask) {
        this.ask = ask;
    }

    @Override
    public String toString() {
        return "OrderBookForMarketDTO{" +
                "bid=" + bid +
                ", ask=" + ask +
                '}';
    }
}
