package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;

public class ExchangeTickerInfoDTO {
    @SerializedName("pair")
    private String pair;
    @SerializedName("ticker_info")
    private TickerInfoDTO tickerInfo;

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public TickerInfoDTO getTickerInfo() {
        return tickerInfo;
    }

    public void setTickerInfo(TickerInfoDTO tickerInfo) {
        this.tickerInfo = tickerInfo;
    }

    @Override
    public String toString() {
        return "TickerInfoEntryDTO{" +
                "pair='" + pair + '\'' +
                ", tickerInfo=" + tickerInfo +
                '}';
    }
}
