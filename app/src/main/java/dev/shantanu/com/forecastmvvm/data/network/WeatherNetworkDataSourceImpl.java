package dev.shantanu.com.forecastmvvm.data.network;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dev.shantanu.com.forecastmvvm.data.network.response.CurrentWeatherResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherNetworkDataSourceImpl implements WeatherNetworkDataSource {

    private LiveData<CurrentWeatherResponse> downloadedCurrentWeather;
    private MutableLiveData<CurrentWeatherResponse> _downloadedCurrentWeather;
    private ApixuWeatherApiService apixuWeatherApiService;

    public WeatherNetworkDataSourceImpl(ApixuWeatherApiService apixuWeatherApiService) {
        this.apixuWeatherApiService = apixuWeatherApiService;
        _downloadedCurrentWeather = new MutableLiveData<>();
    }

    public LiveData<CurrentWeatherResponse> getDownloadedCurrentWeather() {
        return _downloadedCurrentWeather;
    }

    @Override
    public void fetechCurrentWeather(String location, String lang) {

        Call<CurrentWeatherResponse> fetchedCurrentWeather = apixuWeatherApiService.getCurrentWeather(location, lang);

        fetchedCurrentWeather.enqueue(new Callback<CurrentWeatherResponse>() {
            @Override
            public void onResponse(Call<CurrentWeatherResponse> call, Response<CurrentWeatherResponse> response) {
                _downloadedCurrentWeather.postValue(response.body());
            }

            @Override
            public void onFailure(Call<CurrentWeatherResponse> call, Throwable t) {

            }
        });


    }
}
