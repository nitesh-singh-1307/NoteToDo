package com.example.notetodo.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notetodo.ui.theme.Pink80
import com.example.notetodo.ui.theme.Purple80
import com.example.notetodo.ui.theme.PurpleGrey80

@Entity
data class Note(
    val title:String,
    val content:String,
    val timestamp:Long,
    val color:Int,
    @PrimaryKey val id:Int? = null
){


    companion object{
        val noteColors = listOf(Purple80,PurpleGrey80,Pink80)
    }
}

class InvalidNoteException(message:String):Exception(message)


