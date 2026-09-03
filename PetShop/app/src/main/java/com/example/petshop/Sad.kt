package com.example.petshop

class Sad (mood: String): Mood() {
    override fun currentMood(): String {
        return "I'm Sad"
    }
}