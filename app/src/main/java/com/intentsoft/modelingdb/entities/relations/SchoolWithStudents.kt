package com.intentsoft.modelingdb.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.intentsoft.modelingdb.entities.School
import com.intentsoft.modelingdb.entities.Student

/**
 * @author user
 * @date 06.10.2021
 */
data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)
