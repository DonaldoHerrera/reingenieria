package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: IcyHeaders */
class b implements Creator<IcyHeaders> {
    b() {
    }

    public IcyHeaders createFromParcel(Parcel parcel) {
        return new IcyHeaders(parcel);
    }

    public IcyHeaders[] newArray(int i) {
        return new IcyHeaders[i];
    }
}
