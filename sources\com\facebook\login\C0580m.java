package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.login.m reason: case insensitive filesystem */
/* compiled from: FacebookLiteLoginMethodHandler */
class C0580m implements Creator<FacebookLiteLoginMethodHandler> {
    C0580m() {
    }

    public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
        return new FacebookLiteLoginMethodHandler(parcel);
    }

    public FacebookLiteLoginMethodHandler[] newArray(int i) {
        return new FacebookLiteLoginMethodHandler[i];
    }
}
