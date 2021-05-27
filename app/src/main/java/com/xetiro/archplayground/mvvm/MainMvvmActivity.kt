package com.xetiro.archplayground.mvvm

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.xetiro.archplayground.MyModel
import com.xetiro.archplayground.databinding.ActivityMainBinding


class MainMvvmActivity : AppCompatActivity() {

    private val viewModel: MyViewModel by viewModels<MyViewModel>()
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, "Hello MVVM !!!", Toast.LENGTH_LONG).show()

        binding.button.setOnClickListener {
            viewModel.onUserClicked()
        }
        
        viewModel.getModel().observe(this, Observer<MyModel> { myModel ->
            binding.textView.text = "${myModel.appName} [${myModel.versionCode}]"
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.getModel().removeObservers(this)
    }
}