package com.renaldysabdo.roommultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.renaldysabdo.roommultipletable.entities.Director
import com.renaldysabdo.roommultipletable.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    /*
    parent column merepresentasikan primary key dari table pertama.
    entityColumn merepresentasikan not primary key tapi berfungsi untuk mengkompare dengan parentColumn (foregin key)
    *
    * */
    @Relation(
        parentColumn = "idSchool",
        entityColumn = "idSchool"
    )
    val director: Director
)
