/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_xiaolj_peripheralservice_GpioDevice */

#ifndef _Included_com_xiaolj_peripheralservice_GpioDevice
#define _Included_com_xiaolj_peripheralservice_GpioDevice
#ifdef __cplusplus
extern "C" {
#endif
#undef com_xiaolj_peripheralservice_GpioDevice_DIRECTION_IN
#define com_xiaolj_peripheralservice_GpioDevice_DIRECTION_IN 1L
#undef com_xiaolj_peripheralservice_GpioDevice_DIRECTION_OUT
#define com_xiaolj_peripheralservice_GpioDevice_DIRECTION_OUT 2L
#undef com_xiaolj_peripheralservice_GpioDevice_ACTIVE_HIGH
#define com_xiaolj_peripheralservice_GpioDevice_ACTIVE_HIGH 4L
#undef com_xiaolj_peripheralservice_GpioDevice_ACTIVE_LOW
#define com_xiaolj_peripheralservice_GpioDevice_ACTIVE_LOW 4L
/*
 * Class:     com_xiaolj_peripheralservice_GpioDevice
 * Method:    native_getGpioList
 * Signature: ()Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_com_xiaolj_peripheralservice_GpioDevice_native_1getGpioList
  (JNIEnv *, jobject);

/*
 * Class:     com_xiaolj_peripheralservice_GpioDevice
 * Method:    native_openGpio
 * Signature: (Ljava/lang/String;)Lcom/xiaolj/peripheralservice/GpioDevice;
 */
JNIEXPORT jobject JNICALL Java_com_xiaolj_peripheralservice_GpioDevice_native_1openGpio
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_xiaolj_peripheralservice_GpioDevice
 * Method:    native_closeGpio
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_xiaolj_peripheralservice_GpioDevice_native_1closeGpio
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_xiaolj_peripheralservice_GpioDevice
 * Method:    native_setDirection
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_xiaolj_peripheralservice_GpioDevice_native_1setDirection
  (JNIEnv *, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif
