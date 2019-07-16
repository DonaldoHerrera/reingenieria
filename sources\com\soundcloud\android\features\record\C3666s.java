package com.soundcloud.android.features.record;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.soundcloud.android.features.record.s reason: case insensitive filesystem */
/* compiled from: AmplitudeData */
class C3666s implements Creator<AmplitudeData> {
    C3666s() {
    }

    public AmplitudeData createFromParcel(Parcel parcel) {
        return new AmplitudeData(parcel);
    }

    public AmplitudeData[] newArray(int i) {
        return new AmplitudeData[i];
    }
}
