package com.xetiro.archplayground.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xetiro.archplayground.MyModel

class MyViewModel : ViewModel() {

    private var count = 0
    private val model = MutableLiveData<MyModel>()


    fun getModel(): LiveData<MyModel> {
        return model
    }

    fun onUserClicked() {
        count++
        model.postValue(loadModel())
    }

    private fun loadModel() = MyModel("MVVM Example", count)

}