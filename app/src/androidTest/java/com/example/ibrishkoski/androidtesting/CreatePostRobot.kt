package com.example.ibrishkoski.androidtesting

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.matcher.ViewMatchers.withId

class CreatePostRobot : BaseRobot() {

    fun enterPostText(text: String) {
        postText().typeText(text)
    }

    fun submitPost() {
        postButton().click()
    }

    fun matchResultText(expectedText: String) {
        postSubmitResultText().isTextDisplayed(expectedText)
    }

    companion object {
        fun postText(): ViewInteraction = onView(withId(R.id.post_text))
        fun postButton(): ViewInteraction = onView(withId(R.id.post_button))
        fun postSubmitResultText(): ViewInteraction = onView(withId(R.id.post_submit_result_text))
    }
}