package com.intentsoft.modelingdb.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.intentsoft.modelingdb.entities.Student
import com.intentsoft.modelingdb.entities.Subject

/**
 * @author user
 * @date 06.10.2021
 */
data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)