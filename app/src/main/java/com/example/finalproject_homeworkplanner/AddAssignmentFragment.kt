package com.example.finalproject_homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.finalproject_homeworkplanner.databinding.FragmentAddAssignmentBinding

class AddAssignmentFragment : Fragment() {
    private var _binding: FragmentAddAssignmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AssignmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddAssignmentBinding.inflate(inflater, container, false)
        val rootView = binding.root
        /*binding.setDueDate.setOnClickListener{
            calendar ui popup thingy
        }*/
        binding.addAssignmentToListButton.setOnClickListener{
            viewModel.addAssignment(binding.assignmentCourseEdit.text.toString(), binding.assignmentTitleEdit.text.toString(), 1, R.drawable.default_image)
            Toast.makeText(getActivity(), R.string.assignment_added, Toast.LENGTH_SHORT).show()
        }
        return rootView
    }
}