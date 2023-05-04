package com.example.finalproject_homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.finalproject_homeworkplanner.databinding.FragmentAssignmentPageBinding
import androidx.fragment.app.viewModels


class AssignmentPageFragment : Fragment() {
    private var _binding: FragmentAssignmentPageBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AssignmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAssignmentPageBinding.inflate(inflater, container, false)
        val rootView = binding.root
        val adapter = AssignmentAdapter(viewModel.listOfNotDoneAssignments)
        binding.recyclerView.adapter = adapter
        return rootView
    }
}