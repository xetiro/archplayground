package com.xetiro.archplayground.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.xetiro.archplayground.MyModel

import com.xetiro.archplayground.R


class MainMvvmActivity : AppCompatActivity() {

    lateinit var nameTxt: TextView
    lateinit var submitBtn: Button
    private val viewModel: MyViewModel by viewModels<MyViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hello MVVM !!!", Toast.LENGTH_LONG).show()

        nameTxt = findViewById(R.id.textView)
        submitBtn = findViewById(R.id.button)
        submitBtn.setOnClickListener {
            viewModel.getModelData()
        }
        viewModel.getModel().observe(this, Observer<MyModel> { myModel ->
            nameTxt.text = "${myModel.appName} [${myModel.versionCode}]"
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.getModel().removeObservers(this)
    }
}