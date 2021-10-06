package com.intentsoft.modelingdb.entities.relations

import androidx.room.Entity

/**
 * @author user
 * @date 06.10.2021
 */
@Entity(primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(
    val studentName: String,
    val subjectName: String
)