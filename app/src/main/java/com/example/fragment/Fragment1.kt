package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.Fragment1Binding

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var name: Communicator
    private lateinit var age :Communicator
    private lateinit var sex : Communicator
    private lateinit var job: Communicator
    private var fragment1Binding: Fragment1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment1Binding.inflate(inflater, container,false)
        fragment1Binding = binding
        name = requireActivity() as Communicator
        age = requireActivity() as Communicator
        sex = requireActivity() as Communicator
        job = requireActivity() as Communicator
        binding.enterBtn.setOnClickListener(){
            name.passDataCom(binding.inputHoten.text.toString())
            age.passDataCom(binding.inputTuoi.text.toString())
            sex.passDataCom(binding.inputGioitinh.text.toString())
            job.passDataCom(binding.inputNghe.text.toString())
        }

        return binding.root
    }

    override fun onDestroyView() {
        fragment1Binding = null
        super.onDestroyView()
    }
}