package com.example.ibrishkoski.androidtesting

import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers

fun ViewInteraction.click(): ViewInteraction =
    perform(ViewActions.click())

fun ViewInteraction.typeText(text: String): ViewInteraction =
    perform(ViewActions.typeText(text), ViewActions.closeSoftKeyboard())

fun ViewInteraction.isTextDisplayed(text: String): ViewInteraction =
    check(ViewAssertions.matches(ViewMatchers.withText(text)))
