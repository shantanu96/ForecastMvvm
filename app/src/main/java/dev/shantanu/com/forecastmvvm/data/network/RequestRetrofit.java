package dev.shantanu.com.forecastmvvm.data.network;

import android.content.Context;

import dev.shantanu.com.forecastmvvm.data.network.interceptor.ConnectivityInterceptorImpl;
import dev.shantanu.com.forecastmvvm.data.network.interceptor.RequestInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RequestRetrofit {
    public static retrofit2.Retrofit provideRetrofit(Context context) {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new RequestInterceptor())
                .addInterceptor(new ConnectivityInterceptorImpl(context))
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiConstants.BASE_URL)
                .client(okHttpClient)
                .build();


        return retrofit;
    }
}
