package com.nishtahir.androidrust;

public class MainActivity {
    static {
        System.loadLibrary("hello");
    }

    public static native void invokeCallbackViaJNI(JNICallback callback);
}