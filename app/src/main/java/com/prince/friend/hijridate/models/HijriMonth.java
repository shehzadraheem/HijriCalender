package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HijriMonth {
    private long number;
    private String en;
    private String ar;

    @JsonProperty("number")
    public long getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(long value) { this.number = value; }

    @JsonProperty("en")
    public String getEn() { return en; }
    @JsonProperty("en")
    public void setEn(String value) { this.en = value; }

    @JsonProperty("ar")
    public String getAr() { return ar; }
    @JsonProperty("ar")
    public void setAr(String value) { this.ar = value; }
}
