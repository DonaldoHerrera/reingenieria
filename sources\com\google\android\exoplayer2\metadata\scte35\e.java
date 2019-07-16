package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: SpliceScheduleCommand */
class e implements Creator<SpliceScheduleCommand> {
    e() {
    }

    public SpliceScheduleCommand createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel, null);
    }

    public SpliceScheduleCommand[] newArray(int i) {
        return new SpliceScheduleCommand[i];
    }
}
