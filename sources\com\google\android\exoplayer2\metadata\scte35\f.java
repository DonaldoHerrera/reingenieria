package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: TimeSignalCommand */
class f implements Creator<TimeSignalCommand> {
    f() {
    }

    public TimeSignalCommand createFromParcel(Parcel parcel) {
        TimeSignalCommand timeSignalCommand = new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        return timeSignalCommand;
    }

    public TimeSignalCommand[] newArray(int i) {
        return new TimeSignalCommand[i];
    }
}
