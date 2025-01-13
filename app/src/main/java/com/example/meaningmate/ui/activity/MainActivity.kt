package com.example.meaningmate.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meaningmate.R
import com.example.meaningmate.ui.viewmodel.DictionaryViewModel
import com.example.meaningmate.util.Resource
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

//    private lateinit var recyclerView: RecyclerView
//    private lateinit var searchInput: TextInputEditText
//    private lateinit var adapter: MeaningAdapter
//    private val dictionaryViewModel: DictionaryViewModel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        recyclerView = findViewById(R.id.recyclerView)
//        searchInput = findViewById(R.id.searchInput)
//
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        adapter = MeaningAdapter()
//        recyclerView.adapter = adapter
//
//        dictionaryViewModel.wordMeaning.observe(this, Observer { resource ->
//            when (resource) {
//                is Resource.Loading -> {
//                    showLoading(true)
//                }
//                is Resource.Success -> {
//                    showLoading(false)
//                    resource.data?.let { data ->
//                        adapter.submitList(data.meanings)
//                    }
//                }
//                is Resource.Error -> {
//                    showLoading(false)
//                    Toast.makeText(this, resource.message, Toast.LENGTH_SHORT).show()
//                }
//            }
//        })
//
//        searchInput.addTextChangedListener {
//            val query = it.toString()
//            if (query.isNotEmpty()) {
//                dictionaryViewModel.searchWord(query)
//            }
//        }
//    }
//
//    private fun showLoading(isLoading: Boolean) {
//        // Add loading indicator logic (e.g., ProgressBar)
//    }
}
