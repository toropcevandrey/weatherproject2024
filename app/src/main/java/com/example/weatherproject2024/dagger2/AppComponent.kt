package com.example.weatherproject2024.dagger2

import com.example.weatherproject2024.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}