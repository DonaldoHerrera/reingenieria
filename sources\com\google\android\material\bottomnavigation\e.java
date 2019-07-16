package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: BottomNavigationView */
class e implements ClassLoaderCreator<SavedState> {
    e() {
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
