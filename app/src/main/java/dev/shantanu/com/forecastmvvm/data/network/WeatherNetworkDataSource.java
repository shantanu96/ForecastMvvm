package dev.shantanu.com.forecastmvvm.data.network;

import androidx.lifecycle.LiveData;
import dev.shantanu.com.forecastmvvm.data.network.response.CurrentWeatherResponse;

public interface WeatherNetworkDataSource {
    LiveData<CurrentWeatherResponse> downloadedCurrentWeather = null;

    void fetechCurrentWeather(String location, String lang);
}
