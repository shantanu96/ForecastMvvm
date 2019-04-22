package dev.shantanu.com.forecastmvvm.data.db.unitlocalized;

import androidx.room.ColumnInfo;

public class ImperialCurrentWeatherEntry extends UnitSpecificCurrentWeatherEntry {
    @ColumnInfo(name = "tempF")
    private Double temprature;
    @ColumnInfo(name = "condition_text")
    private String conditionText;
    @ColumnInfo(name = "condition_icon")
    private String conditionIconUrl;
    @ColumnInfo(name = "windMph")
    private Double windSpeed;
    @ColumnInfo(name = "windDir")
    private Double windDirection;
    @ColumnInfo(name = "precipIn")
    private Double precipitationVolume;
    @ColumnInfo(name = "feelslikeF")
    private Double feelsLikeTemprature;
    @ColumnInfo(name = "visMiles")
    private Double visibilityDistance;

    public Double getTemprature() {
        return temprature;
    }

    public void setTemprature(Double temprature) {
        this.temprature = temprature;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    public String getConditionIconUrl() {
        return conditionIconUrl;
    }

    public void setConditionIconUrl(String conditionIconUrl) {
        this.conditionIconUrl = conditionIconUrl;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public Double getPrecipitationVolume() {
        return precipitationVolume;
    }

    public void setPrecipitationVolume(Double precipitationVolume) {
        this.precipitationVolume = precipitationVolume;
    }

    public Double getFeelsLikeTemprature() {
        return feelsLikeTemprature;
    }

    public void setFeelsLikeTemprature(Double feelsLikeTemprature) {
        this.feelsLikeTemprature = feelsLikeTemprature;
    }

    public Double getVisibilityDistance() {
        return visibilityDistance;
    }

    public void setVisibilityDistance(Double visibilityDistance) {
        this.visibilityDistance = visibilityDistance;
    }
}
