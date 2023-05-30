package com.kotlin2023.listviewobjetos

class Utilizador (val username: String, val password: String) {
    override fun toString(): String {
        //return "Utilizador(username='$username', password='$password')"
        return "Username: $username"
    }
}