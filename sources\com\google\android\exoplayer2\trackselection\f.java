package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters;

/* compiled from: DefaultTrackSelector */
class f implements Creator<Parameters> {
    f() {
    }

    public Parameters createFromParcel(Parcel parcel) {
        return new Parameters(parcel);
    }

    public Parameters[] newArray(int i) {
        return new Parameters[i];
    }
}
