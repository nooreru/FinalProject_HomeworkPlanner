package com.example.finalproject_homeworkplanner

import android.content.Intent
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

data class Assignment(
    var assignmentCourse: String,
    var assignmentName: String,
    var assignmentDueDate: Array<Int>,
    var assignmentImage: Int,
    var doneStatus: MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)){
}