package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    private Gregorian gregorian;
    private Hijri hijri;

    @JsonProperty("gregorian")
    public Gregorian getGregorian() { return gregorian; }
    @JsonProperty("gregorian")
    public void setGregorian(Gregorian value) { this.gregorian = value; }

    @JsonProperty("hijri")
    public Hijri getHijri() { return hijri; }
    @JsonProperty("hijri")
    public void setHijri(Hijri value) { this.hijri = value; }
}
