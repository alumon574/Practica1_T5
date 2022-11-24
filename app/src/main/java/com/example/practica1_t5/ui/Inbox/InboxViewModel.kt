package com.example.practica1_t5.ui.Inbox

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InboxViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Inbox"
    }
    val text: LiveData<String> = _text
}