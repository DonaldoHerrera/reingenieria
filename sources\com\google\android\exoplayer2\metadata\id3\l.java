package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: TextInformationFrame */
class l implements Creator<TextInformationFrame> {
    l() {
    }

    public TextInformationFrame createFromParcel(Parcel parcel) {
        return new TextInformationFrame(parcel);
    }

    public TextInformationFrame[] newArray(int i) {
        return new TextInformationFrame[i];
    }
}
