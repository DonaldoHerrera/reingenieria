package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: TrackGroup */
class A implements Creator<TrackGroup> {
    A() {
    }

    public TrackGroup createFromParcel(Parcel parcel) {
        return new TrackGroup(parcel);
    }

    public TrackGroup[] newArray(int i) {
        return new TrackGroup[i];
    }
}
