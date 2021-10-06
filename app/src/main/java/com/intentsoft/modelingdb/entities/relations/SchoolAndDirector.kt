package com.intentsoft.modelingdb.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.intentsoft.modelingdb.entities.Director
import com.intentsoft.modelingdb.entities.School

/**
 * @author user
 * @date 06.10.2021
 */
data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)