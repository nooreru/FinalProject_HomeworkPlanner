package com.example.finalproject_homeworkplanner

import androidx.lifecycle.ViewModel

class AssignmentViewModel : ViewModel() {
    private var _listOfNotDoneAssignments = mutableListOf(Assignment("course name", "assignment name", 1, R.drawable.default_image),
        Assignment("course name", "assignment name", 1, R.drawable.default_image),
        Assignment("course name", "assignment name", 1, R.drawable.default_image))
    val listOfNotDoneAssignments: List<Assignment>
    get() = _listOfNotDoneAssignments

    fun updateDone(doneStatus: Boolean, assignmentNum: Int){
        _listOfNotDoneAssignments[assignmentNum].doneStatus = doneStatus
    }


}