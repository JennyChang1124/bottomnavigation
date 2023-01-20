package com.example.bottomnavigation.ui.logout

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class LogoutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Logout Fragment"
    }
    val text: LiveData<String> = _text
}