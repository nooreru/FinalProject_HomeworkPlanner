package com.example.finalproject_homeworkplanner

import androidx.lifecycle.ViewModel

class AssignmentViewModel : ViewModel() {

    private var _listOfAssignments = mutableListOf(Assignment("Cool Kids 101", "Being Yourself", arrayOf(1,1,1), R.drawable.default_image))
    val listOfAssignments: List<Assignment>
        get() = _listOfAssignments


    fun addAssignment(aTitle: String, cTitle: String, aDate: Array<Int>, aPhoto: Int = R.drawable.default_image){
        _listOfAssignments.add((Assignment(cTitle, aTitle, aDate, aPhoto)))
    }
}