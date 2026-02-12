package jp.co.ndk_group.messay_coding_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform