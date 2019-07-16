package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: WebViewLoginMethodHandler */
class O implements Creator<WebViewLoginMethodHandler> {
    O() {
    }

    public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
        return new WebViewLoginMethodHandler(parcel);
    }

    public WebViewLoginMethodHandler[] newArray(int i) {
        return new WebViewLoginMethodHandler[i];
    }
}
