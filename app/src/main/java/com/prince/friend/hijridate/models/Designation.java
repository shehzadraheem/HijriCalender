package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Designation {
    private String abbreviated;
    private String expanded;

    @JsonProperty("abbreviated")
    public String getAbbreviated() { return abbreviated; }
    @JsonProperty("abbreviated")
    public void setAbbreviated(String value) { this.abbreviated = value; }

    @JsonProperty("expanded")
    public String getExpanded() { return expanded; }
    @JsonProperty("expanded")
    public void setExpanded(String value) { this.expanded = value; }
}
