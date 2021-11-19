package com.example.navigationtesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class AFragment : Fragment() {
    private lateinit var tv:TextView
    private lateinit var btn : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv = requireActivity().findViewById(R.id.tv_a)
        btn = requireActivity().findViewById(R.id.btn_a)

        btn.setOnClickListener {

        }
    }

}