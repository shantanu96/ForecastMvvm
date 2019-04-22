package dev.shantanu.com.forecastmvvm.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import dev.shantanu.com.forecastmvvm.data.db.entity.CurrentWeatherEntry;
import dev.shantanu.com.forecastmvvm.data.db.unitlocalized.ImperialCurrentWeatherEntry;
import dev.shantanu.com.forecastmvvm.data.db.unitlocalized.MetricCurrentWeatherEntry;

@Dao
public interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void upsert(CurrentWeatherEntry currentWeatherEntry);

    @Query("select * from current_weather where id = " + CurrentWeatherEntry.CURRENT_WEATHER_ID)
    public LiveData<MetricCurrentWeatherEntry> getWeatherMetric();

    @Query("select * from current_weather where id = " + CurrentWeatherEntry.CURRENT_WEATHER_ID)
    public LiveData<ImperialCurrentWeatherEntry> getWeatherImperial();
}
