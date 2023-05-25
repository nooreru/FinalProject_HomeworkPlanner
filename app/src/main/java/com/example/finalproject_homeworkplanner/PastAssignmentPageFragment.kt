package com.example.finalproject_homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.finalproject_homeworkplanner.databinding.FragmentPastAssignmentPageBinding

class PastAssignmentPageFragment : Fragment() {
private var _binding: FragmentPastAssignmentPageBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AssignmentViewModel by activityViewModels()
    private val viewModelPast: PastAssignmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPastAssignmentPageBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val adapter = PastAssignmentAdapter(viewModelPast.listOfAssignments)
        binding.recyclerView2.adapter = adapter

        return rootView
    }
}