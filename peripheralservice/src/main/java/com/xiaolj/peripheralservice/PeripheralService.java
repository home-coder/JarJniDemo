package com.xiaolj.peripheralservice;

/**
 * Created by jiangxj on 18-1-24.
 */

public class PeripheralService {
    static{
        System.loadLibrary("peripheral_jni");
    }
    public I2cDevice openI2cDevice() {
        return I2cDevice.getInstance();
    }

    public GpioDevice openGpioDevice() {
        return GpioDevice.getInstance();
    }

    public PwmDevice openPwmDevice() {
        return PwmDevice.getInstance();
    }

    public UartDevice openUartDevice() {
        return UartDevice.getInstance();
    }
}
