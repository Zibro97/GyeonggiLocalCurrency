package com.zibro.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.zibro.domain.model.LocalCurrencyStoreModel
import com.zibro.domain.usecase.GetLocalCurrencyStoreUseCase
import com.zibro.domain.util.State
import com.zibro.presentation.base.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class TestViewModel(
    private val localCurrencyStoreUseCase: GetLocalCurrencyStoreUseCase
) : BaseViewModel() {
    private val _testLiveData = MutableLiveData<State<LocalCurrencyStoreModel>>()
    val testLiveData:LiveData<State<LocalCurrencyStoreModel>> = _testLiveData

    fun getLocalCurrencyStoreList() = viewModelScope.launch {
        _testLiveData.value = localCurrencyStoreUseCase.invoke()
    }

    override fun fetchData(): Job = Job()
}