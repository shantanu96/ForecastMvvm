package dev.shantanu.com.forecastmvvm.data.db.entity;

import com.google.gson.annotations.SerializedName;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "current_weather")
public class CurrentWeatherEntry {

    public static final int CURRENT_WEATHER_ID = 0;

    @PrimaryKey(autoGenerate = false)
    private int id = CURRENT_WEATHER_ID;

    @SerializedName("feelslike_c")
    private double feelslikeC;

    @SerializedName("uv")
    private double uv;

    @SerializedName("last_updated")
    private String lastUpdated;

    @SerializedName("feelslike_f")
    private double feelslikeF;

    @SerializedName("wind_degree")
    private int windDegree;

    @SerializedName("last_updated_epoch")
    private int lastUpdatedEpoch;

    @SerializedName("is_day")
    private int isDay;

    @SerializedName("precip_in")
    private double precipIn;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("temp_c")
    private double tempC;

    @SerializedName("pressure_in")
    private double pressureIn;

    @SerializedName("temp_f")
    private double tempF;

    @SerializedName("precip_mm")
    private double precipMm;

    @SerializedName("cloud")
    private int cloud;

    @SerializedName("wind_kph")
    private double windKph;

    @Embedded(prefix = "condition_")
    private Condition condition;

    @SerializedName("wind_mph")
    private double windMph;

    @SerializedName("vis_km")
    private double visKm;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("pressure_mb")
    private double pressureMb;

    @SerializedName("vis_miles")
    private double visMiles;

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public int getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    @Override
    public String toString() {
        return
                "CurrentWeatherEntry{" +
                        "feelslike_c = '" + feelslikeC + '\'' +
                        ",uv = '" + uv + '\'' +
                        ",last_updated = '" + lastUpdated + '\'' +
                        ",feelslike_f = '" + feelslikeF + '\'' +
                        ",wind_degree = '" + windDegree + '\'' +
                        ",last_updated_epoch = '" + lastUpdatedEpoch + '\'' +
                        ",is_day = '" + isDay + '\'' +
                        ",precip_in = '" + precipIn + '\'' +
                        ",wind_dir = '" + windDir + '\'' +
                        ",temp_c = '" + tempC + '\'' +
                        ",pressure_in = '" + pressureIn + '\'' +
                        ",temp_f = '" + tempF + '\'' +
                        ",precip_mm = '" + precipMm + '\'' +
                        ",cloud = '" + cloud + '\'' +
                        ",wind_kph = '" + windKph + '\'' +
                        ",condition = '" + condition + '\'' +
                        ",wind_mph = '" + windMph + '\'' +
                        ",vis_km = '" + visKm + '\'' +
                        ",humidity = '" + humidity + '\'' +
                        ",pressure_mb = '" + pressureMb + '\'' +
                        ",vis_miles = '" + visMiles + '\'' +
                        "}";
    }
}