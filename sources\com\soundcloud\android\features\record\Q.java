package com.soundcloud.android.features.record;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: Recording */
class Q implements Creator<Recording> {
    Q() {
    }

    public Recording createFromParcel(Parcel parcel) {
        return new Recording(parcel);
    }

    public Recording[] newArray(int i) {
        return new Recording[i];
    }
}
