package com.example.courselistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.courselistapp.ui.theme.CourseListAppTheme
import com.example.courselistapp.ui.theme.screens.CourseListScreen
import com.example.courselistapp.viewmodels.CourseViewModel
import androidx.lifecycle.ViewModel

class MainActivity : ComponentActivity() {
    private val courseViewModel: CourseViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseListAppTheme {
                CourseListScreen(viewModel = courseViewModel)
            }
        }
    }
}