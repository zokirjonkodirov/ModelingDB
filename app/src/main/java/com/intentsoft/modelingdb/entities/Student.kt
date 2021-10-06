package com.intentsoft.modelingdb.entities

import androidx.room.PrimaryKey

/**
 * @author user
 * @date 06.10.2021
 */
data class Student(
    @PrimaryKey(autoGenerate = false)
    val studentName: String,
    val semester: Int,
    val schoolName: String
)
