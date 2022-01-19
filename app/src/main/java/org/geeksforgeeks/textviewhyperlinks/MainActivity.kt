package org.geeksforgeeks.textviewhyperlinks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and Initializing the TextView from the layout file
        val mTextView = findViewById<TextView>(R.id.text_view_1)

        mTextView.movementMethod = LinkMovementMethod.getInstance()
    }
}