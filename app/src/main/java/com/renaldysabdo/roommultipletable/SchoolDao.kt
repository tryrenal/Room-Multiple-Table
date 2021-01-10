package com.renaldysabdo.roommultipletable

import androidx.room.*
import com.renaldysabdo.roommultipletable.entities.Director
import com.renaldysabdo.roommultipletable.entities.School
import com.renaldysabdo.roommultipletable.entities.relations.SchoolAndDirector

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    //Transcation = untuk menghindari multi-threading issue pada room
    @Transaction
    @Query("SELECT * FROM school WHERE nameSchool = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String) : List<SchoolAndDirector>
}