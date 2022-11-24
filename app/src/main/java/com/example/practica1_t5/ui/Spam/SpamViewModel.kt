package com.example.practica1_t5.ui.Spam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SpamViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Spam"
    }
    val text: LiveData<String> = _text
}