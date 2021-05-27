package com.xetiro.archplayground.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.xetiro.archplayground.MyModel
import com.xetiro.archplayground.R

class MainMvcActivity : AppCompatActivity() {

    lateinit var nameTxt: TextView
    lateinit var submitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hello MVC !!!", Toast.LENGTH_LONG).show()

        nameTxt = findViewById(R.id.textView)
        submitBtn = findViewById(R.id.button)
        submitBtn.setOnClickListener {
            DisplayModelData()
        }
    }

    fun GetDataFromModel(): MyModel {
        return MyModel("MVC Example", 1)
    }

    fun DisplayModelData() {
        val model = GetDataFromModel()
        nameTxt.setText("${model.appName} [${model.versionCode}]")
    }
}