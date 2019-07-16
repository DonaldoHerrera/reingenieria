package com.soundcloud.android.features.record.filter;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: FadeFilter */
class a implements Creator<FadeFilter> {
    a() {
    }

    public FadeFilter createFromParcel(Parcel parcel) {
        return new FadeFilter(parcel.readInt(), parcel.readLong(), parcel.readInt());
    }

    public FadeFilter[] newArray(int i) {
        return new FadeFilter[i];
    }
}
