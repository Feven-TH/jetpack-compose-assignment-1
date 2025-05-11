package com.example.courselistapp.dataModel

class mockCoursesRepo {
    fun getCourses(): List<Courses> {
        return listOf(
            Courses(
                title = "Introduction to Programming",
                code = "CS101",
                creditHours = 3,
                description = "Learn the basics of programming using Python.",
                prerequisites = "None"
            ),
            Courses(
                title = "Data Structures",
                code = "CS202",
                creditHours = 4,
                description = "Explore various data structures and their applications.",
                prerequisites = "CS101"
            ),
            Courses(
                title = "Mobile App Development",
                code = "CS303",
                creditHours = 4,
                description = "Develop mobile applications using Android and Jetpack Compose.",
                prerequisites = "CS202"
            ),
                    Courses(
                    title = "Database Management Systems",
            code = "CS305",
            creditHours = 4,
            description = "Design and implement relational databases using SQL.",
            prerequisites = "CS202"
        ),
        Courses(
            title = "Operating Systems",
            code = "CS401",
            creditHours = 3,
            description = "Principles of operating systems, including process management, memory management, and file systems.",
            prerequisites = "CS202"
        ),
        Courses(
            title = "Computer Networks",
            code = "CS403",
            creditHours = 3,
            description = "Fundamentals of computer networks, including protocols, architectures, and security.",
            prerequisites = "CS202"
        ),
        Courses(
            title = "Software Engineering",
            code = "CS405",
            creditHours = 4,
            description = "Software development methodologies, design patterns, and testing.",
            prerequisites = "CS202"
        ),
        Courses(
            title = "Artificial Intelligence",
            code = "CS482",
            creditHours = 3,
            description = "Introduction to the concepts and techniques of artificial intelligence.",
            prerequisites = "CS202"
        ),
        Courses(
            title = "Machine Learning",
            code = "CS483",
            creditHours = 3,
            description = "Introduction to the concepts and techniques of machine learning.",
            prerequisites = "CS202"
        )
        )
    }
}