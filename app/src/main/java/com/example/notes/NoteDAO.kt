package com.example.notes

import androidx.room.*

@Dao
interface NoteDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("SELECT * FROM notes_table ORDER BY id ASC")
    fun getAllNote(): List<Note>

}