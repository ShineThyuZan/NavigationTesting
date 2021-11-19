package com.example.navigationtesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar?.let {
            it.setDisplayShowHomeEnabled(true)
            it.setLogo(R.drawable.ic_android_black_24dp)
        }
        val btnNavView = findViewById<BottomNavigationView>(R.id.btn_nav_view)
        //create navigation and controller
        val navFragment = supportFragmentManager.findFragmentById(R.id.host) as NavHostFragment
        val navController = navFragment.navController

        setupActionBarWithNavController(
            navController, AppBarConfiguration(
                topLevelDestinationIds = setOf(
                    R.id.BFragment,
                    R.id.AFragment
                )
            )
        )
        btnNavView.setupWithNavController(navController)

    }


}