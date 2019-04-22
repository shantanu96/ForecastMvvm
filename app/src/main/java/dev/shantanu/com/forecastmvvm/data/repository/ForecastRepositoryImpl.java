package dev.shantanu.com.forecastmvvm.data.repository;

import android.os.Build;

import java.time.ZonedDateTime;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import dev.shantanu.com.forecastmvvm.data.db.CurrentWeatherDao;
import dev.shantanu.com.forecastmvvm.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry;
import dev.shantanu.com.forecastmvvm.data.network.WeatherNetworkDataSource;
import dev.shantanu.com.forecastmvvm.data.network.response.CurrentWeatherResponse;

public class ForecastRepositoryImpl implements ForecastRepository {

    private CurrentWeatherDao currentWeatherDao;
    private WeatherNetworkDataSource weatherNetworkDataSource;

    public ForecastRepositoryImpl(CurrentWeatherDao currentWeatherDao, WeatherNetworkDataSource weatherNetworkDataSource) {
        this.currentWeatherDao = currentWeatherDao;
        this.weatherNetworkDataSource = weatherNetworkDataSource;
        weatherNetworkDataSource.downloadedCurrentWeather.observeForever(new Observer<CurrentWeatherResponse>() {
            @Override
            public void onChanged(CurrentWeatherResponse currentWeatherResponse) {

            }
        });

    }

    @Override
    public LiveData<? extends UnitSpecificCurrentWeatherEntry> getCurrentWeather(boolean metric) {
        initWeatherData();
        if (metric)
            return currentWeatherDao.getWeatherMetric();
        else
            return currentWeatherDao.getWeatherImperial();
    }

    private void persistFetchedCurrentWeather(CurrentWeatherResponse fetchedManager) {
        currentWeatherDao.upsert(fetchedManager.getCurrentWeatherEntry());
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void initWeatherData() {
        if (isFetchCurrentNeeded(ZonedDateTime.now().minusHours(1)))
            fetchCurrentWeather();
    }

    private void fetchCurrentWeather() {
        weatherNetworkDataSource.fetechCurrentWeather("Mumbai", "en");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private boolean isFetchCurrentNeeded(ZonedDateTime lastFetchTime) {
        ZonedDateTime thirtyMinutesAgo = ZonedDateTime.now().minusMinutes(30);
        return lastFetchTime.isBefore(thirtyMinutesAgo);
    }
}
