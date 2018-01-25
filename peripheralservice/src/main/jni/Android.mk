#Android.mk
LOCAL_PATH := $(call my-dir)

#自己的编译模块
include $(CLEAR_VARS)
LOCAL_MODULE    := peripheral_jni
LOCAL_SRC_FILES := GpioDevice.cpp \
                   I2cDevice.cpp \
                   PwmDevice.cpp \
                   UartDevice.cpp
LOCAL_LDLIBS    += -L$(SYSROOT)/lib -llog
LOCAL_CFLAGS    := -g

include $(BUILD_SHARED_LIBRARY)
