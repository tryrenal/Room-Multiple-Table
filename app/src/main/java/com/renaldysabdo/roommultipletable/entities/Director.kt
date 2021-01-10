package com.renaldysabdo.roommultipletable.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director(
    @PrimaryKey(autoGenerate = false)
    val idDirector : Int,
    val nameDirector: String,
    val idSchool: Int
)
