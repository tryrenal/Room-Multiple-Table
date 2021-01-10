package com.renaldysabdo.roommultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.renaldysabdo.roommultipletable.entities.School
import com.renaldysabdo.roommultipletable.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "idSchool",
        entityColumn = "idSchool"
    )
    val students: List<Student>
)