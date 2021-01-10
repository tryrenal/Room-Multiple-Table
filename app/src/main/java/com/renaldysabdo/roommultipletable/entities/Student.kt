package com.renaldysabdo.roommultipletable.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = false)
    val idStudent: Int,
    val nameStudent: String,
    val semesterStudent: Int,
    val idSchool: Int
)
