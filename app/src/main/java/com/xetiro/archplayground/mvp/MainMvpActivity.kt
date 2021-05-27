package com.xetiro.archplayground.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.xetiro.archplayground.MyModel
import com.xetiro.archplayground.R

class MainMvpActivity : AppCompatActivity(), AppView {

    lateinit var nameTxt: TextView
    lateinit var submitBtn: Button
    lateinit var presenter: MyPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hello MVP !!!", Toast.LENGTH_SHORT).show()

        nameTxt = findViewById(R.id.textView)
        submitBtn = findViewById(R.id.button)
        presenter = MyPresenter(this)

        submitBtn.setOnClickListener {
            presenter.GetDataFromModel()
        }

    }

    override fun onDataReady(model: MyModel) {
        nameTxt.setText("${model.appName} [${model.versionCode}]")
    }
}