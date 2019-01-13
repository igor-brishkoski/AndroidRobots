package com.example.ibrishkoski.androidtesting

import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class CreatePostActivityTest : BaseTest() {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(CreatePostActivity::class.java)

    @Test
    fun createPost_WithText_Success() {
        createPost {
            enterPostText("Hello World!")
            submitPost()
            matchResultText(mActivityTestRule.activity.getString(R.string.post_submitted))
        }
    }

    @Test
    fun createPost_NoText_Error() {
        createPost {
            enterPostText("")
            submitPost()
            matchResultText(mActivityTestRule.activity.getString(R.string.post_submit_error))
        }
    }
}
