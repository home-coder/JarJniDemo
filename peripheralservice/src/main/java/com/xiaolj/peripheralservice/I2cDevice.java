package com.xiaolj.peripheralservice;

/**
 * Created by jiangxj on 18-1-24.
 */

public class I2cDevice {

    private static I2cDevice i2cDevice;

    private I2cDevice(){}

    public static I2cDevice getInstance(){
        if(i2cDevice == null){
            i2cDevice = new I2cDevice();
        }
        return i2cDevice;
    }

    public static native int read(int a);
}
