package com.example.finalproject_homeworkplanner

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.DatePicker
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.finalproject_homeworkplanner.databinding.FragmentAddAssignmentBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.util.*

class AddAssignmentFragment : Fragment() {
    private var _binding: FragmentAddAssignmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AssignmentViewModel by activityViewModels()

    lateinit var calendarView: CalendarView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddAssignmentBinding.inflate(inflater, container, false)
        val rootView = binding.root
        var date = arrayOf(1)

        calendarView = binding.calendar
        calendarView.setOnDateChangeListener(
            OnDateChangeListener{ view, year, month, dayOfMonth ->
                date = arrayOf(dayOfMonth, month, year)
            }
        )


        //binding.setDueDate.setOnClickListener{
            //rootView.findNavController().navigate(AddAssignmentFragmentDirections.actionAddAssignmentFragmentToDateDialogFragment()) }
        binding.addAssignmentToListButton.setOnClickListener{
            viewModel.addAssignment(binding.assignmentCourseEdit.text.toString(), binding.assignmentTitleEdit.text.toString(), date, R.drawable.default_image)
            Toast.makeText(getActivity(), R.string.assignment_added, Toast.LENGTH_SHORT).show()
        }
        return rootView
    }
}