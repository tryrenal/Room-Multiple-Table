package com.renaldysabdo.roommultipletable.entities.relations

import androidx.room.Entity

@Entity(primaryKeys = ["idStudent", "idSubject"])
data class StudentSubjectCrossRef(
    val idStudent: Int,
    val idSubject: Int
)
