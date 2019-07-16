package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: TrackGroupArray */
class B implements Creator<TrackGroupArray> {
    B() {
    }

    public TrackGroupArray createFromParcel(Parcel parcel) {
        return new TrackGroupArray(parcel);
    }

    public TrackGroupArray[] newArray(int i) {
        return new TrackGroupArray[i];
    }
}
