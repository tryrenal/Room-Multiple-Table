package com.renaldysabdo.roommultipletable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.renaldysabdo.roommultipletable.data.DummyData
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao = SchoolDatabase.getInstance(this).schoolDao

        lifecycleScope.launch {
            DummyData.directors.forEach { dao.insertDirector(it) }
            DummyData.schools.forEach { dao.insertSchool(it) }
            DummyData.subjects.forEach { dao.insertSubject(it) }
            DummyData.students.forEach { dao.insertStudent(it) }
            DummyData.studentSubjectRelations.forEach { dao.insertStudentSubjectCrossRef(it) }

            val schoolwWithDirector = dao.getSchoolAndDirectorWithSchoolName("Kotlin School")
            Log.i("schoolWithDirector", schoolwWithDirector.toString())
        }
    }
}