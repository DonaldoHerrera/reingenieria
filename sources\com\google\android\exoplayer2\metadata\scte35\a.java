package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PrivateCommand */
class a implements Creator<PrivateCommand> {
    a() {
    }

    public PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel, null);
    }

    public PrivateCommand[] newArray(int i) {
        return new PrivateCommand[i];
    }
}
