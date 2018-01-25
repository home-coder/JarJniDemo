package com.xiaolj.peripheralservice;

import java.util.List;

/**
 * Created by jiangxj on 18-1-24.
 */

public class GpioDevice {
    public static final int DIRECTION_IN       = 0x1;
    public static final int DIRECTION_OUT      = 0x2;
    public static final int ACTIVE_HIGH        = 0x4;
    public static final int ACTIVE_LOW         = 0x4;
/*    public static final int EDGE_NONE          = 0x8;
    public static final int EDGE_RISING        = 0x16;
    public static final int EDGE_FALLING       = 0x32;
    public static final int EDGE_BOTH          = 0x64;*/



    private static GpioDevice gpioDevice;

    private GpioDevice(){}

    public static GpioDevice getInstance(){
        if(gpioDevice == null){
            gpioDevice = new GpioDevice();
        }
        return gpioDevice;
    }

    public native List<String> native_getGpioList();

    public native GpioDevice native_openGpio(String gpioName);

    public native int native_closeGpio(String gpioName);

    public native int native_setDirection(int gpioDirection);

/*    public native int native_setActiveType(int gpioActive);

    public native int native_setEdgeTriggerType(int gpioTrigger);

    public native int native_registerGpioCallback(xxx);*/
}
