package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderBookDTO {
    @SerializedName("selling")
    private List<OrderBookEntryDTO> selling;
    @SerializedName("buying")
    private List<OrderBookEntryDTO> buying;

    public List<OrderBookEntryDTO> getSelling() {
        return selling;
    }

    public void setSelling(List<OrderBookEntryDTO> selling) {
        this.selling = selling;
    }

    public List<OrderBookEntryDTO> getBuying() {
        return buying;
    }

    public void setBuying(List<OrderBookEntryDTO> buying) {
        this.buying = buying;
    }

    @Override
    public String toString() {
        return "OrderBookDTO{" +
                "selling=" + selling +
                ", buying=" + buying +
                '}';
    }
}
