package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

public class Welcome {
    private long code;
    private String status;
    private List<Data> data;

    @JsonProperty("code")
    public long getCode() { return code; }
    @JsonProperty("code")
    public void setCode(long value) { this.code = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("data")
    public List<Data> getData() { return data; }
    @JsonProperty("data")
    public void setData(List<Data> value) { this.data = value; }
}
