package com.example.finalproject_homeworkplanner

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_homeworkplanner.databinding.AssignmentPageItemListLayoutBinding
import com.example.finalproject_homeworkplanner.databinding.FragmentAssignmentPageBinding

class AssignmentViewHolder (val binding: AssignmentPageItemListLayoutBinding):
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentAssignment: Assignment

    init {
        binding.root.setOnClickListener {
            val action = AssignmentPageFragmentDirections.actionAssignmentPageFragmentToAssignmentDetailsFragment()
            binding.root.findNavController().navigate(action)
        }
    }

        fun bindAssignment(assignment: Assignment){
            currentAssignment = assignment
            binding.assignmentCourse.text = currentAssignment.assignmentCourse
            binding.assignmentDueDate.text = currentAssignment.assignmentDueDate.toString()
            binding.assignmentTitle.text = currentAssignment.assignmentName
            binding.assignmentImage.setImageResource(currentAssignment.assignmentImage)
        }
}