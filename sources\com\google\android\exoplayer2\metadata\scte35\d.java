package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: SpliceNullCommand */
class d implements Creator<SpliceNullCommand> {
    d() {
    }

    public SpliceNullCommand createFromParcel(Parcel parcel) {
        return new SpliceNullCommand();
    }

    public SpliceNullCommand[] newArray(int i) {
        return new SpliceNullCommand[i];
    }
}
