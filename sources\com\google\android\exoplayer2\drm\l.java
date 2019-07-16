package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;

/* compiled from: DrmInitData */
class l implements Creator<SchemeData> {
    l() {
    }

    public SchemeData createFromParcel(Parcel parcel) {
        return new SchemeData(parcel);
    }

    public SchemeData[] newArray(int i) {
        return new SchemeData[i];
    }
}
