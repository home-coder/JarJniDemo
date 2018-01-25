package com.xiaolj.peripheralservice;

/**
 * Created by jiangxj on 18-1-24.
 */

public class PwmDevice {

    private static PwmDevice pwmDevice;

    private PwmDevice(){}

    public static PwmDevice getInstance(){
        if(pwmDevice == null){
            pwmDevice = new PwmDevice();
        }
        return pwmDevice;
    }

    public static native int read(int a);
}
