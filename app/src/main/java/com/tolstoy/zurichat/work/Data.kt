package com.tolstoy.zurichat.work

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
 @PrimaryKey
  val message: String,
  val image: String
)
 private val message = arrayListOf("Welcome to Zuri Chat")
object UserData {
    fun getWorkUsers(): User{
        return User(
         message.random(),
            "https://randomuser.me/api/portraits/lego${0.5}.random()}.jpg"
        )
    }
}
