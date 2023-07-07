/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.example.musiclist

import android.R.*
import android.view.LayoutInflater
import android.view.View
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.Before
import org.junit.Rule
import org.junit.Test


//@RunWith(AndroidJUnit::class)
class MainActivityTest {
  //@OptIn(ExperimentalMaterial3Api::class)
  //@get:Rule
  //var activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java, false, false)

  @OptIn(ExperimentalMaterial3Api::class)
  @get:Rule
  var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

  @Before
  fun before() {
    InstrumentationRegistry.getInstrumentation().uiAutomation
  }

  @OptIn(ExperimentalMaterial3Api::class)
  @Test
  fun testScreenshotEntireActivity() {
    activityScenarioRule.scenario.onActivity { activity->
        Screenshot.snapActivity(activity).record()
      }
  }

  @get:Rule
  val composeRule = createComposeRule()

  @OptIn(ExperimentalMaterial3Api::class)
  @Test
  fun testTopBar() {
    composeRule.setContent {
      MusicTopBar()
    }
    //
  }

/*
  @OptIn(ExperimentalMaterial3Api::class)
  @Test
  fun testTopBar() {
    val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
    val inflater = LayoutInflater.from(targetContext)
    val view = inflater.inflate(R.layout.activity_main, null, false)
    val composeView = view.findViewById<View>(R.id.compose_view) as ComposeView
    composeView.setContent {
      MusicTopBar()
    }
    ViewHelpers.setupView(composeView).setExactWidthDp(300).layout()
    Screenshot.snap(composeView).record()
  }

 */
/*
  @OptIn(ExperimentalMaterial3Api::class)
  @Test
  @Throws(Throwable::class)
  fun testScreenshotTopBar() {
    /*
    val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
    val inflater = LayoutInflater.from(targetContext)
    val view = inflater.inflate(R.layout.activity_main, null, false)
    val composeView = view.findViewById<View>(R.id.compose_view) as ComposeView
    composeView.setContent {
      MusicTopBar()
    }
    ViewHelpers.setupView(composeView).setExactWidthDp(300).layout()
    Screenshot.snap(composeView).record()
    val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
    val inflater = LayoutInflater.from(targetContext)
    val view = inflater.inflate(R.layout.activity_main, null, false)
    val composeView = view.findViewById<View>(R.id.compose_view) as ComposeView
    composeView.setContent {
        MusicTopBar()
    }
    ViewHelpers.setupView(composeView).setExactWidthDp(300).layout()
    Screenshot.snap(composeView).record()

     */

    /*
    val context = InstrumentationRegistry.getInstrumentation().targetContext
    val composeView = ComposeView(context).apply {
      setContent {
        MusicTopBar()
      }
      layoutParams = ViewGroup.LayoutParams(300, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
    Screenshot.snap(composeView).record()
     */
  /*
    val viewTreeObserver = composeView.viewTreeObserver
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
      override fun onGlobalLayout() {
        viewTreeObserver.removeOnGlobalLayoutListener(this)
        android.os.Handler().postDelayed({
          val screenshotName = "testTopBar_${System.currentTimeMillis()}.png"
          Screenshot.snap(composeView).setName(screenshotName).record()
        }, 500)
      }
    })*/
    /*
    val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
    val inflater = LayoutInflater.from(targetContext)
    val view = inflater.inflate(R.layout.activity_main, null, false)
    ViewHelpers.setupView(view)
      .setExactWidthDp(300)
      .layout()

    Screenshot.snap(view)
      .record()

     */

    /*
    val activity = activityTestRule.launchActivity(null)
    composeTestRule.setContent {
      MusicListTheme {
        MusicApp()
      }
    }
    composeTestRule.onNodeWithText("Song 1").performClick()
     */
  }
 */
  
}





/*
  @Test
  fun mainActivityTestSettingsOpen() {
    val activity = activityTestRule.launchActivity(null)
    val floatingActionButton = onView(allOf<View>(withId(R.id.fab), isDisplayed()))
    floatingActionButton.perform(click())

    openActionBarOverflowOrOptionsMenu(activity)
    Screenshot.snapActivity(activity).record()
  }
 */