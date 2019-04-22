package dev.shantanu.com.forecastmvvm.data.network.response;


import com.google.gson.annotations.SerializedName;

import dev.shantanu.com.forecastmvvm.data.db.entity.CurrentWeatherEntry;
import dev.shantanu.com.forecastmvvm.data.db.entity.Location;

public class CurrentWeatherResponse {

    @SerializedName("current")
    private CurrentWeatherEntry currentWeatherEntry;

    @SerializedName("location")
    private Location location;

    public CurrentWeatherEntry getCurrentWeatherEntry() {
        return currentWeatherEntry;
    }

    public void setCurrentWeatherEntry(CurrentWeatherEntry currentWeatherEntry) {
        this.currentWeatherEntry = currentWeatherEntry;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return
                "CurrentWeatherResponse{" +
                        "currentWeatherEntry = '" + currentWeatherEntry + '\'' +
                        ",location = '" + location + '\'' +
                        "}";
    }
}