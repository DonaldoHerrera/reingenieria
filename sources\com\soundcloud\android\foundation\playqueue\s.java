package com.soundcloud.android.foundation.playqueue;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PlaySessionSource */
class s implements Creator<PlaySessionSource> {
    s() {
    }

    public PlaySessionSource createFromParcel(Parcel parcel) {
        return new PlaySessionSource(parcel);
    }

    public PlaySessionSource[] newArray(int i) {
        return new PlaySessionSource[i];
    }
}
