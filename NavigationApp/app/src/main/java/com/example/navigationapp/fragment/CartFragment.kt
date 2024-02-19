package com.example.navigationapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationapp.R
import com.example.navigationapp.databinding.FragmentCartBinding
import com.example.navigationapp.databinding.FragmentHomeBinding

class CartFragment : Fragment() {
   lateinit var binding:FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }


}