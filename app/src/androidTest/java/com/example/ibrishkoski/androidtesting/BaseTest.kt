package com.example.ibrishkoski.androidtesting

import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

abstract class BaseTest {

    val createPost = robotRunner(CreatePostRobot::class)

    private fun <T : BaseRobot> robotRunner(cls: KClass<T>) = { func: T.() -> Unit ->
        cls.createInstance().apply {
            func()
        }
    }
}