package com.example.appproyecto

import android.view.KeyEvent
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompararTextosUI() {

        // El texto que se va a escribir en los editText
        onView(withId(R.id.editText1)).perform(typeText("Texto1"))
        onView(withId(R.id.editText2)).perform(typeText("Texto1"))

        // Cierra el teclado presionando la tecla de retroceso
        onView(withId(R.id.editText2)).perform(pressKey(KeyEvent.KEYCODE_BACK))

        // Clickea el botón y compara el resultado con el esperado
        onView(withId(R.id.buttonComparar)).perform(click())
        onView(withId(R.id.textViewResultado)).check(matches(withText("Los textos son iguales")))
    }
}

