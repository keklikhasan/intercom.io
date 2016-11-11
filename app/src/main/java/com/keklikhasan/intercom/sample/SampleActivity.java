package com.keklikhasan.intercom.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.intercom.android.sdk.Intercom;

public class SampleActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Intercom.client().registerUnidentifiedUser();
    Intercom.client().setLauncherVisibility(Intercom.Visibility.VISIBLE);
  }
}
