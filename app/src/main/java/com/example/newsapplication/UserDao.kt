package com.example.newsapplication

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user_table WHERE email= :email")
    suspend fun getUserbyEmail(email: String): User?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)
}