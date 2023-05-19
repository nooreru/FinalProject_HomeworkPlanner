package com.example.finalproject_homeworkplanner

import androidx.lifecycle.ViewModel

class PastAssignmentViewModel : ViewModel() {
    private var _listOfAssignments = mutableListOf(Assignment("course name", "assignment name", 1, R.drawable.default_image),
        Assignment("course name", "assignment name", 1, R.drawable.default_image),
        Assignment("course name", "assignment name", 1, R.drawable.default_image))
    val listOfAssignments: List<Assignment>
        get() = _listOfAssignments

    fun updateDone(doneStatus: Boolean, assignmentNum: Int){
        _listOfAssignments[assignmentNum].doneStatus = doneStatus
    }

    fun addAssignment(aTitle: String, cTitle: String, aDate: Int, aPhoto: Int = R.drawable.default_image){
        _listOfAssignments.add((Assignment(cTitle, aTitle, aDate, aPhoto)))
    }
}