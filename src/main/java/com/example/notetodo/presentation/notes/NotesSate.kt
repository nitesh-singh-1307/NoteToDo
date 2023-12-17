package com.example.notetodo.presentation.notes

import com.example.notetodo.feature_note.domain.model.Note
import com.example.notetodo.feature_note.domain.util.NoteOrder
import com.example.notetodo.feature_note.domain.util.OrderType

data class NotesSate(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
)
