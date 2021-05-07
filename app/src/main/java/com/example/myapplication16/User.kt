package com.example.myapplication16

import android.util.Log

class User(var name: String, var id: String, var age: Int) {

    fun addAge(years: Int) {   // в скопках записываются атрибуты
        age = age.plus(years)
    }
    fun printUserInfo() {
        Log.d("MyLog","User name: $name, User id: $id, User age: $age")
    }

}

















