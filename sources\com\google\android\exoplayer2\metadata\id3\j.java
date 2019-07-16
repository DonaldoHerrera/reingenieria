package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: MlltFrame */
class j implements Creator<MlltFrame> {
    j() {
    }

    public MlltFrame createFromParcel(Parcel parcel) {
        return new MlltFrame(parcel);
    }

    public MlltFrame[] newArray(int i) {
        return new MlltFrame[i];
    }
}
