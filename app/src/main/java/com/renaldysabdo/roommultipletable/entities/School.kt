package com.renaldysabdo.roommultipletable.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School(
    @PrimaryKey(autoGenerate = false)
    val idSchool : Int,
    val nameSchool: String
)
