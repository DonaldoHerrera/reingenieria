package com.google.android.exoplayer2.scheduler;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: Requirements */
class a implements Creator<Requirements> {
    a() {
    }

    public Requirements createFromParcel(Parcel parcel) {
        return new Requirements(parcel.readInt());
    }

    public Requirements[] newArray(int i) {
        return new Requirements[i];
    }
}
