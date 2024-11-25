package com.create.nativeadvice.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.create.nativeadvice.api.Retrofit
import kotlinx.coroutines.launch

class AdviceViewModel : ViewModel() {
//    val advice = mutableStateOf("Fetching advice...")

    private val _advice = MutableLiveData<String>()
    val advice: LiveData<String> = _advice

    init {
        fetchAdvice()
    }

    fun fetchAdvice() {
        viewModelScope.launch {
            try {
                val response = Retrofit.api.getAdvice()
                _advice.postValue (response.slip.advice)
                println("Advice Response: ${response.slip.advice}")

            } catch (e: Exception) {

                _advice.postValue("Error fetching advice: ${e.message}")
            };
        }
    }
}