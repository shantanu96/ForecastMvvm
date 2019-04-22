package dev.shantanu.com.forecastmvvm.data.network.interceptor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.IOException;

import dev.shantanu.com.forecastmvvm.internal.NoConnectivityException;
import okhttp3.Response;

public class ConnectivityInterceptorImpl implements ConnectivityInterceptor {
    private Context context;

    public ConnectivityInterceptorImpl(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        if (!isOnline())
            throw new NoConnectivityException();

        return chain.proceed(chain.request());
    }

    public boolean isOnline() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }
}
