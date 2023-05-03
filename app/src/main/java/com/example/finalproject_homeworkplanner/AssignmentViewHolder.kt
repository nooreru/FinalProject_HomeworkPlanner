package com.example.finalproject_homeworkplanner

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_homeworkplanner.databinding.AssignmentPageItemListLayoutBinding
import com.example.finalproject_homeworkplanner.databinding.FragmentAssignmentPageBinding

class AssignmentViewHolder (val binding: AssignmentPageItemListLayoutBinding):
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentAssignment: Assignment
    private var _binding1: FragmentAssignmentPageBinding? = null
    private val binding1 get() = _binding1!!
    init {
        binding.root.setOnClickListener{
            val action = AssignmentPageFragmentDirections.actionAssignmentPageFragmentToAssignmentDetailsFragment()

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