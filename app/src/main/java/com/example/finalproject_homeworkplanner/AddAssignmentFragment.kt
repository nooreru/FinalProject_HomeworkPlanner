package com.example.finalproject_homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject_homeworkplanner.databinding.FragmentAddAssignmentBinding

class AddAssignmentFragment : Fragment() {
    private var _binding: FragmentAddAssignmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddAssignmentBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.setDueDate.setOnClickListener{

        }
        return rootView
    }
}