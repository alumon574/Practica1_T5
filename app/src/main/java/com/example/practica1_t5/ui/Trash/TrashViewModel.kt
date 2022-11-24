package com.example.practica1_t5.ui.Trash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrashViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Trash"
    }
    val text: LiveData<String> = _text
}