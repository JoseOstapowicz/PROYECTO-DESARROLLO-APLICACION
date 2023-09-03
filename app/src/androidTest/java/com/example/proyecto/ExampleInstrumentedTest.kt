package com.example.proyecto

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityInstrumentedTest {
    @Rule
    var activityRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Test
    fun testCompareButton() {
        Espresso.onView(ViewMatchers.withId(R.id.editText1))
            .perform(ViewActions.typeText("abc"))
        Espresso.onView(ViewMatchers.withId(R.id.editText2))
            .perform(ViewActions.typeText("abc"))
        Espresso.onView(ViewMatchers.withId(R.id.buttonCompare))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.textViewResult))
            .check(ViewAssertions.matches(ViewMatchers.withText("Las cadenas son iguales.")))
    }
}
