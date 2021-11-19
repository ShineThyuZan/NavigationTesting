package com.example.navigationtesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BFragment : Fragment() {
    private lateinit var txtView: TextView
    private lateinit var btn: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtView = requireActivity().findViewById(R.id.tv_b)
        btn = requireActivity().findViewById(R.id.btn_b)
        btn.setOnClickListener {
            findNavController().navigate(R.id.action_b_to_detail)
        }

    }

}