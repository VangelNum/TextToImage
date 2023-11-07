package com.vangelnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.mediapipe.examples.imagegeneration.diffusion.DiffusionActivity
import com.vangelnum.loraweights.LoRAWeightActivity
import com.vangelnum.plugins.PluginActivity
import com.vangelnum.text2image.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDiffusion.setOnClickListener {
            startActivity(Intent(this, DiffusionActivity::class.java))
        }

        binding.btnPlugins.setOnClickListener {
            startActivity(Intent(this, PluginActivity::class.java))
        }

        binding.btnLoRA.setOnClickListener {
            startActivity(Intent(this, LoRAWeightActivity::class.java))
        }
    }
}