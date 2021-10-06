package com.intentsoft.modelingdb.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author user
 * @date 06.10.2021
 */
@Entity
data class Subject(
    @PrimaryKey(autoGenerate = false)
    val subjectName: String
)