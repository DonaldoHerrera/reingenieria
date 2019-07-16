package com.soundcloud.android.sync;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: SyncJobResult */
class X implements Creator<SyncJobResult> {
    X() {
    }

    public SyncJobResult createFromParcel(Parcel parcel) {
        return new SyncJobResult(parcel, null);
    }

    public SyncJobResult[] newArray(int i) {
        return new SyncJobResult[i];
    }
}
