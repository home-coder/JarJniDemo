package com.xiaolj.jarjnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xiaolj.peripheralservice.*;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    int ret = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeripheralService pmanager = new PeripheralService();
        I2cDevice i2cDevice = pmanager.openI2cDevice();
        ret = i2cDevice.read(3);
        Log.e(TAG, "onCreate: i2c = " + ret );

        GpioDevice gpioDevice = pmanager.openGpioDevice();
        ret = gpioDevice.native_setDirection(5);
        Log.e(TAG, "onCreate: gpio = " + ret);
    }
}
