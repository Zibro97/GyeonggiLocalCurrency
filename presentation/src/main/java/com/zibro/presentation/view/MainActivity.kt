package com.zibro.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.zibro.presentation.R

class MainActivity : AppCompatActivity() {
    /**
     * NavHost 내에서 화면 이동 제어하는 역할
     */
    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = (supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment).findNavController()
    }
}