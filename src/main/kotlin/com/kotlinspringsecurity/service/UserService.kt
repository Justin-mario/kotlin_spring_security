package com.kotlinspringsecurity.service

import com.kotlinspringsecurity.dto.UserDto
import com.kotlinspringsecurity.models.User
import com.kotlinspringsecurity.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {
    fun save(body: UserDto): User {
        val userDto = UserDto(body.email, body.password)
        val user = User(userDto)
        return userRepository.save(user)
    }
}