package com.example.testnotifications.domain

import java.util.Date

data class Notification(
    val id:Int,
    val message:String,
    val isRead:Boolean,
    val sender:String,
    val time:String
    ) {
}