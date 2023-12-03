package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.introduccionkotlin.databinding.ActivityMainBinding
import com.example.introduccionkotlin.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding by lazy { _binding!! }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupHomeFragment()
    }

    private fun setupHomeFragment() {
        FragmentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}