package com.seif.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform