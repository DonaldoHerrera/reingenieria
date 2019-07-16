package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: InternalFrame */
class i implements Creator<InternalFrame> {
    i() {
    }

    public InternalFrame createFromParcel(Parcel parcel) {
        return new InternalFrame(parcel);
    }

    public InternalFrame[] newArray(int i) {
        return new InternalFrame[i];
    }
}
