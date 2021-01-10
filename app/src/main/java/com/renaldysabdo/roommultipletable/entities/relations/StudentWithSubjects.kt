package com.renaldysabdo.roommultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.renaldysabdo.roommultipletable.entities.Student
import com.renaldysabdo.roommultipletable.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "idStudent",
        entityColumn = "idStudent",
        associateBy = Junction(
            StudentSubjectCrossRef::class
        )
    )
    val subjects: List<Subject>
)
