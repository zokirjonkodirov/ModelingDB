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
data class StudentsWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
