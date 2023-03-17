package com.example.afishahotel.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.afishahotel.R
import com.example.afishahotel.databinding.FragmentAccauntIsActiveBinding


class AccountIsActiveFragment : Fragment() {
    private lateinit var binding:FragmentAccauntIsActiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_accaunt_is_active, container, false)
        binding.signIn.setOnClickListener{
            findNavController().navigate(R.id.registrationProfileFragment)}

        return binding.root
    }

}