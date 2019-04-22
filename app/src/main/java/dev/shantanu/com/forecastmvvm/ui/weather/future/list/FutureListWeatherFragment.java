package dev.shantanu.com.forecastmvvm.ui.weather.future.list;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.shantanu.com.forecastmvvm.R;

public class FutureListWeatherFragment extends Fragment {

    private FutureListWeatherViewModel mViewModel;

    public static FutureListWeatherFragment newInstance() {
        return new FutureListWeatherFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.future_list_weather_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FutureListWeatherViewModel.class);
        // TODO: Use the ViewModel
    }

}
