package com.example.courselistapp.ui.theme.Components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courselistapp.dataModel.Courses
import com.example.courselistapp.ui.theme.CourseListAppTheme

@Composable
fun CourseCard(course: Courses) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }
    val buttonColor = MaterialTheme.colorScheme.secondary
    val backgroundColor = buttonColor.copy(alpha = 0.1f)

    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .animateContentSize(),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
        ) {
            Text(
                text = course.title,
                style = MaterialTheme.typography.titleMedium.copy(color = buttonColor)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                    text = "Code: ${course.code}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "Credits: ${course.creditHours}",
                    style = MaterialTheme.typography.bodyMedium
                )

            Spacer(modifier = Modifier.height(4.dp))

            if (isExpanded) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)) {
                            append("Description: ")
                        }
                        append(course.description)
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Justify
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)) {
                            append("Prerequisites: ")
                        }
                        append(course.prerequisites)
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Justify
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Button(
                onClick = { isExpanded = !isExpanded },
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(
                    imageVector = if (isExpanded) Icons.Filled.ArrowDropUp else Icons.Filled.ArrowDropDown,
                    contentDescription = if (isExpanded) "Hide" else "Show",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                val buttonText = if (isExpanded) "Hide Details" else "Show Details"
                Text(
                    text = buttonText,
                    color = Color.White
                )
            }
        }
    }
}
