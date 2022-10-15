package com.example.surf_backend.model

data class UserInfo(
    val id: String,
    val phone: String,
    val email: String,
    val city: String,
    val firstName: String,
    val lastName: String,
    val avatar: String,
    val about: String
)