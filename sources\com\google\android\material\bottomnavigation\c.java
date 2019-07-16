package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: BottomNavigationPresenter */
class c implements Creator<SavedState> {
    c() {
    }

    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
