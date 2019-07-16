package com.google.android.material.stateful;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: ExtendableSavedState */
class a implements ClassLoaderCreator<ExtendableSavedState> {
    a() {
    }

    public ExtendableSavedState[] newArray(int i) {
        return new ExtendableSavedState[i];
    }

    public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ExtendableSavedState(parcel, classLoader, null);
    }

    public ExtendableSavedState createFromParcel(Parcel parcel) {
        return new ExtendableSavedState(parcel, null, null);
    }
}
