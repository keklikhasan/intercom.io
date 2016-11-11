package com.keklikhasan.intercom.sample;

import android.app.Application;

import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.logger.IntercomLogger;

public class SampleApplication extends Application {
  //----------------------------------------------------------------------------------------------
  // You need to enter your API key and app ID here to use Intercom for Android
  // To get these keys go to https://app.intercom.io/a/apps/_/settings/android and follow the step-up guide
  //----------------------------------------------------------------------------------------------
  static final String YOUR_API_KEY = "";
  static final String YOUR_APP_ID = "";

  @Override
  public void onCreate() {
    super.onCreate();
    Intercom.setLogLevel(IntercomLogger.VERBOSE);
    Intercom.initialize(this, YOUR_API_KEY, YOUR_APP_ID);
  }
}