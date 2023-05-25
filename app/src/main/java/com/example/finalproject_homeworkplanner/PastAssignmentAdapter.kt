package com.example.finalproject_homeworkplanner

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_homeworkplanner.databinding.PastAssignmentItemListLayoutBinding

class PastAssignmentAdapter(val assignmentList: List<Assignment>) : RecyclerView.Adapter<PastAssignmentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PastAssignmentViewHolder {
        val binding = PastAssignmentItemListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PastAssignmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PastAssignmentViewHolder, position: Int) {
        val currentAssignment = assignmentList[position]
        holder.bindAssignment(currentAssignment)
    }

    override fun getItemCount(): Int {
        return assignmentList.size
    }

}