package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

class JniNativeApi implements d {
    static {
        System.loadLibrary("crashlytics");
    }

    JniNativeApi() {
    }

    private native boolean nativeInit(String str, Object obj);

    public boolean a(String str, AssetManager assetManager) {
        return nativeInit(str, assetManager);
    }
}
