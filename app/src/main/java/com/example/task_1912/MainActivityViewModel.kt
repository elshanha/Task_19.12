package com.example.task_1912

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var name = MutableLiveData<String>()
    var code = MutableLiveData<String>()
    var description = MutableLiveData<String>()


    fun addToList() {

        val productlist = mutableListOf<Product>()
        val product = Product(
            productName = "${name.value}",
            productCode = "${code.value}",
            productDescription = "${description.value}")

        productlist.add(product)

        productlist.forEach {
            println(it)
        }

    }

}




