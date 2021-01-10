package com.renaldysabdo.roommultipletable.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject(
    @PrimaryKey(autoGenerate = false)
    val idSubject: Int,
    val nameSubject: String
)
