package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: GeobFrame */
class g implements Creator<GeobFrame> {
    g() {
    }

    public GeobFrame createFromParcel(Parcel parcel) {
        return new GeobFrame(parcel);
    }

    public GeobFrame[] newArray(int i) {
        return new GeobFrame[i];
    }
}
