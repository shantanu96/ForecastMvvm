package dev.shantanu.com.forecastmvvm.data.network.interceptor;

import java.io.IOException;

import dev.shantanu.com.forecastmvvm.data.network.ApiConstants;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RequestInterceptor implements Interceptor {

    public Response intercept(Interceptor.Chain chain) throws IOException {

        Request orignalRequest = chain.request();
        HttpUrl orignalHttpUrl = orignalRequest.url();

        HttpUrl url = orignalHttpUrl.newBuilder()
                .addQueryParameter("key", ApiConstants.API_KEY)
                .build();

        Request request = orignalRequest.newBuilder()
                .url(url)
                .build();
        return chain.proceed(request);
    }
}
