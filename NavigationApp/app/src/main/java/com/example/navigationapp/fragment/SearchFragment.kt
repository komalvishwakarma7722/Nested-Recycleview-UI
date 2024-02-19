package com.example.navigationapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationapp.R
import com.example.navigationapp.databinding.FragmentCartBinding
import com.example.navigationapp.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    lateinit var binding:FragmentSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }


}