package com.kotlinspringsecurity.models

import com.kotlinspringsecurity.dto.UserDto
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(userDto: UserDto) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0

    @Column(unique = true)
    var email: String = ""

    @Column
    var password: String = ""

    init {
        this.email = userDto.email
        this.password = userDto.password
    }
}