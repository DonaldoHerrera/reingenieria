package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: Format */
class A implements Creator<Format> {
    A() {
    }

    public Format createFromParcel(Parcel parcel) {
        return new Format(parcel);
    }

    public Format[] newArray(int i) {
        return new Format[i];
    }
}
