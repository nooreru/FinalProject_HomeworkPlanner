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
            /*MaterialAlertDialogBuilder(view.context)
                .setTitle("Finished with this assignment?")
                .setMessage("")
                .setIcon(R.drawable.flower)
                .setPositiveButton("Yep!"){ dialog, which ->
                    currentAssignment.doneStatus = true
                }
                .setNegativeButton("Nope!"){ dialog, which ->
                    currentAssignment.doneStatus = false
                }
                .show()*/
            val action = AssignmentPageFragmentDirections.actionAssignmentPageFragmentToAssignmentDetailsFragment(true)
            it.findNavController().navigate(action)
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