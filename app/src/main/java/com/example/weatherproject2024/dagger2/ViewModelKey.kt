package com.example.weatherproject2024.dagger2

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)