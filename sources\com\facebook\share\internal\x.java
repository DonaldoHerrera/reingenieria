package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: LikeContent */
class x implements Creator<LikeContent> {
    x() {
    }

    public LikeContent createFromParcel(Parcel parcel) {
        return new LikeContent(parcel);
    }

    public LikeContent[] newArray(int i) {
        return new LikeContent[i];
    }
}
