package com.castd1;

import com.facebook.react.ReactActivity;
import com.facebook.react.GoogleCastActivity;

public class MainActivity extends GoogleCastActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "castD1";
  }
}
