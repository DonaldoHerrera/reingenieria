package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: IcyInfo */
class c implements Creator<IcyInfo> {
    c() {
    }

    public IcyInfo createFromParcel(Parcel parcel) {
        return new IcyInfo(parcel);
    }

    public IcyInfo[] newArray(int i) {
        return new IcyInfo[i];
    }
}
