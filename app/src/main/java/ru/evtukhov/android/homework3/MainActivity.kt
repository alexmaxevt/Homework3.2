package ru.evtukhov.android.homework3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dpo.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val post = Post(
        1,
        "Netology",
        "First post in our network!",
        "20 august 2019",
        false,
        50,
        false,
        8,
        false,
        0
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        author.text = post.author
        textViewDate.text = post.created
        content.text = post.content
        likeCount.text = post.likedCount.toString()
        shareCount.text = post.sharedCount.toString()
        commentsCount.text = (
                if (post.commentsCount == 0) {
                    ""
                }
                else {
                   post.commentsCount
                }).toString()
    }

    @SuppressLint("ResourceAsColor")
    fun likeClick(view: View) {
        post.likedByMe = true
        likeBtn.setImageResource(R.drawable.ic_favorite_active_24dp)
        likeCount.setTextColor(resources.getColor(R.color.colorActive))
    }

    @SuppressLint("ResourceAsColor")
    fun commentClick(view: View) {
        post.comments = true
        commentsBtn.setImageResource(R.drawable.ic_chat_active_24dp)
        commentsCount.setTextColor(resources.getColor(R.color.colorActive))
    }

    @SuppressLint("ResourceAsColor")
    fun shareClick(view: View) {
        post.shared = true
        shareBtn.setImageResource(R.drawable.ic_share_active_24dp)
        shareCount.setTextColor(resources.getColor(R.color.colorActive))
    }
}
