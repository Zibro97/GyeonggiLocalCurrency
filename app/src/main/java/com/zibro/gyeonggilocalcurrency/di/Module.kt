package com.zibro.gyeonggilocalcurrency.di

import com.zibro.data.network.buildOkHttpClient
import com.zibro.data.network.provideGsonConverterFactory
import com.zibro.data.network.provideOpenApiClient
import com.zibro.data.network.provideOpenApiRetrofit
import com.zibro.data.repository.LocalCurrencyStoreRepositoryImpl
import com.zibro.domain.repository.LocalCurrencyStoreRepository
import com.zibro.domain.usecase.GetLocalCurrencyStoreUseCase
import com.zibro.presentation.viewModel.TestViewModel
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
    single{Dispatchers.Main}
    single{Dispatchers.IO}
    //ViewModel
    viewModel { TestViewModel(get()) }
    //Usecase
    factory { GetLocalCurrencyStoreUseCase(get()) }
    //Retrofit
    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }
    single { provideOpenApiRetrofit(get(), get()) }
    single { provideOpenApiClient(get()) }

    //Repository
    single<LocalCurrencyStoreRepository> { LocalCurrencyStoreRepositoryImpl(get(),get()) }
}