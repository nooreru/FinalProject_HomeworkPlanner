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
    /*var listOfAssignments = listOf(Assignment("course name", "assignment name", 1, R.drawable.patty_bae),
        Assignment("course name", "assignment name", 1, R.drawable.patty_bae),
        Assignment("course name", "assignment name", 1, R.drawable.patty_bae))*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddAssignmentBinding.inflate(inflater, container, false)
        val rootView = binding.root


        return rootView
    }
}