package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: ParcelableSparseArray */
class l implements ClassLoaderCreator<ParcelableSparseArray> {
    l() {
    }

    public ParcelableSparseArray[] newArray(int i) {
        return new ParcelableSparseArray[i];
    }

    public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }

    public ParcelableSparseArray createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, null);
    }
}
