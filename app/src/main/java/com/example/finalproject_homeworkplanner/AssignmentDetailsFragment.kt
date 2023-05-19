package com.example.finalproject_homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

class AssignmentDetailsFragment : Fragment() {
    private var _binding: AssignmentDetailsFragment? = null
    private val binding get() = _binding!!
    private val viewModel: AssignmentViewModel by activityViewModels()
    private val viewModelPast: PastAssignmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_assignment_details, container, false)
    }
}