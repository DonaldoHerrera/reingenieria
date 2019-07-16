package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ColorInfo */
class i implements Creator<ColorInfo> {
    i() {
    }

    public ColorInfo createFromParcel(Parcel parcel) {
        return new ColorInfo(parcel);
    }

    public ColorInfo[] newArray(int i) {
        return new ColorInfo[i];
    }
}
