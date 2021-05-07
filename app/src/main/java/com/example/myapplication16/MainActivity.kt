package com.example.myapplication16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var user = User("Sergey", "00000", 22)
        var user2 = User("Andrey", "00000", 25)
        var user3 = User("Andrey", "00000", 25)

        user.addAge(10)
        user2.addAge(2)
        user.printUserInfo()
    }
}