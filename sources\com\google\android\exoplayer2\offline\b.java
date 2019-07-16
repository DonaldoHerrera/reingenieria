package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: DownloadRequest */
class b implements Creator<DownloadRequest> {
    b() {
    }

    public DownloadRequest createFromParcel(Parcel parcel) {
        return new DownloadRequest(parcel);
    }

    public DownloadRequest[] newArray(int i) {
        return new DownloadRequest[i];
    }
}
