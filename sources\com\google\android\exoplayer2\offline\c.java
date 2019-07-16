package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: StreamKey */
class c implements Creator<StreamKey> {
    c() {
    }

    public StreamKey createFromParcel(Parcel parcel) {
        return new StreamKey(parcel);
    }

    public StreamKey[] newArray(int i) {
        return new StreamKey[i];
    }
}
