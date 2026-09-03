package com.example.petshop

class Happy (mood: String): Mood(){
    override fun currentMood(): String {
        return "I'm Happy"
    }
}