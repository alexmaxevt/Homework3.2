package dpo

class Post (
    val id: Long,
    val author: String,
    val content: String,
    val created: String,
    var likedByMe: Boolean = false,
    val likedCount: Int,
    var shared: Boolean = false,
    val sharedCount: Int,
    var comments: Boolean = false,
    val commentsCount: Int
)