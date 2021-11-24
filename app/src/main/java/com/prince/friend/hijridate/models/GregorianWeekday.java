package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GregorianWeekday {
    private String en;

    @JsonProperty("en")
    public String getEn() { return en; }
    @JsonProperty("en")
    public void setEn(String value) { this.en = value; }
}
