package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: DrmInitData */
class k implements Creator<DrmInitData> {
    k() {
    }

    public DrmInitData createFromParcel(Parcel parcel) {
        return new DrmInitData(parcel);
    }

    public DrmInitData[] newArray(int i) {
        return new DrmInitData[i];
    }
}
