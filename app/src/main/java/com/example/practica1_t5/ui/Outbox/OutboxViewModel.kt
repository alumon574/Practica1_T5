package com.example.practica1_t5.ui.Outbox

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OutboxViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Outbox"
    }
    val text: LiveData<String> = _text
}