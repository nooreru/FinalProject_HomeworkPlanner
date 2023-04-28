package com.example.finalproject_homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject_homeworkplanner.databinding.FragmentAddAssignmentBinding
import com.example.finalproject_homeworkplanner.databinding.FragmentAssignmentPageBinding

class AssignmentPageFragment : Fragment() {
    private var _binding: FragmentAssignmentPageBinding? = null
    private val binding get() = _binding!!
    var listOfAssignments = listOf(Assignment("course name", "assignment name", 1, R.drawable.default_image),
        Assignment("course name", "assignment name", 1, R.drawable.default_image),
        Assignment("course name", "assignment name", 1, R.drawable.default_image))
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAssignmentPageBinding.inflate(inflater, container, false)
        val rootView = binding.root
        val adapter = AssignmentAdapter(listOfAssignments)
        binding.recyclerView.adapter = adapter
        return rootView
    }
}