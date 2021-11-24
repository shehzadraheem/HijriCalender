package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gregorian {
    private String date;
    private String format;
    private String day;
    private GregorianWeekday weekday;
    private GregorianMonth month;
    private String year;
    private Designation designation;

    @JsonProperty("date")
    public String getDate() { return date; }
    @JsonProperty("date")
    public void setDate(String value) { this.date = value; }

    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    @JsonProperty("day")
    public String getDay() { return day; }
    @JsonProperty("day")
    public void setDay(String value) { this.day = value; }

    @JsonProperty("weekday")
    public GregorianWeekday getWeekday() { return weekday; }
    @JsonProperty("weekday")
    public void setWeekday(GregorianWeekday value) { this.weekday = value; }

    @JsonProperty("month")
    public GregorianMonth getMonth() { return month; }
    @JsonProperty("month")
    public void setMonth(GregorianMonth value) { this.month = value; }

    @JsonProperty("year")
    public String getYear() { return year; }
    @JsonProperty("year")
    public void setYear(String value) { this.year = value; }

    @JsonProperty("designation")
    public Designation getDesignation() { return designation; }
    @JsonProperty("designation")
    public void setDesignation(Designation value) { this.designation = value; }
}
