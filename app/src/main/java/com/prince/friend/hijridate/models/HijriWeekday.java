package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HijriWeekday {
    private String en;
    private String ar;

    @JsonProperty("en")
    public String getEn() { return en; }
    @JsonProperty("en")
    public void setEn(String value) { this.en = value; }

    @JsonProperty("ar")
    public String getAr() { return ar; }
    @JsonProperty("ar")
    public void setAr(String value) { this.ar = value; }

}
