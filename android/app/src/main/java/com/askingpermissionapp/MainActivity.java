package com.askingpermissionapp;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "AskingPermissionApp";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WritableMap payload = Arguments.createMap();
    payload.putString("test","test");

//    ReactInstanceManager mReactInstanceManager = getReactNativeHost().getReactInstanceManager();
//    mReactInstanceManager.addReactInstanceEventListener(new ReactInstanceManager.ReactInstanceEventListener() {
//      public void onReactContextInitialized(ReactContext validContext) {
//        // Use validContext here
//        validContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
//            .emit("TestEvent",payload);
//      }
//    });
  }
}
