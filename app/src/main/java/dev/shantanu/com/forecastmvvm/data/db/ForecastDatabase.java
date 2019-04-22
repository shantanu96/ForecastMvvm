package dev.shantanu.com.forecastmvvm.data.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import dev.shantanu.com.forecastmvvm.data.db.entity.CurrentWeatherEntry;

@Database(entities = {CurrentWeatherEntry.class}, version = 1)
public abstract class ForecastDatabase extends RoomDatabase {

    private static ForecastDatabase INSTANCE;

    public static ForecastDatabase getForecastDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ForecastDatabase.class, "forecast.db")
                    .allowMainThreadQueries()
                    .build();
        }

        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    public abstract CurrentWeatherDao currentWeatherDao();
}
