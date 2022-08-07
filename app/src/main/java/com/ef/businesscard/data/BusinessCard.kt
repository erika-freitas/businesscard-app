package com.ef.businesscard.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class BusinessCard(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String,
    val company: String,
    val phone: String,
    val email: String,
    val bgcolor: String
)