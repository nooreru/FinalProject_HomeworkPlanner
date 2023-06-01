package com.example.finalproject_homeworkplanner

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_homeworkplanner.databinding.PastAssignmentItemListLayoutBinding

class PastAssignmentViewHolder(val binding: PastAssignmentItemListLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    private  lateinit var  currentPastAssignment: Assignment

    init {

    }

    fun bindAssignment(assignment: Assignment){
        currentPastAssignment = assignment
        binding.pastAssignmentCourse.text = currentPastAssignment.assignmentCourse
        binding.pastAssignmentTitle.text = currentPastAssignment.assignmentName
        binding.pastAssignmentDueDate.text = "${currentPastAssignment.assignmentDueDate[1]} - ${currentPastAssignment.assignmentDueDate[0]} - ${currentPastAssignment.assignmentDueDate[2]}"
        binding.pastAssignmentImage.setImageResource(currentPastAssignment.assignmentImage)

    }
}