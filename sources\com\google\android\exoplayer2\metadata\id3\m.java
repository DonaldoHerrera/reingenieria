package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: UrlLinkFrame */
class m implements Creator<UrlLinkFrame> {
    m() {
    }

    public UrlLinkFrame createFromParcel(Parcel parcel) {
        return new UrlLinkFrame(parcel);
    }

    public UrlLinkFrame[] newArray(int i) {
        return new UrlLinkFrame[i];
    }
}
