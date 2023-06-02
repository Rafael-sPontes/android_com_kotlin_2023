package com.kotlin2023.listviewobj3

class Users(var username: String, var password: String) {
    override fun toString(): String {
        return "USER: $username     PASS: $password"
    }
}