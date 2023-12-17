package com.example.notetodo.feature_note.domain.use_case

import com.example.notetodo.feature_note.domain.model.InvalidNoteException
import com.example.notetodo.feature_note.domain.model.Note
import com.example.notetodo.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){

        if (note.title.isBlank()){
throw InvalidNoteException("The title of the note empty")
        }
        if (note.content.isEmpty()){
            throw InvalidNoteException("The COntent of the note empty")

        }

        repository.insertNote(note)

    }
}