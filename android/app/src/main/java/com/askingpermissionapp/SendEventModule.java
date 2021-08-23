package com.askingpermissionapp;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class SendEventModule extends ReactContextBaseJavaModule {
    private ReactContext mReactContext;

    SendEventModule(ReactApplicationContext context) {
        super(context);
        mReactContext = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "SendEventModule";
    }

    @ReactMethod
    public void sendEvent() {
        WritableMap payload = Arguments.createMap();
        payload.putString("test", "test1");
        mReactContext
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit("TestEvent",payload);

    }
}
