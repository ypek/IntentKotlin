package com.atitus.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var sendMessageButton: Button
    private lateinit var messageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendMessageButton = findViewById(R.id.send_message_button)
        messageEditText = findViewById(R.id.message_edit_text)

        sendMessageButton.setOnClickListener {
            val message = messageEditText.text.toString()
            val intent = Intent(this, ReceiveMessageActivity::class.java)
            intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, message)
            startActivity(intent)
        }
    }
}
