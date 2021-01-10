package com.renaldysabdo.roommultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.renaldysabdo.roommultipletable.entities.Student
import com.renaldysabdo.roommultipletable.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "idSubject",
        entityColumn = "idStudent",
        associateBy = Junction(
            StudentSubjectCrossRef::class
        )
    )
    val students: List<Student>
)