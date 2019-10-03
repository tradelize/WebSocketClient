package com.tradelize.websocket.client.dto;

import com.google.gson.annotations.SerializedName;

public class TickerInfoDTO {
    @SerializedName("full_pair_name")
    private String fullNamePair;
    @SerializedName("last")
    private double last;
    @SerializedName("bid")
    private double bid;
    @SerializedName("asc")
    private double asc;
    @SerializedName("high")
    private double high;
    @SerializedName("low")
    private double low;
    @SerializedName("volume")
    private double volume;
    @SerializedName("last_change")
    private double lastChange;
    @SerializedName("last_change_percent")
    private double lastChangePercent;
    @SerializedName("spread")
    private double spread;
    @SerializedName("low_change_percent")
    private double lowChangePercent;
    @SerializedName("high_change_percent")
    private double highChangePercent;
    @SerializedName("timestamp")
    private int timestamp;

    public String getFullNamePair() {
        return fullNamePair;
    }

    public void setFullNamePair(String fullNamePair) {
        this.fullNamePair = fullNamePair;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsc() {
        return asc;
    }

    public void setAsc(double asc) {
        this.asc = asc;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLastChange() {
        return lastChange;
    }

    public void setLastChange(double lastChange) {
        this.lastChange = lastChange;
    }

    public double getLastChangePercent() {
        return lastChangePercent;
    }

    public void setLastChangePercent(double lastChangePercent) {
        this.lastChangePercent = lastChangePercent;
    }

    public double getSpread() {
        return spread;
    }

    public void setSpread(double spread) {
        this.spread = spread;
    }

    public double getLowChangePercent() {
        return lowChangePercent;
    }

    public void setLowChangePercent(double lowChangePercent) {
        this.lowChangePercent = lowChangePercent;
    }

    public double getHighChangePercent() {
        return highChangePercent;
    }

    public void setHighChangePercent(double highChangePercent) {
        this.highChangePercent = highChangePercent;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "TickerInfoDTO{" +
                "fullNamePair='" + fullNamePair + '\'' +
                ", last=" + last +
                ", bid=" + bid +
                ", asc=" + asc +
                ", high=" + high +
                ", low=" + low +
                ", volume=" + volume +
                ", lastChange=" + lastChange +
                ", lastChangePercent=" + lastChangePercent +
                ", spread=" + spread +
                ", lowChangePercent=" + lowChangePercent +
                ", highChangePercent=" + highChangePercent +
                ", timestamp=" + timestamp +
                '}';
    }
}
