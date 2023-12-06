package com.example.introduccionkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.introduccionkotlin.R
import com.example.introduccionkotlin.database.DummyDatabase
import com.example.introduccionkotlin.databinding.FragmentHomeBinding
import com.example.introduccionkotlin.fragment.recyclerview.HomeAdapter
import com.example.introduccionkotlin.model.Car

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding by lazy { _binding!! }
    private val adapter = HomeAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()

        adapter.addCars(DummyDatabase.database)
    }

    private fun setupRecyclerView() {
        binding.homeRecyclerview.adapter = adapter
        binding.homeRecyclerview.layoutManager =
        LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}