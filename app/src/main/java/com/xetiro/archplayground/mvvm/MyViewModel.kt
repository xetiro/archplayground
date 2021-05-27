package com.xetiro.archplayground.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xetiro.archplayground.MyModel

class MyViewModel : ViewModel() {

    private val model = MutableLiveData<MyModel>()


    fun getModel(): LiveData<MyModel> {
        return model
    }

    fun getModelData() {
        model.postValue(loadModel())
    }

    private fun loadModel() = MyModel("MVVM Example", 3)

}