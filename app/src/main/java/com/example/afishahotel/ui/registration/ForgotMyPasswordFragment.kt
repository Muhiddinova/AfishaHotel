package com.example.hotelafisha.ui.registration

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.afishahotel.R

class ForgotMyPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = ForgotMyPasswordFragment()
    }

    private lateinit var viewModel: ForgotMyPasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_forgot_my_password, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ForgotMyPasswordViewModel::class.java)
        // TODO: Use the ViewModel
    }

}