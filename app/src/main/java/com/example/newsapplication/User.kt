package com.example.newsapplication

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName="user_table")
data class User(
    @primaryKey(autoGenerte = true) val id: Int?,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastname: String?,
    @ColumnInfo(name = "email") val email: String?,
    @ColumnInfo(name = "password") val password: String?,
    val lastName: String,

    )

annotation class primaryKey(val autoGenerte: Boolean)
