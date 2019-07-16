package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: Metadata */
class a implements Creator<Metadata> {
    a() {
    }

    public Metadata createFromParcel(Parcel parcel) {
        return new Metadata(parcel);
    }

    public Metadata[] newArray(int i) {
        return new Metadata[i];
    }
}
