package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: BinaryFrame */
class c implements Creator<BinaryFrame> {
    c() {
    }

    public BinaryFrame createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    public BinaryFrame[] newArray(int i) {
        return new BinaryFrame[i];
    }
}
