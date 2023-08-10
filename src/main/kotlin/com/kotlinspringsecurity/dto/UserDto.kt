package com.kotlinspringsecurity.dto

import com.kotlinspringsecurity.models.User

class UserDto(user: User) {
    var email = user.email
    var password = user.password

}