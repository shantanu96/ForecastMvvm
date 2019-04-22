package dev.shantanu.com.forecastmvvm.ui.weather.current;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import dev.shantanu.com.forecastmvvm.R;
import dev.shantanu.com.forecastmvvm.data.network.ApixuWeatherApiService;
import dev.shantanu.com.forecastmvvm.data.network.RequestRetrofit;
import dev.shantanu.com.forecastmvvm.data.network.WeatherNetworkDataSourceImpl;
import dev.shantanu.com.forecastmvvm.data.network.response.CurrentWeatherResponse;

public class CurrentWeatherFragment extends Fragment {

    private CurrentWeatherViewModel mViewModel;
    private ApixuWeatherApiService apixuWeatherApiService;
    private TextView textView;

    public static CurrentWeatherFragment newInstance() {
        return new CurrentWeatherFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.current_weather_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CurrentWeatherViewModel.class);
        // TODO: Use the ViewModel
        textView = (TextView) getView().findViewById(R.id.textView);

        apixuWeatherApiService = RequestRetrofit.provideRetrofit(getContext()).create(ApixuWeatherApiService.class);

        WeatherNetworkDataSourceImpl weatherNetworkDataSource = new WeatherNetworkDataSourceImpl(apixuWeatherApiService);


        weatherNetworkDataSource.getDownloadedCurrentWeather().observe(this, new Observer<CurrentWeatherResponse>() {
            @Override
            public void onChanged(CurrentWeatherResponse currentWeatherResponse) {
                textView.setText(currentWeatherResponse.toString());
            }
        });

        weatherNetworkDataSource.fetechCurrentWeather("Mumbai", "en");
    }

}
