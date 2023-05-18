package com.example.finalproject_homeworkplanner

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_homeworkplanner.databinding.AssignmentPageItemListLayoutBinding

class AssignmentAdapter (val assignmentList: List<Assignment>) : RecyclerView.Adapter<AssignmentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AssignmentViewHolder {
        val binding = AssignmentPageItemListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AssignmentViewHolder(binding)
    }
//navigation thingds from assigmet bojec tot aassigment deteails
    override fun onBindViewHolder(holder: AssignmentViewHolder, position: Int) {
        val currentAssignment = assignmentList[position]
        holder.itemView.setOnClickListener {

        }

        holder.bindAssignment(currentAssignment)
    }

    override fun getItemCount(): Int {
        return assignmentList.size
    }
}