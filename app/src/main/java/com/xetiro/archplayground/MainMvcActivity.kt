package com.xetiro.archplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainMvcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mvc)
        Toast.makeText(this, "Hello World !!!", Toast.LENGTH_LONG).show()
    }
}