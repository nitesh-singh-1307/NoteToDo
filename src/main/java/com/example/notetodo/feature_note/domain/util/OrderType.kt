package com.example.notetodo.feature_note.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending:OrderType()

}
