package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: TrackSelectionParameters */
class n implements Creator<TrackSelectionParameters> {
    n() {
    }

    public TrackSelectionParameters createFromParcel(Parcel parcel) {
        return new TrackSelectionParameters(parcel);
    }

    public TrackSelectionParameters[] newArray(int i) {
        return new TrackSelectionParameters[i];
    }
}
