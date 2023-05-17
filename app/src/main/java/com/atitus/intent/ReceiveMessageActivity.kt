package com.atitus.intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceiveMessageActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "extra_message"
    }

    private lateinit var messageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)

        messageTextView = findViewById(R.id.message_text_view)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        messageTextView.text = message
    }
}
