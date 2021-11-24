package com.prince.friend.hijridate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Hijri {
    private String date;
    private String format;
    private String day;
    private HijriWeekday weekday;
    private HijriMonth month;
    private String year;
    private Designation designation;
    private List<Object> holidays;

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
    public HijriWeekday getWeekday() { return weekday; }
    @JsonProperty("weekday")
    public void setWeekday(HijriWeekday value) { this.weekday = value; }

    @JsonProperty("month")
    public HijriMonth getMonth() { return month; }
    @JsonProperty("month")
    public void setMonth(HijriMonth value) { this.month = value; }

    @JsonProperty("year")
    public String getYear() { return year; }
    @JsonProperty("year")
    public void setYear(String value) { this.year = value; }

    @JsonProperty("designation")
    public Designation getDesignation() { return designation; }
    @JsonProperty("designation")
    public void setDesignation(Designation value) { this.designation = value; }

    @JsonProperty("holidays")
    public List<Object> getHolidays() { return holidays; }
    @JsonProperty("holidays")
    public void setHolidays(List<Object> value) { this.holidays = value; }
}
