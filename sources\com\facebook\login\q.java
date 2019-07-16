package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: GetTokenLoginMethodHandler */
class q implements Creator {
    q() {
    }

    public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
        return new GetTokenLoginMethodHandler(parcel);
    }

    public GetTokenLoginMethodHandler[] newArray(int i) {
        return new GetTokenLoginMethodHandler[i];
    }
}
