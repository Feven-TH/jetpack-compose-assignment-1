package com.example.courselistapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.courselistapp.dataModel.Courses
import com.example.courselistapp.dataModel.mockCoursesRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CourseViewModel : ViewModel() {
    private val repository = mockCoursesRepo()

    private val _courses = MutableStateFlow<List<Courses>>(emptyList())
    val courses: StateFlow<List<Courses>> = _courses

    init {
        loadCourses()
    }

    private fun loadCourses() {
        viewModelScope.launch {
            _courses.value = repository.getCourses()
        }
    }
}
