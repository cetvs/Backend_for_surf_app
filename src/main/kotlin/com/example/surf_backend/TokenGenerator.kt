package com.example.surf_backend

import com.example.surf_backend.model.ProfileRequestBody
import com.example.surf_backend.model.UserInfo

class TokenGenerator {
    operator fun invoke(profileRequestBody: ProfileRequestBody): String? {
        return if (profileRequestBody in profileSet) TOKEN else null
    }
}

val userInfo = UserInfo(
    "6",
    "+71234567890",
    "floppa@cat.com",
    "Москва",
    "Георгий",
    "Флопенко",
    "https://i.pinimg.com/564x/53/c5/8b/53c58be968dd9c29d59a7d430537bad1.jpg",
    "Мятные пряники спасут мир!"
)
val profileSet = mapOf(
    ProfileRequestBody("+71234567890", "qwerty") to userInfo
)
const val TOKEN = "qwerty1"