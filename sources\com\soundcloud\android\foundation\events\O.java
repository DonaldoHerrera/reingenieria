package com.soundcloud.android.foundation.events;

/* compiled from: UserProperty.kt */
public enum O {
    SUBSCRIPTION_STATUS("subscription_status"),
    ANDROID_VERSION_CODE("android_version_code"),
    UNIQUE_DEVICE_ID("unique_device_id");
    
    private final String e;

    private O(String str) {
        this.e = str;
    }

    public final String a() {
        return this.e;
    }
}
