package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GregorianMonth {
    private long number;
    private String en;

    @JsonProperty("number")
    public long getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(long value) { this.number = value; }

    @JsonProperty("en")
    public String getEn() { return en; }
    @JsonProperty("en")
    public void setEn(String value) { this.en = value; }
}
