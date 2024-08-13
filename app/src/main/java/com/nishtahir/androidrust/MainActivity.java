package com.nishtahir.androidrust;

class MainActivity {
    static {
        System.loadLibrary("rust");
    }

    public static native void invokeCallbackViaJNI(JNICallback callback);
}