package com.intentsoft.modelingdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.intentsoft.modelingdb.entities.Director
import com.intentsoft.modelingdb.entities.School
import com.intentsoft.modelingdb.entities.Student
import com.intentsoft.modelingdb.entities.Subject
import com.intentsoft.modelingdb.entities.relations.StudentSubjectCrossRef

/**
 * @author user
 * @date 06.10.2021
 */
@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],
    version = 1
)
abstract class SchoolDatabase: RoomDatabase() {

    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile // when we change the value of INSTANCE then change is visible to other threads
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}