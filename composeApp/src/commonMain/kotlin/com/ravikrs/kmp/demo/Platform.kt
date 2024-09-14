package com.ravikrs.kmp.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform