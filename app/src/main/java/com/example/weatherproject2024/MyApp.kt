package com.example.weatherproject2024

import android.app.Application
import com.example.weatherproject2024.dagger2.AppComponent
import com.example.weatherproject2024.dagger2.DaggerAppComponent

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().build()
    }

    companion object {
        private lateinit var component: AppComponent

        fun getComponent(): AppComponent {
            return component
        }
    }
}