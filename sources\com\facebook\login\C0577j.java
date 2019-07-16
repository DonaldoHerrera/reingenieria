package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.login.j reason: case insensitive filesystem */
/* compiled from: DeviceAuthDialog */
class C0577j implements Creator<RequestState> {
    C0577j() {
    }

    public RequestState createFromParcel(Parcel parcel) {
        return new RequestState(parcel);
    }

    public RequestState[] newArray(int i) {
        return new RequestState[i];
    }
}
