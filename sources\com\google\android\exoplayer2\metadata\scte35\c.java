package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: SpliceInsertCommand */
class c implements Creator<SpliceInsertCommand> {
    c() {
    }

    public SpliceInsertCommand createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel, null);
    }

    public SpliceInsertCommand[] newArray(int i) {
        return new SpliceInsertCommand[i];
    }
}
