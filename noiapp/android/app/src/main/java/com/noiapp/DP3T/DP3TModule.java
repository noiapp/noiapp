package com.noiapp.DP3T;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import org.dpppt.android.sdk.DP3T;
import java.util.Map;
import java.util.HashMap;
public class DP3TModule extends ReactContextBaseJavaModule {
    private final static int REQUEST_ENABLE_BT = 9;
    final String MODULE_NAME = "DP3T";
    private static ReactApplicationContext reactContext;
    @NonNull
    @Override
    public String getName() {
        return MODULE_NAME;
    }
    DP3TModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
        reactContext.addActivityEventListener(activityEventListener);
    }

    @ReactMethod
    public void initDP3t() {
        Activity currentActivity = getCurrentActivity();
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            // Device does not support Bluetooth
        } else if (!mBluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            currentActivity.startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        } else {
            // Bluetooth is enabled
            DP3T.init(reactContext, "com.noiapp");
        }
    }

    private final ActivityEventListener activityEventListener = new BaseActivityEventListener() {
        @Override
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent intent) {
            if (requestCode == REQUEST_ENABLE_BT) {
                if (resultCode == Activity.RESULT_OK) {
                    Toast.makeText(getReactApplicationContext(), "Bluetooth was enabled", Toast.LENGTH_LONG).show();
                    DP3T.init(reactContext, "com.noiapp");
                } else {
                    Toast.makeText(getReactApplicationContext(), "Bluetooth was disabled", Toast.LENGTH_LONG).show();
                }
            }
        }
    };
}