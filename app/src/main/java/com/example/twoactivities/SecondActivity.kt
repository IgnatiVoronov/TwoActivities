package com.example.twoactivities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    private var mReply: EditText? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val message = intent.extras?.getString("Message")
        val textView: TextView = findViewById(R.id.textMessageTextView)

        mReply = findViewById(R.id.editText2);
        textView.text = message.toString()
    }

    fun returnReply(view: View) {
        val reply = mReply?.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra("Reply", reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }
}