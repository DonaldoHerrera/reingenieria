package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: CommentFrame */
class f implements Creator<CommentFrame> {
    f() {
    }

    public CommentFrame createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    public CommentFrame[] newArray(int i) {
        return new CommentFrame[i];
    }
}
