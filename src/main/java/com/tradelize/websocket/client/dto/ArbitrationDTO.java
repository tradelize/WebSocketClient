package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArbitrationDTO {
    @SerializedName("full_market")
    private String fullMarket;
    @SerializedName("market")
    private String market;
    @SerializedName("data")
    private List<ArbitrationEntryDTO> arbitrationEntries;

    public String getFullMarket() {
        return fullMarket;
    }

    public void setFullMarket(String fullMarket) {
        this.fullMarket = fullMarket;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public List<ArbitrationEntryDTO> getArbitrationEntries() {
        return arbitrationEntries;
    }

    public void setArbitrationEntries(List<ArbitrationEntryDTO> arbitrationEntries) {
        this.arbitrationEntries = arbitrationEntries;
    }

    @Override
    public String toString() {
        return "ArbitrationDTO{" +
                "fullMarket='" + fullMarket + '\'' +
                ", market='" + market + '\'' +
                ", data=" + arbitrationEntries +
                '}';
    }
}
