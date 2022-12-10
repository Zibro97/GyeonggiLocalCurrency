package com.zibro.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import com.zibro.presentation.R
import org.koin.android.ext.android.getKoin

class MainActivity : AppCompatActivity() {
    /**
     * NavHost 내에서 화면 이동 제어하는 역할
     */
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getKoin()._logger.info("안녕하세요")
//        navController = (supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment).findNavController()
    }
}