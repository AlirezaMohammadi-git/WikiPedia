package com.example.wikipedia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wikipedia.databinding.FragmentExploreBinding
import com.example.wikipedia.databinding.FragmentProfileBinding


class Profile : Fragment() {


    lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}