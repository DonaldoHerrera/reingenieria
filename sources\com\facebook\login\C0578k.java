package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.login.k reason: case insensitive filesystem */
/* compiled from: DeviceAuthMethodHandler */
class C0578k implements Creator {
    C0578k() {
    }

    public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
        return new DeviceAuthMethodHandler(parcel);
    }

    public DeviceAuthMethodHandler[] newArray(int i) {
        return new DeviceAuthMethodHandler[i];
    }
}
