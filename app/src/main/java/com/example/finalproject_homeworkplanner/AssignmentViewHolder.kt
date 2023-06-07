package com.example.finalproject_homeworkplanner

import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_homeworkplanner.databinding.AssignmentPageItemListLayoutBinding
import com.example.finalproject_homeworkplanner.databinding.FragmentAssignmentPageBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.security.AccessController.getContext

class AssignmentViewHolder (val binding: AssignmentPageItemListLayoutBinding):
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentAssignment: Assignment

    init {
        binding.root.setOnClickListener{
            MaterialAlertDialogBuilder(it.context)
                .setTitle("This assignment is currently...")
                .setMessage("${if (currentAssignment.doneStatus.value == true)
                    "DONE\nyayyyy!"
                    else
                    "NOT DONE :("
                }")
                .setIcon(R.drawable.flower)
                .setPositiveButton("I'm done!"){ dialog, which ->
                    currentAssignment.doneStatus.setValue(true)
                }
                .setNegativeButton("Still working on it..."){ dialog, which ->
                    currentAssignment.doneStatus.setValue(false)
                }
                .show()
            /*val action = AssignmentPageFragmentDirections.actionAssignmentPageFragmentToAssignmentDetailsFragment(true)
            it.findNavController().navigate(action)*/
        }
//can you use current assignment outside of viewholder

    }

        fun bindAssignment(assignment: Assignment){
            currentAssignment = assignment
            binding.assignmentCourse.text = currentAssignment.assignmentCourse
            binding.assignmentDueDate.text = "${currentAssignment.assignmentDueDate[1]} - ${currentAssignment.assignmentDueDate[0]} - ${currentAssignment.assignmentDueDate[2]}"
            binding.assignmentTitle.text = currentAssignment.assignmentName
            binding.assignmentImage.setImageResource(currentAssignment.assignmentImage)
        }
}