package com.noiapp.DP3T;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.dpppt.android.sdk.DP3T;

import java.util.Map;
import java.util.HashMap;

public class DP3TModule extends ReactContextBaseJavaModule {

    final String MODULE_NAME = "DP3T";
    private static ReactApplicationContext reactContext;

    @NonNull
    @Override
    public String getName() {
        return MODULE_NAME;
    }

    DP3TModule(ReactApplicationContext context){
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void init(String message) {
        DP3T.init(reactContext, "com.noiapp");
    }
}
