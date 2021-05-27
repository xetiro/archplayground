package com.xetiro.archplayground.mvp

import com.xetiro.archplayground.MyModel

interface AppView {

    fun onDataReady(model: MyModel)
}