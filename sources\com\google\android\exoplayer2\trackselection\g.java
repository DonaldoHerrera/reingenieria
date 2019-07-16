package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride;

/* compiled from: DefaultTrackSelector */
class g implements Creator<SelectionOverride> {
    g() {
    }

    public SelectionOverride createFromParcel(Parcel parcel) {
        return new SelectionOverride(parcel);
    }

    public SelectionOverride[] newArray(int i) {
        return new SelectionOverride[i];
    }
}
