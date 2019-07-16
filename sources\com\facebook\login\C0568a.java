package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.login.a reason: case insensitive filesystem */
/* compiled from: CustomTabLoginMethodHandler */
class C0568a implements Creator {
    C0568a() {
    }

    public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
        return new CustomTabLoginMethodHandler(parcel);
    }

    public CustomTabLoginMethodHandler[] newArray(int i) {
        return new CustomTabLoginMethodHandler[i];
    }
}
