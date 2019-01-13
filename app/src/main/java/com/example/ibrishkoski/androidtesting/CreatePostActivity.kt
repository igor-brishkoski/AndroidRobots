package com.example.ibrishkoski.androidtesting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class CreatePostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        post_button.setOnClickListener {
            post_submit_result_text.text =
                    if (post_text.length() in 1..139)
                        getString(R.string.post_submitted)
                    else
                        getString(R.string.post_submit_error)
        }
    }
}
