package com.example.petshop

class Sad (val date: String): Mood() {
    override fun currentMood(): String {
        return "I'm Sad"
    }
}