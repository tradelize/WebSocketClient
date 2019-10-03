package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;
import com.tradelize.websocket.client.enums.SupportedStores;

import java.util.Map;

public class AllMarketsDTO {
    @SerializedName("pair_name")
    private String pairName;
    @SerializedName("market_order_books")
    private Map<SupportedStores, OrderBookForMarketDTO> orderBookForMarket;

    public String getPairName() {
        return pairName;
    }

    public void setPairName(String pairName) {
        this.pairName = pairName;
    }

    public Map<SupportedStores, OrderBookForMarketDTO> getOrderBookForMarket() {
        return orderBookForMarket;
    }

    public void setOrderBookForMarket(Map<SupportedStores, OrderBookForMarketDTO> orderBookForMarket) {
        this.orderBookForMarket = orderBookForMarket;
    }

    @Override
    public String toString() {
        return "AllMarketsDTO{" +
                "pairName='" + pairName + '\'' +
                ", orderBookForMarket=" + orderBookForMarket +
                '}';
    }
}
