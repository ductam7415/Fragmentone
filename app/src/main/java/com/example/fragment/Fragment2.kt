package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.Fragment1Binding
import com.example.fragment.databinding.Fragment2Binding

class Fragment2 : Fragment(R.layout.fragment_2) {
    private var outputhoten: String? = ""
    private var outputtuoi: String? = ""
    private var outputgioitinh: String? = ""
    private var outputnghe: String? = ""
    private lateinit var fragment2Binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment2Binding.inflate(layoutInflater, container, false)
        fragment2Binding = binding
        outputhoten = arguments?.getString("output_name")
        outputtuoi = arguments?.getString("output_age")
        outputgioitinh = arguments?.getString("output_sex")
        outputnghe = arguments?.getString("output_job")

        binding.outputHoten.text = outputhoten
        binding.outputTuoi.text = outputtuoi
        binding.outputGioitinh.text = outputgioitinh
        binding.outputNghe.text = outputnghe
        return binding.root
    }
}

