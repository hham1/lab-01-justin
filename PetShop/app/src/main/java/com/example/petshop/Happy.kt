package com.example.petshop

class Happy (val date: String): Mood(){
    override fun currentMood(): String {
        return "I'm Happy"
    }
}