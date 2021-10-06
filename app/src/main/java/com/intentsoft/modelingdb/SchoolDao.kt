package com.intentsoft.modelingdb

import androidx.room.*
import com.intentsoft.modelingdb.entities.Director
import com.intentsoft.modelingdb.entities.School
import com.intentsoft.modelingdb.entities.Student
import com.intentsoft.modelingdb.entities.relations.SchoolAndDirector
import com.intentsoft.modelingdb.entities.relations.SchoolWithStudents

/**
 * @author user
 * @date 06.10.2021
 */
@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>
}