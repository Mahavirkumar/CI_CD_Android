package com.development.mk.ci_cd_app_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.development.mk.ci_cd_app_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.butonClick.setOnClickListener {
            binding.textviewName.text="helo ${binding.editTextName.text}"
        }
        Toast.makeText(this,binding.textviewName.text,Toast.LENGTH_LONG)
    }
}