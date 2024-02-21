package com.example.weatherproject2024

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherproject2024.dagger2.ViewModelFactory
import com.example.weatherproject2024.databinding.ActivityMainBinding
import com.example.weatherproject2024.viewmodel.MainViewModel
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var mainViewModel: MainViewModel

    private var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApp.getComponent().inject(this)
    }

    fun initViews(){
        
    }

}