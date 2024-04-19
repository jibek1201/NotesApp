package com.example.notesapp

import android.app.Application
import androidx.room.Room
import com.example.notesapp.database.NoteDatabase

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java, "database-name"
        ).allowMainThreadQueries().build()
    }
    companion object{
        lateinit var db: NoteDatabase
    }
}