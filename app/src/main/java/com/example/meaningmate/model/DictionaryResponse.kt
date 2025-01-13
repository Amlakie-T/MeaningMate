package com.example.meaningmate.model

data class DictionaryResponse(
    val word: String,
    val meanings: List<Meaning>
)
