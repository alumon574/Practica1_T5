package com.example.practica1_t5.ui.Spam

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.practica1_t5.R
import com.example.practica1_t5.databinding.FragmentSpamBinding

class SpamFragment : Fragment() {

    private var _binding: FragmentSpamBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val spamViewModel = ViewModelProvider(this).get(SpamViewModel::class.java)

        _binding = FragmentSpamBinding.inflate(inflater,container,false)
        val root : View = binding.root

        val textView: TextView = binding.textSpam
        spamViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}