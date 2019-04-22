package dev.shantanu.com.forecastmvvm.data.db.entity;

import com.google.gson.annotations.SerializedName;


public class Location {

    @SerializedName("localtime")
    private String localtime;

    @SerializedName("country")
    private String country;

    @SerializedName("localtime_epoch")
    private int localtimeEpoch;

    @SerializedName("name")
    private String name;

    @SerializedName("lon")
    private double lon;

    @SerializedName("region")
    private String region;

    @SerializedName("lat")
    private double lat;

    @SerializedName("tz_id")
    private String tzId;

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public void setLocaltimeEpoch(int localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getTzId() {
        return tzId;
    }

    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    @Override
    public String toString() {
        return
                "Location{" +
                        "localtime = '" + localtime + '\'' +
                        ",country = '" + country + '\'' +
                        ",localtime_epoch = '" + localtimeEpoch + '\'' +
                        ",name = '" + name + '\'' +
                        ",lon = '" + lon + '\'' +
                        ",region = '" + region + '\'' +
                        ",lat = '" + lat + '\'' +
                        ",tz_id = '" + tzId + '\'' +
                        "}";
    }
}