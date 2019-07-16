package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PrivFrame */
class k implements Creator<PrivFrame> {
    k() {
    }

    public PrivFrame createFromParcel(Parcel parcel) {
        return new PrivFrame(parcel);
    }

    public PrivFrame[] newArray(int i) {
        return new PrivFrame[i];
    }
}
