package com.example.myapplication16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var user = User("Sergey", "00000", 22)

        user.addAge(10)
        user.printUserInfo()
    }
}