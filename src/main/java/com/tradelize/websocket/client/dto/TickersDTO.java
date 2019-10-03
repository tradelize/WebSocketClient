package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;
import com.tradelize.websocket.client.enums.SupportedStores;

import java.util.ArrayList;
import java.util.List;

public class TickersDTO {
    @SerializedName("exchange")
    private SupportedStores exchange;
    @SerializedName("exchange_ticker_info")
    private List<ExchangeTickerInfoDTO> exchangeTickerInfo = new ArrayList<>();

    public SupportedStores getExchange() {
        return exchange;
    }

    public void setExchange(SupportedStores exchange) {
        this.exchange = exchange;
    }

    public List<ExchangeTickerInfoDTO> getExchangeTickerInfo() {
        return exchangeTickerInfo;
    }

    public void setExchangeTickerInfo(List<ExchangeTickerInfoDTO> exchangeTickerInfo) {
        this.exchangeTickerInfo = exchangeTickerInfo;
    }

    @Override
    public String toString() {
        return "AllTickersDTO{" +
                "exchange=" + exchange +
                ", exchangeTickerInfo=" + exchangeTickerInfo +
                '}';
    }
}
