package com.h2osolid.kmpmockative

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform