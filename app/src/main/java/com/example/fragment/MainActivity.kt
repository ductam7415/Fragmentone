package com.example.fragment


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment1).commit()
    }

    override fun passDataCom(
        editTextInput: String
    ) {
        val bundle = Bundle()
        bundle.putString("output_name", editTextInput)
        bundle.putString("output_age", editTextInput)
        bundle.putString("output_sex", editTextInput)
        bundle.putString("output_job", editTextInput)
        val transaction = this.supportFragmentManager.beginTransaction()
        val frag2 = Fragment2()
        frag2.arguments = bundle
        transaction.replace(R.id.container, frag2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }

}
