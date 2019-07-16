package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: BottomAppBar */
class h implements ClassLoaderCreator<SavedState> {
    h() {
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
