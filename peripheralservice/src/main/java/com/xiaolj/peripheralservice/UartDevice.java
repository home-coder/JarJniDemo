package com.xiaolj.peripheralservice;

/**
 * Created by jiangxj on 18-1-24.
 */

public class UartDevice {


    private static UartDevice uartDevice;

    private UartDevice(){}

    public static UartDevice getInstance(){
        if(uartDevice == null){
            uartDevice = new UartDevice();
        }
        return uartDevice;
    }

    public static native int read(int a);
}
