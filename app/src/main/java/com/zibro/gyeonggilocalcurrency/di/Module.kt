package com.zibro.gyeonggilocalcurrency.di

import com.zibro.data.*
import com.zibro.data.network.buildOkHttpClient
import com.zibro.data.network.provideGsonConverterFactory
import com.zibro.data.network.provideOpenApiClient
import com.zibro.data.network.provideOpenApiRetrofit
import com.zibro.data.repository.LocalCurrencyStoreRepositoryImpl
import kotlinx.coroutines.Dispatchers
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/***
 * single :
 * factory :
 * get()
 */
internal val module = module {
    //Dispatchers
    single{Dispatchers.IO}
    single{Dispatchers.Main}
    single{Dispatchers.Default}

    //Retrofit
    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }
    single { provideOpenApiRetrofit(get(), get()) }
    single { provideOpenApiClient(get()) }

    //Repository
    single<LocalCurrencyStoreRepository> { LocalCurrencyStoreRepositoryImpl(get(),get()) }

    //Usecase
    factory {  }
    //ViewModel
    viewModel {  }
}