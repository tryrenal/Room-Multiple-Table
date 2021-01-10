package com.renaldysabdo.roommultipletable.data

import com.renaldysabdo.roommultipletable.entities.Director
import com.renaldysabdo.roommultipletable.entities.School
import com.renaldysabdo.roommultipletable.entities.Student
import com.renaldysabdo.roommultipletable.entities.Subject
import com.renaldysabdo.roommultipletable.entities.relations.StudentSubjectCrossRef

object DummyData {
    val directors = listOf(
        Director(0,"Mike Litoris", 0),
        Director(1,"Jack Goff", 1),
        Director(2, "Chris P. Chicken", 2)
    )
    val schools = listOf(
        School(0,"Jake Wharton School"),
        School(1, "Kotlin School"),
        School(2, "JetBrains School")
    )
    val subjects = listOf(
        Subject(0,"Dating for programmers"),
        Subject(1, "Avoiding depression"),
        Subject(2,"Bug Fix Meditation"),
        Subject(3,"Logcat for Newbies"),
        Subject(4,"How to use Google")
    )
    val students = listOf(
        Student(0,"Beff Jezos", 2, 1),
        Student(1, "Mark Suckerberg", 5, 0),
        Student(2,"Gill Bates", 8, 1),
        Student(3,"Donny Jepp", 1, 1),
        Student(4,"Hom Tanks", 2, 2)
    )
    val studentSubjectRelations = listOf(
        StudentSubjectCrossRef(0, 0),
        StudentSubjectCrossRef(0, 2),
        StudentSubjectCrossRef(2, 1),
        StudentSubjectCrossRef(1, 2),
        StudentSubjectCrossRef(2, 3),
        StudentSubjectCrossRef(3, 3)
    )
}