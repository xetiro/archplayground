package com.xetiro.archplayground.mvp

import com.xetiro.archplayground.MyModel

class MyPresenter(val view: AppView) {

    fun GetDataFromModel() {
        val model = MyModel("MVP Example", 2)
        view.onDataReady(model)
    }
}