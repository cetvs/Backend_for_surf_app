package com.example.surf_backend

import com.example.surf_backend.model.PictureInfo
import com.example.surf_backend.model.ProfileRequestBody
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["api/v1"])
class MainController {
    @GetMapping("/picture")
    fun getPictures(@RequestHeader("Authorization") token: String): List<PictureInfo>? =
        mapOfTokenAndPictures[token]

    @GetMapping("/test")
    fun getTest(): String =
        "test1"

    @PostMapping
    fun postPictures(@RequestBody phone: String, @RequestBody password: String): String? {
        val tokenGenerator = TokenGenerator()
        return tokenGenerator(ProfileRequestBody(phone, password))
    }

}

val mapOfTokenAndPictures = mapOf<String, List<PictureInfo>>()