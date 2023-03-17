package com.example.afishahotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.afishahotel.databinding.ActivityRegBinding
import com.google.android.material.internal.ContextUtils.getActivity

class RegActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        val navHost =
            supportFragmentManager.findFragmentById(R.id.reg_nav_controller) as NavHostFragment
        navController = navHost.navController
        navController = navHost.findNavController()
        setContentView(binding.root)

    }
}