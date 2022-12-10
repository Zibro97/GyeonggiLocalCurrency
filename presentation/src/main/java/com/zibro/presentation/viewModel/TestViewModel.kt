package com.zibro.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.zibro.domain.model.LocalCurrencyStoreModel
import com.zibro.domain.usecase.GetLocalCurrencyStoreUseCase
import com.zibro.domain.util.State
import com.zibro.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class TestViewModel(
    private val localCurrencyStoreUseCase: GetLocalCurrencyStoreUseCase
) : BaseViewModel() {
    private val testLiveData = MutableLiveData<State<LocalCurrencyStoreModel>>()
    suspend fun getLocalCurrencyStoreList() = viewModelScope.launch {
        testLiveData.value = localCurrencyStoreUseCase.invoke("")
    }

    override fun fetchData(): Job = Job()
}