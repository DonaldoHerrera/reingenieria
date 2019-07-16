package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: MdtaMetadataEntry */
class i implements Creator<MdtaMetadataEntry> {
    i() {
    }

    public MdtaMetadataEntry createFromParcel(Parcel parcel) {
        return new MdtaMetadataEntry(parcel, null);
    }

    public MdtaMetadataEntry[] newArray(int i) {
        return new MdtaMetadataEntry[i];
    }
}
