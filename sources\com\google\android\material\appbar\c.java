package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: AppBarLayout */
class c implements ClassLoaderCreator<SavedState> {
    c() {
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }

    public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }
}
