package com.zibro.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.navigation.NavController
import com.zibro.domain.util.State
import com.zibro.presentation.R
import com.zibro.presentation.viewModel.TestViewModel
import org.koin.android.viewmodel.ext.android.viewModel
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    /**
     * NavHost 내에서 화면 이동 제어하는 역할
     */
    private lateinit var navController : NavController
    private val viewModel by viewModel<TestViewModel>()
    private val textView by lazy {
        findViewById<TextView>(R.id.test)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getLocalCurrencyStoreList()
        viewModel.testLiveData.observe(this){
            when(it){
                is State.Success -> textView.text = it.data.toString()
                is State.Error -> {
                    Timber.e(it.error,"지형")
                    textView.text = it.error.toString()
                }
            }
        }
//        navController = (supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment).findNavController()

    }
}