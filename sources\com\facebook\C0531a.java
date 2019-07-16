package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.a reason: case insensitive filesystem */
/* compiled from: AccessToken */
class C0531a implements Creator {
    C0531a() {
    }

    public AccessToken createFromParcel(Parcel parcel) {
        return new AccessToken(parcel);
    }

    public AccessToken[] newArray(int i) {
        return new AccessToken[i];
    }
}
