package com.zibro.data.network

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.zibro.data.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

fun provideOpenApiClient(retrofit: Retrofit) : OpenApiService = retrofit.create(OpenApiService::class.java)

fun provideOpenApiRetrofit(
    okHttpClient: OkHttpClient,
    gsonConverterFactory : GsonConverterFactory,
) : Retrofit =
    Retrofit.Builder()
        .baseUrl(BuildConfig.LOCAL_CURRENCY_BASE_URL)
        .addConverterFactory(gsonConverterFactory)
        .client(okHttpClient)
        .build()

fun provideGsonConverterFactory() : GsonConverterFactory =
    GsonConverterFactory.create(
        GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()
    )

fun buildOkHttpClient() : OkHttpClient {
    val interceptor = HttpLoggingInterceptor()
    if(BuildConfig.DEBUG){
        interceptor.level = HttpLoggingInterceptor.Level.BODY
    } else {
        interceptor.level = HttpLoggingInterceptor.Level.NONE
    }
    return OkHttpClient.Builder()
        .connectTimeout(5, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .build()
}