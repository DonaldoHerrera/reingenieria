package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ChapterFrame */
class d implements Creator<ChapterFrame> {
    d() {
    }

    public ChapterFrame createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    public ChapterFrame[] newArray(int i) {
        return new ChapterFrame[i];
    }
}
