package com.askingpermissionapp

import com.facebook.react.bridge.*
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter

class SendModule (context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {
    private val mReactContext: ReactContext
    override fun getName(): String {
        return "SendModule"
    }

    @ReactMethod
    fun sendEvent() {
        val payload = Arguments.createMap()
        payload.putString("test", "test1")
        mReactContext
                .getJSModule(RCTDeviceEventEmitter::class.java)
                .emit("TestEvent", payload)
    }

    init {
        mReactContext = context
    }
}