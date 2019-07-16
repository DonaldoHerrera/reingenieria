package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: Profile */
class Q implements Creator<Profile> {
    Q() {
    }

    public Profile createFromParcel(Parcel parcel) {
        return new Profile(parcel, null);
    }

    public Profile[] newArray(int i) {
        return new Profile[i];
    }
}
