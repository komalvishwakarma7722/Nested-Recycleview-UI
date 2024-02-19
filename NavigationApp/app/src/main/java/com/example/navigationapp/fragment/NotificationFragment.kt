package com.example.navigationapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationapp.R
import com.example.navigationapp.databinding.FragmentCartBinding
import com.example.navigationapp.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {
    lateinit var binding:FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

}