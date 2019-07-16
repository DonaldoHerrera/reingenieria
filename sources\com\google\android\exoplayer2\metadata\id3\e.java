package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ChapterTocFrame */
class e implements Creator<ChapterTocFrame> {
    e() {
    }

    public ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    public ChapterTocFrame[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
