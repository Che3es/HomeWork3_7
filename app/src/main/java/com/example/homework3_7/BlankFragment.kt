package com.example.homework3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.homework3_7.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    private val car = arrayListOf<Parametr>()
    private lateinit var hero : Parametr
    private lateinit var navArgs : BlankFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(layoutInflater)
        return binding.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
             navArgs = BlankFragmentArgs.fromBundle(it!!)
        }
        hero = navArgs.model as Parametr
        binding.tvName.text =hero.name
        binding.tvDescription.text =hero.prof
        binding.ivCar.setImageResource(hero.img)

    }
}