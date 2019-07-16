package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ApicFrame */
class b implements Creator<ApicFrame> {
    b() {
    }

    public ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    public ApicFrame[] newArray(int i) {
        return new ApicFrame[i];
    }
}
