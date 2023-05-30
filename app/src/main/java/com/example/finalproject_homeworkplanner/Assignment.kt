package com.example.finalproject_homeworkplanner

import android.content.Intent

data class Assignment(
    var assignmentCourse: String,
    var assignmentName: String,
    var assignmentDueDate: Array<Int>,
    var assignmentImage: Int,
    var doneStatus: Boolean = false){
}