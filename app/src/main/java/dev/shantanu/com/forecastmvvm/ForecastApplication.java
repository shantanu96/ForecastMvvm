package dev.shantanu.com.forecastmvvm;

import android.app.Application;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kodein.di.Kodein;
import org.kodein.di.KodeinAware;
import org.kodein.di.KodeinContext;
import org.kodein.di.KodeinTrigger;

public class ForecastApplication extends Application implements KodeinAware {
    @NotNull
    @Override
    public Kodein getKodein() {
        return null;
    }

    @NotNull
    @Override
    public KodeinContext<?> getKodeinContext() {
        return null;
    }

    @Nullable
    @Override
    public KodeinTrigger getKodeinTrigger() {
        return null;
    }
}
