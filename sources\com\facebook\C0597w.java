package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.w reason: case insensitive filesystem */
/* compiled from: FacebookRequestError */
class C0597w implements Creator<FacebookRequestError> {
    C0597w() {
    }

    public FacebookRequestError createFromParcel(Parcel parcel) {
        return new FacebookRequestError(parcel, (C0597w) null);
    }

    public FacebookRequestError[] newArray(int i) {
        return new FacebookRequestError[i];
    }
}
