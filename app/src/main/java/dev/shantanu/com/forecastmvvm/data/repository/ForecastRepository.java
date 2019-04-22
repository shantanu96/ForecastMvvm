package dev.shantanu.com.forecastmvvm.data.repository;

import androidx.lifecycle.LiveData;
import dev.shantanu.com.forecastmvvm.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry;

public interface ForecastRepository {
    public LiveData<? extends UnitSpecificCurrentWeatherEntry> getCurrentWeather(boolean metric);
}
