package com.example.meaningmate.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.meaningmate.model.DictionaryResponse
import com.example.meaningmate.repository.DictionaryRepository
import com.example.meaningmate.util.Resource
import kotlinx.coroutines.launch

class DictionaryViewModel : ViewModel() {

//    private val _wordMeaning = MutableLiveData<Resource<DictionaryResponse>>()
//    val wordMeaning: LiveData<Resource<DictionaryResponse>> = _wordMeaning
//
//    private val dictionaryRepository = DictionaryRepository()
//
//    fun searchWord(word: String) {
//        _wordMeaning.value = Resource.Loading()
//        viewModelScope.launch {
//            try {
//                val response = dictionaryRepository.getWordMeaning(word)
//                _wordMeaning.value = Resource.Success(response)
//            } catch (e: Exception) {
//                _wordMeaning.value = Resource.Error("Error fetching data")
//            }
//        }
//    }
}
