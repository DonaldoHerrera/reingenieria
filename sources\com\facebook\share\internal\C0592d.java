package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.share.internal.d reason: case insensitive filesystem */
/* compiled from: DeviceShareDialogFragment */
class C0592d implements Creator<RequestState> {
    C0592d() {
    }

    public RequestState createFromParcel(Parcel parcel) {
        return new RequestState(parcel);
    }

    public RequestState[] newArray(int i) {
        return new RequestState[i];
    }
}
