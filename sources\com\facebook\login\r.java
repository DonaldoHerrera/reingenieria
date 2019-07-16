package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: KatanaProxyLoginMethodHandler */
class r implements Creator<KatanaProxyLoginMethodHandler> {
    r() {
    }

    public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
        return new KatanaProxyLoginMethodHandler(parcel);
    }

    public KatanaProxyLoginMethodHandler[] newArray(int i) {
        return new KatanaProxyLoginMethodHandler[i];
    }
}
