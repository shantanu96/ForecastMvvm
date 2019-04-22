package dev.shantanu.com.forecastmvvm.data.network;

import dev.shantanu.com.forecastmvvm.data.network.response.CurrentWeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApixuWeatherApiService {
    @GET("current.json")
    public Call<CurrentWeatherResponse> getCurrentWeather(
            @Query("q") String location,
            @Query("lang") String languageCode
    );
}
